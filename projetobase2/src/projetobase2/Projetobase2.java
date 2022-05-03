package projetobase2;

import dao.DaoProduto;
import dao.DaoVenda;
import model.Produto;
import model.Venda;
import model.VendaItem;
import util.EntityManagerUtil;

public class Projetobase2 {


    public static void main(String[] args) throws Exception {
        
        /* recuperação de produtos */
        DaoProduto daoProduto = new DaoProduto(EntityManagerUtil.getEntityManagerFactory());
        Produto produto1 = daoProduto.findProduto(4);
        Produto produto2 = daoProduto.findProduto(5);
        /* --- */

        /* criação de itens de venda */
        VendaItem vi1 = new VendaItem(1, 1, 2, produto1);
        VendaItem vi2 = new VendaItem(1, 2, 2, produto2);
        
        DaoVenda daoVenda = new DaoVenda(EntityManagerUtil.getEntityManagerFactory());

        /* criação de venda */
        Venda venda = new Venda(1, 0);
        venda.getVendaItens().add(vi1);
        venda.getVendaItens().add(vi2);
        daoVenda.create(venda);
        /* --- */
        /* --- */
        
        /* recupera a venda */
        Venda venda2 = daoVenda.findVenda(1);
        System.out.println(venda2.getCodvenda() + " " + venda2.getTotalvenda());
        
        for(VendaItem vd : venda2.getVendaItens()){
            System.out.println(vd.getCodVenda() + " " + vd.getCodVendaItem());            
            System.out.println(vd.getQuantidade());
            System.out.println(vd.getProduto().getNome());
        }
        /* --- */

    }
    
}
