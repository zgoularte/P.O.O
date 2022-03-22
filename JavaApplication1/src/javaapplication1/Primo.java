package javaapplication1;

public class Primo {
    public void imprimir(){
        int primo = 11;
        if (primo > 1){
            if (primo == 2){
                System.out.println(primo + " e um numero primo");
            }
            for (int i = 2; i < primo;){
                if (primo % i == 0){
                    System.out.println(primo + "ñ e um numero primo");
                    break;
                } else {
                    System.out.println(primo + " e um numero primo");
                    break;
                }
            }
        } else {
            System.out.println(primo + " ñ é um numero primo");
        }
    }
}
