package faculdade;

public class Faculdade {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(1, "Gustavo", "0948277923");
        Aluno aluno2 = new Aluno(2, "Lara", "02305377923");

        Disciplina disciplina1 = new Disciplina(1, "Matemática Discreta", "Disciplina que ensina a pensar fora da caixa");
        Disciplina disciplina2 = new Disciplina(2, "P.O.O", "Programação orientada a objetados ('java')");

        Matricula matricula1 = new Matricula(aluno1, disciplina1, "Finalizada.");
        Matricula matricula2 = new Matricula(aluno2, disciplina2, "Pendente.");

        matricula1.alteraAluno(aluno2);
        matricula2.alteraAluno(aluno1);

        matricula1.alteraDisciplina(disciplina2);
        matricula2.alteraDisciplina(disciplina1);

        System.out.println(matricula1.toStringMatricula());
        System.out.println(matricula2.toStringMatricula());
    }
}
