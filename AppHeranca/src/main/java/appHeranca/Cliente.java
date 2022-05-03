package appHeranca;

public class Cliente extends Pessoa{
    private int planoConta;
    
    public Cliente (int planoConta, int matricula, String nome, int idade) {
        super(matricula, nome, idade);
        this.planoConta = planoConta;
    }

    public int getPlanoConta() {
        return planoConta;
    }

    public void setPlanoConta(int planoConta) {
        this.planoConta = planoConta;
    }
    
    
}
