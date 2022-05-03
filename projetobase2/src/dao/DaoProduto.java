package dao;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import model.Produto;

public class DaoProduto implements Serializable {
    
    private EntityManagerFactory emf = null;
    
    /* construtor */
    public DaoProduto(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    /* método utilizado para criar objetos no banco */
    public void create(Produto produto){
        EntityManager em = null;
        try {
            /* cria uma entidade EntityManager para utilizarmos na transação */
            em = this.emf.createEntityManager();
            
            /* inicia a transação */
            em.getTransaction().begin();
            
            /* método utilizado para persistir o objeto no banco */
            em.persist(produto);
            
            /* comita a transação no banco */
            em.getTransaction().commit();
        
        /* tratamento de exceções */
        } catch (Exception ex) {
            if (findProduto(produto.getCodproduto()) != null) {
                System.out.println("Produto " + produto + " already exists.");
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
    public void edit(Produto produto) {
        EntityManager em = null;
        try {
            /* cria uma entidade EntityManager para utilizarmos na transação */
            em = this.emf.createEntityManager();

            /* inicia a transação */
            em.getTransaction().begin();

            /* método utilizado para alterar o objeto no banco */
            produto = em.merge(produto);

            /* comita a transação no banco */
            em.getTransaction().commit();
        
        /* tratamento de exceções */
        } catch (Exception ex) {
            
            int id = produto.getCodproduto();
            if (findProduto(id) == null) {
                System.out.println("The produto with id " + id + " no longer exists.");
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
            Produto produto;
            try {
                /* recupera a referência do objeto a ser removido */
                produto = em.getReference(Produto.class, id);
                
                /* método utilizado para remover o produto do banco */
                em.remove(produto);

                em.getTransaction().commit();

            } catch (Exception ex) {

                System.out.println("The produto with id " + id + " no longer exists.");
            }
            
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
    /* método utilizado para recuperar um produto pelo seu id */
    public Produto findProduto(int id) {
        EntityManager em = this.emf.createEntityManager();
        try {
            return em.find(Produto.class, id);
        } finally {
            em.close();
        }
    }
    
    /* método utilizado para recuperar todos os produtos da base */
    public List<Produto> findAllProduto() {
        EntityManager em = this.emf.createEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            
            /* métodos utilizados para criar a consulta */
            cq.select(cq.from(Produto.class));
            Query q = em.createQuery(cq);
            
            return q.getResultList();

        } finally {
            em.close();
        }
    }
   
}
