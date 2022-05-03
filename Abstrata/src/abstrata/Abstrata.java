package abstrata;

public class Abstrata {

    public static void main(String[] args) {
        Funcionario s2 = new Secretaria("", "Claudia", 1200);
        Funcionario s3 = new Gerente("", "Marcos", 14500);

        System.out.println(s2.calculaBonificacao(0.1));
        System.out.println(s3.calculaBonificacao(0.1));
    }

}
