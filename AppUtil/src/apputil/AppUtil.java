package apputil;

/* é necessário a importação por estar em outro pacote */
import Enums.OpcoesMenu;
import Utils.StringUtil;


public class AppUtil {
    
    public static void escolheOpcao(OpcoesMenu opcao){
        if(opcao == OpcoesMenu.SALVAR){
            System.out.println("Salvando o arquivo!");
            
        } else if(opcao == OpcoesMenu.ABRIR){
            System.out.println("Abrindo o arquivo!");
            
        }
    }
    
    public static void main(String[] args){
        String str = "Esse é um ^^^^ test### de . remoç;;ão de caracteres!! especiais";
        System.out.println(StringUtil.removeCaracteresEspeciais(str));
 
        double valor = 1.99;
        System.out.println(StringUtil.converteValorFormatado(valor));
 
        String valorFormatado = "R$ 2,99";
        System.out.println(StringUtil.converteValor(valorFormatado));
 
        String email = "prof_leonardo@unifcv.edu.br";
        System.out.println(StringUtil.mascaraEmail(email));
        
        
        /* ----- ENUM ----- */
        
        /* iteração sobre as constantes */
        for (OpcoesMenu opMenu : OpcoesMenu.values()) {
            System.out.println(opMenu);
        }
        
        escolheOpcao(OpcoesMenu.SALVAR);
        
        OpcoesMenu op = OpcoesMenu.SALVAR;
        
        System.out.println(op.getValor());
        
        /* ----- END ENUM ----- */
        
    }
    
}
