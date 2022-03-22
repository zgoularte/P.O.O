package financeiro;

/* não foram implementadas regras para pagar o empréstimo */
public class Emprestimo {
    private double valor;
    private double juros; /* a.m. */
    private int qtdeParcelas;
    
    /* objeto pessoa */
    /* cada empréstimo só pode ter uma pessoa */
    private Pessoa pessoa;

    public Emprestimo(double valor, double juros, int qtdeParcelas, Pessoa pessoa) {
        this.valor          = valor;
        this.juros          = juros;
        this.qtdeParcelas   = qtdeParcelas;
        this.pessoa         = pessoa;
    }
    
    /* método utilizado para efetivar o empréstimo */
    public boolean depositaEmprestimo(){
        if(this.valor > 0){
            /* operação realizada para depositar o valor na conta da pessoa */
            this.pessoa.getConta().deposito(this.valor);
            
            System.out.println("Empréstimo depositado com sucesso!");
            return true;
        }
        
        System.out.println("O valor do empréstimo deve ser maior que zero.");
        return false;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    public int getQtdeParcelas() {
        return qtdeParcelas;
    }

    public void setQtdeParcelas(int qtdeParcelas) {
        this.qtdeParcelas = qtdeParcelas;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
}
