package imobiliaria;

public class ApartamentoeCasa extends Imovel {

    private int dormitorios;
    private int banheiros;
    private int garagem;
    private String possivelResidir;
    private String condominio;
    private String tipo;

    public ApartamentoeCasa(int dormitorios, int banheiros, int garagem, String possivelResidir, String condominio, String tipo, String rua, int numero, String bairro, double aVista, double aPrazo) {
        super(rua, numero, bairro, aVista, aPrazo);
        this.dormitorios = dormitorios;
        this.banheiros = banheiros;
        this.garagem = garagem;
        this.possivelResidir = possivelResidir;
        this.condominio = condominio;
        this.tipo = tipo;
    }

    public int getDormitorios() {
        return dormitorios;
    }

    public void setDormitorios(int dormitorios) {
        this.dormitorios = dormitorios;
    }

    public int getBanheiros() {
        return banheiros;
    }

    public void setBanheiros(int banheiros) {
        this.banheiros = banheiros;
    }

    public int getGaragem() {
        return garagem;
    }

    public void setGaragem(int garagem) {
        this.garagem = garagem;
    }

    public String getPossivelResidir() {
        return possivelResidir;
    }

    public void setPossivelResidir(String possivelResidir) {
        this.possivelResidir = possivelResidir;
    }

    public String getCondominio() {
        return condominio;
    }

    public void setCondominio(String condominio) {
        this.condominio = condominio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "\n\nDormitorios: " + dormitorios + "\nBanheiros: " + banheiros + "\nGaragem: "
                + garagem + "\nPossivel residir?: " + possivelResidir + "\nCondominio?: " + condominio + "\nTipo: "
                + tipo + "\n" + this.getRua() + "\n" + this.getNumero()
                + "\n" + this.getBairro() + "\n" + this.getaVista() + "\n" + this.getaPrazo();
    }

    public String calculaIptu() {
        return "IPTU: " + this.getaVista() * 0.02;
    }
}
