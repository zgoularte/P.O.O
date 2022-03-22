package javaapplication1;

import java.util.Scanner;

public class JavaApplication {

    public static void main(String[] args) {
// Exercícios
        Scanner entrada = new Scanner(System.in);
        DolarParaReal d = new DolarParaReal();
        RealParaDolar r = new RealParaDolar();
        ParImpar pi = new ParImpar();
        PN pn = new PN();
        Grau g = new Grau();
        Primo p = new Primo();
        CalculaArea c = new CalculaArea();
        Senha s = new Senha();
        Mmc m = new Mmc();
        System.out.println("""
                           1 p/ converter U$ em R$;
                           2 p/ converter R$ em U$,
                           3 p/ verificar se um numero é par ou ímpar
                           4 p/ numero positivo ou negativo
                           5 p/ converter ºF em ºC
                           6 p/ ver se o numero é primo
                           7 p/ ver a área do quadrado, círculo ou triângulo
                           8 p/ verificação de senha
                           9 p/ calcular o mmc
                           10 p/ sair""");
        int entrar = entrada.nextInt();

        switch (entrar) {
            case 1 -> {
                d.construtor();
                d.imprimir();
                break;
            }
            case 2 -> {
                r.construtor();
                r.imprimir();
                break;
            }
            case 3 -> {
                pi.construtor();
                pi.imprimir();
                break;
            }
            case 4 -> {
                pn.construtor();
                pn.imprimir();
                break;
            }
            case 5 -> {
                g.construtor();
                g.imprimir();
                break;
            }
            case 6 -> {
                p.imprimir();
                break;
            }
            case 7 -> {

                c.construtor();
                int op = entrada.nextInt();
                c.imprimir(op);
                break;
            }
            case 8 -> {
                s.construtor();
                s.imprimir();
                break;
            }
            case 9 -> {
                m.imprimir();
                break;
            }

            case 10 -> {
                System.out.println("Fim");
                break;
            }
            default ->
                System.out.println("Opção Inválida");
        }
    }
}
