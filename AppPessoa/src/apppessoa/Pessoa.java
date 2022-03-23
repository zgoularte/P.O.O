package apppessoa;

public class Pessoa {

    /* atributos */
    public int codigo;
    public String nome;
    public String cpf;
    public int idade;

    /* construtor padrão */
    public Pessoa() {
    }

    /* demais construtores */
 /* é possível a criação de vários construtores */
    public Pessoa(int codigo, String nome, String cpf, int idade) {
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    public Pessoa(int codigo, String nome, String cpf) {
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
    }

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    /* ---- */

 /* métodos */
    public boolean verificaMaiorDeIdade() {
        if (this.idade >= 18) {
            return true;
        }

        return false;
    }

}
