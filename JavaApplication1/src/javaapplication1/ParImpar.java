package javaapplication1;

import java.util.Scanner;

public class ParImpar {
    Scanner entrada = new Scanner(System.in);
    
    int numero;
    
    public void construtor (){
        System.out.println("Digite um número:");
          numero = entrada.nextInt();        
    }
    public void imprimir (){
        if (numero % 2 == 0) {
                System.out.println("Par");
            } else {
                System.out.println("Ímpar");
            }
    }
}
