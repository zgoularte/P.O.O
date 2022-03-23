package apppessoa;

public class AppPessoa {

    public static void main(String[] args) {
        Pessoa pess = new Pessoa(10, "Leo", "00000000054", 17);

        System.out.println("O código de " + pess.nome + " é " + pess.codigo);
        System.out.println("O cpf de " + pess.nome + " é " + pess.cpf);

        System.out.println(pess.nome + " é maior de idade? " + pess.verificaMaiorDeIdade());
    }

}
