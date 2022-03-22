package faculdade;

public class Disciplina {

    int id;
    String disciplina;
    String descricao;

    public Disciplina(int id, String disciplina, String descricao) {
        this.id = id;
        this.disciplina = disciplina;
        this.descricao = descricao;
    }

    public String toStringDisciplina() {
        return "\nDisciplina: " + this.disciplina + "\nDescrição: " + this.descricao;
    }
}
