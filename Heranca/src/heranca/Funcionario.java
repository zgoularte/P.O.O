package heranca;

public class Funcionario extends Pessoa{
    private double salario; 

    public Funcionario(double salario, String nome, int matricula, int idade) {
        /* invocação do construtor da superclasse imediata */
        super(nome, matricula, idade);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "salario=" + salario + '}' + super.toString();
    }
    
    public double getBonificacao(){
        return this.salario * 0.10;
    }
}
