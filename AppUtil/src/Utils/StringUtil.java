package Utils;

public class StringUtil {
    
    /* recebe uma string e a retorna sem caracteres especiais */
    public static String removeCaracteresEspeciais(String string){
        return string.replaceAll("[-+.^:,;!#@]", "");
    }
    
    /* converte um valor de double para string aplicando uma máscara de R$ */
    public static String converteValorFormatado(double valor){
        String valorFormatado = String.valueOf(valor);
        return "R$ " + valorFormatado.replace(".", ",");
    }
    
    /* converte um valor de string para double removendo uma máscara de R$ */
    public static double converteValor(String valorFormatado){
        return Double.parseDouble(valorFormatado.replace("R$ ", " ").replace(",", "."));
    }
    
    /* oculta email por questões de segurança */
    public static String mascaraEmail(String email){
        if(!email.isEmpty() && email.contains("@")){
            String[] emailSplit = email.split("@");
            String identificador = emailSplit[0].substring(0, Math.round(emailSplit[0].length() / 2)).concat("********@");
            return identificador.concat(emailSplit[1]);
        }
 
        return null;
    }
}
