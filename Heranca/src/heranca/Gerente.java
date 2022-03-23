package heranca;

public class Gerente extends Funcionario{
    private String departamento;

    public Gerente(double salario, String nome, int matricula, int idade, String departamento) {
        /* invocação do construtor da superclasse imediata */
        super(salario, nome, matricula, idade);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    @Override
    public String toString() {
        return "Gerente{" + "departamento=" + departamento + '}' + super.toString();
    }
    
    /* sobrescrita do método getBonificacao da superclasse */
    /* forma de polimorfismo */
    @Override
    public double getBonificacao(){
        return super.getSalario() * 0.15;
    }
    
    /* -- sobrecarga -- */
    public double calculaTaxa(){
        return 20.50;
    }
    
    /* -- sobrecarga -- */
    public double calculaTaxa(double adicional){
        return 20.50 + adicional;
    }
    
}
