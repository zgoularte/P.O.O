package javaapplication1;

import java.util.Scanner;

public class Mmc {
    
    Scanner entrada = new Scanner(System.in);
    int n1 = 9;
    int n2 = 15;
    boolean verificador = true;
    int mmc = 2;

    public void imprimir() {
        while (verificador){
            if (mmc % n1 == 0 && mmc % n2 == 0){
                System.out.println("m.m.c de " + n1 + " e " + n2 + " é " + mmc);
                verificador = false;
            }
            mmc++;
        }
    }
}
