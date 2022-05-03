package appHeranca;

import java.util.ArrayList;
import java.util.List;


public class AppHeranca {
    
    public static void main(String[] args) {
        Gerente g1 = new Gerente("Vendas", 2000, 12, "Guilherme", 45);
        Funcionario f2 = new Funcionario(1500, 13, "Guilherme", 18);
        
        Pessoa p1 = new Pessoa(13, "Igor", 3000);
        
        List<String> lista = new ArrayList<>();
    }
    
}
