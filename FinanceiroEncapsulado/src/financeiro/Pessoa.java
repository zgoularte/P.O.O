package financeiro;

public class Pessoa {
    private int codigo;
    private String nome;
    private String cpf;
    
    /* objeto conta */
    /* cada pessoa só pode ter uma conta */
    private Conta conta;

    public Pessoa(int codigo, String nome, String cpf) {
        this.codigo = codigo;
        this.nome   = nome;
        this.cpf    = cpf;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
    
    public String toStringPessoa(){
        return "Código: " + this.codigo + ", Nome: " + this.nome + ", CPF: " + this.cpf + "\n Conta: " + this.conta.getNumero() + " Saldo: " + this.conta.getSaldo() + "\n";
    }
}
