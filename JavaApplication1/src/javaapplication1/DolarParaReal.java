package javaapplication1;

import java.util.Scanner;

public class DolarParaReal {
    Scanner entrada = new Scanner(System.in);
            
    public double real;
    public double dolar = (float) 5.10;
    
    public void construtor () {
        
        System.out.println("\nU$: ");
        
        real = entrada.nextFloat();
        /*
        if (real > 0) {
            real = real * dolar;
        }*/
    }
    
    public void imprimir ()
    {
        System.out.printf("\nR$ = %.2f %n", (real = real * dolar));
    }
}