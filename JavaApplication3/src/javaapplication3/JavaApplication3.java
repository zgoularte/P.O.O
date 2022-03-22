package javaapplication3;

public class JavaApplication3 {

    public static void main(String[] args) {
        Carro carro1 = new Carro("Silvia", "Laranja", 5);
        Carro carro2 = new Carro("Skyline R34", "Azul", 5);
        Carro carro3 = new Carro("Kombi", "Branca", 7);
        Carro carro4 = new Carro("Commander", "Cinza", 7);

        System.out.println(carro1.toString());
        System.out.println(carro2.toString());
        System.out.println(carro3.toString());
        System.out.println(carro4.toString());
    }

}
