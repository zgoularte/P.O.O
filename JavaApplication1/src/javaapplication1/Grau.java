package javaapplication1;

import java.util.Scanner;

public class Grau {
    Scanner entrada = new Scanner(System.in);
    public double tempF;
    public double tempC;
    
    public void construtor(){
        System.out.println("digite uma temperatura em fahrenhite: ");
        tempF = entrada.nextDouble();
        
        this.tempC = ((tempF - 32)* 5/9);
    }
    public void imprimir(){
        System.out.println("a temperatura em ºC é: " + tempC + "ºC");
    }
}

