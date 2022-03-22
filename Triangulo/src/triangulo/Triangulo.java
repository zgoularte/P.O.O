package triangulo;

public class Triangulo {

    public static void main(String[] args) {
        Dimensoes dimensoes = new Dimensoes(10, 10, 10, 5);
        System.out.println("Área do Triângulo: " + dimensoes.area);
        System.out.println("Peímetro do Triângulo: " + dimensoes.perimetro);
    } 
}    