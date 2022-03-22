package financeiro;

public class Financeiro {

    public static void main(String[] args) {
        /* criação de pessoas */
        Pessoa p1 = new Pessoa(1, "João", "00045618956");
        Pessoa p2 = new Pessoa(2, "Pedro", "00011118956");
        
        /* criação de contas para cada pessoa */
        p1.setConta(new Conta(111, 1000.50, true));
        p2.setConta(new Conta(112, 500.50, true));
        
        /* emprestimo criado e efetivado */
        Emprestimo emp = new Emprestimo(500.00, 0.12, 10, p1);
        emp.depositaEmprestimo();
        
        /* transferência */
        Transferencia transferencia = new Transferencia();
        
        transferencia.movimentacao(p1, p2, 250.00);
        System.out.println(transferencia.getLog());
        /* ---- */
        
        /* visualização dos status das pessoas p1 e p2  */
        System.out.println(p1.toStringPessoa());
        System.out.println(p2.toStringPessoa());
        
    }
    
}
