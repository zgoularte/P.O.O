package heranca;

/*
DEFINIÇÃO DE HERANÇA
- Utilizada com o intuito de reaproveitar código, herança é o princípio em OO para que classes
compartilhem métodos e atributos de forma hierarquica. A classe filha, também chamada de SUBCLASSE, 
herda os atributos e métodos da classe pai, denominada SUPERCLASSE.
*/

/*
DEFINIÇÃO DE POLIMORFISMO
- Propriedade de subclasses derivdas de uma superclasse se comportarem de maneiras diferentes a partir de uma mesma mensagem.

    
    DEFINIÇÃO DE SOBRESCRITA
    - Reescrever na subclasse um método definido na superclasse. Como boa prática, recomenda-se a utilização da anotação @override
    
*/

/*
DEFINIÇÃO DE SOBRECARGA
- Consiste na criação de variações de um mesmo método diferenciando-se pelos seus parâmetros.
*/

public class Heranca {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Pedro", 1, 20);
        System.out.println(pessoa.toString());
        
        Funcionario funcionario = new Funcionario(1200.57, "João", 2, 19);
        System.out.println(funcionario.toString());
        System.out.println(funcionario.getNome()); /* acessando o método da superclasse */
        System.out.println(funcionario.getBonificacao());
        
        Cliente cliente = new Cliente("Thiago", 3, 19, "Premium");
        System.out.println(cliente.toString());
        
        Gerente gerente = new Gerente(1200.57, "Matheus", 4, 18, "Vendas");
        System.out.println(gerente.toString());
        System.out.println(gerente.getNome());
        System.out.println(gerente.getBonificacao());
    }
    
}
