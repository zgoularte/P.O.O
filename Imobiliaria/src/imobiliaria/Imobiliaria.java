package imobiliaria;

public class Imobiliaria {

    public static void main(String[] args) {
        Terreno t1 = new Terreno(10, 20, "nao precisa de aterro", "liberado para construir", "Rua Eldorado", 0, "Pq. Residencial Eldorado", 100000, 200000);
        ApartamentoeCasa ap1 = new ApartamentoeCasa(3, 2, 1, "ja pode residir", "possui condominio", "Apartamento", "Rua Eldorado", 96, "Pq. Residencial Eldorado", 300000, 600000);
        ApartamentoeCasa c1 = new ApartamentoeCasa(2, 2, 1, "nao pode residir", "nao possui condominio", "sobrado", "Rua Rondonia", 69, "Pq. das Grevilhas", 800000, 900000);

        System.out.println(t1.toString());
        System.out.println(t1.calculaIptu());

        System.out.println(ap1.toString());
        System.out.println(ap1.calculaIptu());
        
        System.out.println(c1.toString());
        System.out.println(c1.calculaIptu());

    }

}
