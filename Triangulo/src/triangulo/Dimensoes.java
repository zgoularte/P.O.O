package triangulo;

public class Dimensoes {

    public int base, lado1, lado2, altura, area, perimetro;

    public Dimensoes(int base, int lado1, int lado2, int altura) {
        this.base = base;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.altura = altura;
        this.area = (base * altura) / 2;
        this.perimetro = (base + lado1 + lado2);
    }
}
