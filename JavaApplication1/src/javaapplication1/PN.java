package javaapplication1;

import java.util.Scanner;

public class PN {
    Scanner entrada = new Scanner(System.in);
    
    double numero;
            
    public void construtor () {
        System.out.println("digite qualquer numero");
        numero = entrada.nextInt();
    }
    public void imprimir(){
        if(numero < 0 ){
            System.out.println("negativo");
        }else{
            System.out.println("positivo");
        }
    }
}
