package faculdade;

public class Aluno {

    int id;
    String nome;
    String cpf;

    public Aluno(int id, String nome, String cpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }

    public String toStringAluno() {
        return "\nID: " + this.id + "\nNome: " + this.nome + "\nCPF: " + this.cpf;
    }
}
