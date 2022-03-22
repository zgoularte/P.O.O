package javaapplication3;

public class Carro {

    /*Exercício 5
Utilizando o modificador e ter um construtor, não ter o setter a quantidade de lugares só pode ser atribuído uma única vez como. Como esse atributo só pode receber um valor uma vez e existe
um construtor implementado para a classe, sendo assim não tem o porque esse atributo conter um setter.
     */
    public String nome;
    public String cor;
    public final int qtdeLugares;

    /*Exercício 6
Em caso que seja necessário que esse atributo tenha a mesma quantidade de lugares para todas as instâncias dessa classe, utiliza-se o modificador static
     */
    //private static int qtdeLugares;
    public Carro(String nome, String cor, int qtdeLugares) {
        this.nome = nome;
        this.cor = cor;
        this.qtdeLugares = qtdeLugares;
    }

    public String getNome() {
        return nome;
    }

    public String getCor() {
        return cor;
    }

    public int getQtdeLugares() {
        return qtdeLugares;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "\nModelo: " + this.nome
                + "\nCor: " + this.cor
                + "\nQuantidade de lugares: " + this.qtdeLugares;
    }
}
