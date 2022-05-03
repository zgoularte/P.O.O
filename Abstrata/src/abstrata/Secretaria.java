package abstrata;

public class Secretaria extends Funcionario {

    private String agenda;

    public Secretaria(String agenda, String nome, double salario) {
        super(nome, salario);
        this.agenda = agenda;
    }

    public String getAgenda() {
        return agenda;
    }

    public void setAgenda(String agenda) {
        this.agenda = agenda;
    }

    @Override
    public double calculaBonificacao(double taxa) {
        return (this.getSalario() * taxa) + (this.getSalario() * 0.05);
    }
}
