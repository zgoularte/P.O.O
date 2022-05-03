package appforma;

public class AppForma {

    public static void main(String[] args) {
        Circulo c1 = new Circulo();
        Forma f1 = new Forma();

        System.out.println(c1.calculaArea());
        System.out.println(f1.calculaArea());
        System.out.println(Soma.soma("C", "J"));

    }

}
