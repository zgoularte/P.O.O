package javaapplication1;

import java.util.Scanner;

public class RealParaDolar {
    Scanner entrada = new Scanner(System.in);
    
    public double dolar;
    public double real = (float) 0.19;
            
    public void construtor () {
        
        System.out.println("\nR$ ");
        
        dolar = entrada.nextFloat();
    }
    public void imprimir() {
        System.out.printf("\nU$ = %.2f %n", (dolar = dolar * real));
    }
}
