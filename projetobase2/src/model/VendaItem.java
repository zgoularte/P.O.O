package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "vendaitem")
public class VendaItem {
    
    @EmbeddedId
    VendaItemId vendaItemId;
    
    @Column(name = "quantidade")
    private double quantidade;
    
    @OneToOne
    @JoinColumn(name = "codproduto", referencedColumnName = "codproduto")
    private Produto produto;

    public VendaItem(int codvenda, int codvendaitem, double quantidade, Produto produto) {
        this.vendaItemId    = new VendaItemId(codvenda, codvendaitem);
        this.quantidade     = quantidade;
        this.produto        = produto;
    }
    
    public VendaItem(){}

    public VendaItemId getVendaItemId() {
        return vendaItemId;
    }

    public int getCodVenda() {
        return this.vendaItemId.getCodvenda();
    }

    public int getCodVendaItem() {
        return this.vendaItemId.getCodvendaitem();
    }

    public void setVendaItemId(VendaItemId vendaItemId) {
        this.vendaItemId = vendaItemId;
    }
    
    public double getQuantidade() {
        return quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}

@Embeddable
class VendaItemId implements Serializable {
    private int codvenda;
    private int codvendaitem;

    public VendaItemId(int codvenda, int codvendaitem) {
        this.codvenda = codvenda;
        this.codvendaitem = codvendaitem;
    }

    public VendaItemId(){}

    public int getCodvenda() {
        return codvenda;
    }

    public int getCodvendaitem() {
        return codvendaitem;
    }

    public void setCodvenda(int codvenda) {
        this.codvenda = codvenda;
    }

    public void setCodvendaitem(int codvendaitem) {
        this.codvendaitem = codvendaitem;
    }
}
