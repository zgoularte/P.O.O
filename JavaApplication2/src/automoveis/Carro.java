package automoveis;

public class Carro{
    public int ano;
    public int id;
    public double valor;
    public String marca;
    public String modelo;
    private double imposto;
    
    public Carro(){}

    /**
     *
     * @param ano
     * @param id
     * @param valor
     * @param marca
     * @param modelo
     */
    public Carro(int ano, int id, double valor, String marca, String modelo){
            this.ano = ano;
            this.id = id;
            this.valor = valor;
            this.marca = marca;
            this.modelo = modelo;
            this.imposto = (0.035 * this.valor);
        }
    public boolean calculaAnoCarro(){
        if ((2022 - this.ano) <= 20){
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