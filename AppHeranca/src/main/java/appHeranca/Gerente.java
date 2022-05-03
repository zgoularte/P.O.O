package appHeranca;

public class Gerente extends Funcionario{
    private String departamento;
    
    public Gerente (String departamento,double salario, int matricula, String nome, int idade) {
            super(salario, matricula, nome, idade);
            this.departamento = departamento;
   }
}
