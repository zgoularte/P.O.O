package faculdade;

public class Matricula {

    public Aluno aluno;
    public Disciplina disciplina;
    public String status;

    public Matricula(Aluno aluno, Disciplina disciplina, String status) {
        this.aluno = aluno;
        this.disciplina = disciplina;
        this.status = status;
    }

    public boolean alteraAluno(Aluno aluno) {
        if (status.equals("Finalizada")) {
            System.out.println("Aluno não pode ser alterado, pois a matrícula esta finalizada!");
            return true;
        }
        System.out.println("Aluno alterado!");
        this.aluno = aluno;
        return false;
    }

    public boolean alteraDisciplina(Disciplina disciplina) {
        if (status.equals("Finalizada")) {
            System.out.println("Essa disciplina não pode ser alterada, pois a matrícula esta finalizada!");
            return true;
        }
        System.out.println("Disciplina alterada!");
        this.disciplina = disciplina;
        return false;
    }

    public String toStringMatricula() {
        return this.aluno.toStringAluno() + this.disciplina.toStringDisciplina() + "\nStatus: " + this.status;
    }
}
