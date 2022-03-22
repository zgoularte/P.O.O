package financeiro;

public class Conta {
    private int numero;
    private double saldo;
    private boolean status;
    
    /* construtor */
    public Conta(int numero, double saldo, boolean status) {
        this.numero = numero;
        this.saldo  = saldo;
        this.status = status;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSaldo(double saldo) {
        if(saldo > 0){
            this.saldo = saldo;
        }
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    /* método utilizado para sacar um valor */
    /* é necessário verificar se o saldo é suficiente */
    public boolean saque(double valor){
        if(this.saldo >= valor){
            System.out.println("Saque realizado com sucesso!");
            this.saldo -= valor;
            return true;
        }
        
        System.out.println("Saldo insuficiente para saque.");
        return false;
    }
    
    /* método utilizado para depositar um valor */
    /* é necessário verificar se o valor é positivo */
    public boolean deposito(double valor){
        if(valor > 0){
            this.saldo += valor;
            System.out.println("Depósito realizado com sucesso!");
            return true;
        }
        
        System.out.println("O valor precisa ser maior que zero.");
        return false;
    }
    
}
