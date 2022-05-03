package model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "venda")
public class Venda {
    
    @Id
    @Column(name = "codvenda")
    private int codvenda;
    
    @Column(name = "totalvenda")
    private double totalVenda;
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "codvenda", referencedColumnName = "codvenda")
    private List<VendaItem> vendaItens = new ArrayList<>();

    public Venda(int codvenda, double totalVenda) {
        this.codvenda = codvenda;
        this.totalVenda = totalVenda;
    }
    
    public Venda(){}

    public int getCodvenda() {
        return codvenda;
    }

    public double getTotalvenda() {
        return totalVenda;
    }

    public List<VendaItem> getVendaItens() {
        return vendaItens;
    }

    public void setCodvenda(int codvenda) {
        this.codvenda = codvenda;
    }

    public void setTotalvenda(double totalVenda) {
        this.totalVenda = totalVenda;
    }

    public void setVendaItens(List<VendaItem> vendaItens) {
        this.vendaItens = vendaItens;
    }
}