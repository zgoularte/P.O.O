package javaapplication1;

import java.util.Scanner;

public class Senha {
    
    Scanner Senha = new Scanner(System.in);
    
    public int tentativa = 0;
    public String senhaCorreta = "09848277900";

    public void construtor() {
        System.out.println("Digite uma senha: ");
    }
    
    public void imprimir(){
        String str = Senha.next();
        while (tentativa < 3){
            if (!senhaCorreta.equals(str)){
                System.out.println("Senha incorreta! Você têm mias: " + (3 - tentativa) + " tentativa(s)" + "\nDigite novamente: ");
                tentativa++;
                str = Senha.next();
            }else{
                System.out.println("Senha correta, acesso permitido.");
                break;
            }
        }
    }
}
