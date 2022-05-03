package dao;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import model.Venda;

public class DaoVenda implements Serializable {
    
    private EntityManagerFactory emf = null;
    
    /* construtor */
    public DaoVenda(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    /* método utilizado para criar objetos no banco */
    public void create(Venda venda){
        EntityManager em = null;
        try {
            /* cria uma entidade EntityManager para utilizarmos na transação */
            em = this.emf.createEntityManager();
            
            /* inicia a transação */
            em.getTransaction().begin();
            
            /* método utilizado para persistir o objeto no banco */
            em.persist(venda);
            
            /* comita a transação no banco */
            em.getTransaction().commit();
        
        /* tratamento de exceções */
        } catch (Exception ex) {
            if (findVenda(venda.getCodvenda()) != null) {
                System.out.println("Venda " + venda + " already exists.");
            }

            throw ex;

        } finally {
            if (em != null) {
                
                /* após a operação, a transação é finalizada */
                em.close();

            }
        }
    }
    
    /* método utilizado para editar objetos do banco */
    public void edit(Venda venda) {
        EntityManager em = null;
        try {
            /* cria uma entidade EntityManager para utilizarmos na transação */
            em = this.emf.createEntityManager();

            /* inicia a transação */
            em.getTransaction().begin();

            /* método utilizado para alterar o objeto no banco */
            venda = em.merge(venda);

            /* comita a transação no banco */
            em.getTransaction().commit();
        
        /* tratamento de exceções */
        } catch (Exception ex) {
            
            int id = venda.getCodvenda();
            if (findVenda(id) == null) {
                System.out.println("The venda with id " + id + " no longer exists.");
                System.out.println(ex.toString());
            }
            
            throw ex;

        } finally {
            if (em != null) {
                
                /* após a operação, a transação é finalizada */
                em.close();

            }
        }
    }
    
    /* método utilizado para remover objetos do banco */
    public void destroy(int id){
        EntityManager em = null;
        try {
            em = this.emf.createEntityManager();
            em.getTransaction().begin();
            Venda venda;
            try {
                /* recupera a referência do objeto a ser removido */
                venda = em.getReference(Venda.class, id);
                
                /* método utilizado para remover a venda do banco */
                em.remove(venda);

                em.getTransaction().commit();

            } catch (Exception ex) {

                System.out.println("The venda with id " + id + " no longer exists.");
            }
            
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
    /* método utilizado para recuperar uma venda pelo seu id */
    public Venda findVenda(int id) {
        EntityManager em = this.emf.createEntityManager();
        try {
            return em.find(Venda.class, id);
        } finally {
            em.close();
        }
    }
    
    /* método utilizado para recuperar todas as vendas da base */
    public List<Venda> findAllVenda() {
        EntityManager em = this.emf.createEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            
            /* métodos utilizados para criar a consulta */
            cq.select(cq.from(Venda.class));
            Query q = em.createQuery(cq);
            
            return q.getResultList();

        } finally {
            em.close();
        }
    }
}
