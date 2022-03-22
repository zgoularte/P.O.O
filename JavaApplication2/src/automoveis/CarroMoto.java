package automoveis;

public class CarroMoto {
    
    public static void main(String[] args) {
        Carro carro1 = new Carro(2000, 1, 19400, "Toyota", "Corolla");
        System.out.println("==========CARROS==========");
        System.out.println("ID: " + carro1.id);
        System.out.println("Modelo: " + carro1.modelo);
        System.out.println("Marca: " + carro1.marca);
        System.out.println("Ano: " + carro1.ano);
        System.out.println("Preço: R$ " + carro1.valor);
        System.out.println(carro1.calculaAnoCarro());
        
        Carro carro2 = new Carro(2015, 2, 15000, "Honda", "Civic");
        System.out.println("ID: " + carro2.id);
        System.out.println("Modelo: " + carro2.modelo);
        System.out.println("Marca: " + carro2.marca);
        System.out.println("Ano: " + carro2.ano);
        System.out.println("Preço: R$ " + carro2.valor);
        System.out.println(carro2.calculaAnoCarro());
        
        Carro carro3 = new Carro(2001, 3, 77000, "Audi", "A6");
        System.out.println("==========MOTOS==========");
        System.out.println("ID: " + carro3.id);
        System.out.println("Modelo: " + carro3.modelo);
        System.out.println("Marca: " + carro3.marca);
        System.out.println("Ano: " + carro3.ano);
        System.out.println("Preço: R$ " + carro3.valor);
        System.out.println(carro3.calculaAnoCarro());
        
        Moto moto1 = new Moto(2000, 1, 15000, "Honda", "CB 500");
        System.out.println("ID: " + moto1.id);
        System.out.println("Modelo: " + moto1.modelo);
        System.out.println("Marca: " + moto1.marca);
        System.out.println("Ano: " + moto1.ano);
        System.out.println("Preço: R$ " + moto1.valor);
        System.out.println(moto1.calculaAnoMoto());
        
        Moto moto3 = new Moto(2020, 2, 78990, "Ducati", "Monster 1200 S");
        System.out.println("ID: " + moto3.id);
        System.out.println("Modelo: " + moto3.modelo);
        System.out.println("Marca: " + moto3.marca);
        System.out.println("Ano: " + moto3.ano);
        System.out.println("Preço: R$ " + moto3.valor);
        System.out.println(moto3.calculaAnoMoto());
    }
    
}