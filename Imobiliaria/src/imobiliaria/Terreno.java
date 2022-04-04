package imobiliaria;

public class Terreno extends Imovel {

    private double largura;
    private double comprimento;
    private String aterro;
    private String liberacao;

    public Terreno(double largura, double comprimento, String aterro, String liberacao, String rua, int numero, String bairro, double aVista, double aPrazo) {
        super(rua, numero, bairro, aVista, aPrazo);
        this.largura = largura;
        this.comprimento = comprimento;
        this.aterro = aterro;
        this.liberacao = liberacao;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public String getAterro() {
        return aterro;
    }

    public void setAterro(String aterro) {
        this.aterro = aterro;
    }

    public String getLiberacao() {
        return liberacao;
    }

    public void setLiberacao(String liberacao) {
        this.liberacao = liberacao;
    }

    @Override
    public String toString() {
        return """
               Terreno
               largura: """ + " " + largura + "\nComprimento: " + comprimento + "\nAterro: "
                + aterro + "\nLiberacao: " + liberacao + "\n" + this.getRua() + "\n" + this.getNumero()
                + "\n" + this.getBairro() + "\nValor a vista: " + this.getaVista() + "\nValor a prazo: " + this.getaPrazo();
    }

    public String calculaIptu() {
        return "IPTU: " + this.getaVista() * 0.01;
    }
}
