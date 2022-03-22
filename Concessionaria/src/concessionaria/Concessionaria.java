/*Exercício 1
Encapsulamento em P.O.O significa separar o programa em partes, o mais isolado possível. A idéia é tornar o software mais flexível, fácil de modificar e de criar novas implementações.
Serve para controlar o acesso aos atributos e métodos de uma classe. É uma forma eficiente de proteger os dados manipulados dentro da classe, além de determinar onde esta classe
poderá ser manipulada.
 */
 /*Exercício 2
Geralmente, utilizam-se os modificadores de acesso para privar os atributos doa acesso direto, tornando-os privados, e imprementa-se métodos públicos que acessam e alteram
os atributos. Métodos privados geralmente são usados apenas por outros métodos que são públicos, e que podem ser chamados a partir de outro objeto da mesma classe a fim de
não repetir código em mais de um método.
-Public: deixará visível a clase ou membro para todas as outras classes, subclasses e pacotes do projeto Java.
-Protected: deixará visível o atributo para todas as outras classes e subclasses que pertecem ao mesmo pacote. A pricnipal difença é que apenas as classes do mesmo pacote têm acesso ao membro.
-Private: deixará visível o atributo apenas para a classe em que este atributo se encontra.
-Default: é o modificador padrão quando outro não é definido. Isto torna acessível na própria classe, nas classes e subclasses do mesmo pacote. Ele geralmente é utilizado para construtores e métodos
que só deve ser invocados pelas classes e subclasses do pacote, constantes estáticas que são útil apenas dentro do pacote em que estiver inserido.
 */
package concessionaria;

public class Concessionaria {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(1, "Gustavo", "0984828282");

        Venda venda1 = new Venda(1, cliente1);

        System.out.println(venda1.toString());
    }

}
