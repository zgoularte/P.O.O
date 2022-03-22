package financeiro;

public class Transferencia {
    private String log;
    
    /* não foi criado nenhum construtor. Dessa forma, o construtor padrão é utilizado. */

    public String getLog() {
        return log;
    }
    
    /* método utilizado para realizar uma movimentação */
    public void movimentacao(Pessoa pessoaOrigem, Pessoa pessoaDestino, double valor){
        boolean auxVerificacaoSaque = pessoaOrigem.getConta().saque(valor);
        
        if(auxVerificacaoSaque){
            pessoaDestino.getConta().deposito(valor);
            
            /* registra movimentação */
            this.log =  " Pessoa origem:  "    + pessoaOrigem.getNome() + " Saldo: " + pessoaOrigem.getConta().getSaldo() + " \n " +
                        " Pessoa destino: "    + pessoaDestino.getNome() + " Saldo: " + pessoaDestino.getConta().getSaldo() + " \n " + 
                        " Valor transferido: " + valor + "\n";
        } else {
            
            /* registra movimentação - ERRO */
            this.log =  " ERRO: SALDO INSUFICIENTE. \n" + 
                        "Pessoa origem: " + pessoaOrigem.getNome() + " \n " +
                        "Pessoa origem: " + pessoaDestino.getNome() + " \n " +
                        " Valor transferido: " + valor + "\n";
        }
    }
}
