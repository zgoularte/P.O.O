package heranca;

public class Pessoa {
    private String nome;
    private int matricula;
    private int idade;

    public Pessoa(String nome, int matricula, int idade) {
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(int registro) {
        this.matricula = registro;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    /* todas as classes Java herdam da classe java.lang.Object */
    /* A classe Object tem um método padrão para imprimir objetos, o toString */
    @Override /* forma de sobreescrita */
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", matricula=" + matricula + ", idade=" + idade + '}';
    }
}
