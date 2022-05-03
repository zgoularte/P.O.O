package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="produto")
public class Produto implements Serializable {
    
    @Id
    @Column(name="codproduto")
    private int codproduto;
    
    @Column(name="nome")
    private String nome;
    
    @Column(name="descricao")
    private String descricao;
    
    @Column(name="preco")
    private double preco;

    public Produto(int codproduto, String nome, String descricao, double preco) {
        this.codproduto = codproduto;
        this.nome       = nome;
        this.descricao  = descricao;
        this.preco      = preco;
    }
    
    public Produto(){}

    public int getCodproduto() {
        return codproduto;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setCodproduto(int codproduto) {
        this.codproduto = codproduto;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }
}
