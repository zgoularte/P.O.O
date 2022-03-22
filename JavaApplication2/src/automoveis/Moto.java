package automoveis;
/*Atributos da moto*/
public class Moto {
    public int ano;
    public int id;
    public double valor;
    public String marca;
    public String modelo;
    public double imposto;
    
    public Moto(){}

    /**
     *
     * @param id
     * @param ano
     * @param modelo
     * @param valor
     * @param marca
     */
    public Moto(int ano, int id, double valor, String marca, String modelo){
            this.ano = ano;
            this.id = id;
            this.valor = valor;
            this.marca = marca;
            this.modelo = modelo;
            this.imposto = (0.035 * this.valor);
        }
    public boolean calculaAnoMoto(){
        if((2022 - this.ano) <=20){
            System.out.println("O veículo ainda precisa pagar IPVA");
            System.out.printf("O valor do imposto é: R$ %.2f \n", this.imposto);
            System.out.println("");
            return true;
        }
        System.out.println("O veículo não precisa mais pagar IPVA");
        System.out.println("");
        return false;
    }
}