package imobiliaria;

public class Imovel {

    private String rua;
    private int numero;
    private String bairro;
    private double aVista;
    private double aPrazo;

    public Imovel(String rua, int numero, String bairro, double aVista, double aPrazo) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.aVista = aVista;
        this.aPrazo = aPrazo;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public double getaVista() {
        return aVista;
    }

    public void setaVista(double aVista) {
        this.aVista = aVista;
    }

    public double getaPrazo() {
        return aPrazo;
    }

    public void setaPrazo(double aPrazo) {
        this.aPrazo = aPrazo;
    }

    @Override
    public String toString() {
        return "Imovel{" + "rua=" + rua + ", numero=" + numero + ", bairro=" + bairro + ", aVista=" + aVista
                + ", aPrazo=" + aPrazo + '}';
    }

}
