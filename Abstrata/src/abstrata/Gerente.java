package abstrata;

public class Gerente extends Funcionario implements Autenticavel {

    private String setor;

    public Gerente(String setor, String nome, double salario) {
        super(nome, salario);
        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    @Override
    public double calculaBonificacao(double taxa) {
        return (this.getSalario() * taxa) + (this.getSalario() * 0.1);
    }

    @Override
    public boolean autentica(String senha) {
        return senha.equals("123");
    }
}
