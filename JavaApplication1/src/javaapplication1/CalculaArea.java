package javaapplication1;

import java.util.Scanner;

class CalculaArea {

    private double result;
    private int l;
    private int a;
    private int areaq;
    private int areat;
    private double areac;
    double raio;

    Scanner entrada = new Scanner(System.in);

    public void construtor() {

        System.out.println("""
                           
                           Informe qual área deseja calcular
                           
                           1)Calcular área do quadrado
                           2)Calcular área do triângulo
                           3)Calcular área do círculo""");

    }

    public double getAreac() {
        return areac;
    }

    public void setAreac(double areac) {
        this.areac = areac;
    }

    public int getAreat() {
        return areat;
    }

    public void setAreat(int areat) {
        this.areat = areat;
    }

    public int getAreaq() {
        return areaq;
    }

    public void setAreaq(int areaq) {
        this.areaq = areaq;
    }

    float areaq() {

        result = this.l * this.l;
        return (float) result;

    }

    float areat() {
        result = (this.l * this.a) / 2;
        return (float) result;
    }

    float areac() {
        result = (3.14 * (raio * raio));
        return (float) result;
    }

    public void imprimir(int op) {

        switch (op) {

            case 1 -> {
                System.out.println("Entre com o lado do quadrado: ");
                l = entrada.nextInt();
                System.out.println("Área do quadrado: " + areaq());
                break;
            }
            case 2 -> {
                System.out.println("Entre com a base do triângulo: ");
                l = entrada.nextInt();
                System.out.println("Entre com a altura do triângulo: ");
                a = entrada.nextInt();
                System.out.println("Área do triângulo: " + areat());
                break;
            }

            case 3 -> {
                System.out.println("Entre com o raio do circulo: ");
                raio = entrada.nextInt();
                System.out.println("Área do círculo: " + areac());
                break;
            }
            default ->
                System.out.println("Opção inválida");
        }
    }
}
