package heranca;

public class Cliente extends Pessoa{
    private String planoConta;

    public Cliente(String nome, int matricula, int idade, String planoConta) {
        /* invocação do construtor da superclasse imediata */
        super(nome, matricula, idade);
        this.planoConta = planoConta;
    }

    public String getPlanoConta() {
        return planoConta;
    }

    public void setPlanoConta(String planoConta) {
        this.planoConta = planoConta;
    }

    @Override
    public String toString() {
        return "Cliente{" + "planoConta=" + planoConta + '}' + super.toString();
    }
}
