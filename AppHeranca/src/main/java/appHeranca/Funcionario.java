package appHeranca;

public class Funcionario extends Pessoa{
    private double salario;

    public Funcionario(double salario, int matricula, String nome, int idade ) {
        super(matricula, nome, idade);
        this.salario = salario;
    }
    
    
}
