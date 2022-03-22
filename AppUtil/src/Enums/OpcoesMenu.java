package Enums;

/*
    REFERÊNCIAS
    - https://www.devmedia.com.br/tipos-enum-no-java/25729
    - http://tutorials.jenkov.com/java/enums.html
*/


/* Enum é um tipo especial do Java utilizado para definir coleções de constantes. */
/* é possível iterar sobre essas constantes */
/* é possível adicionar campos a um enum. É necessário criar um construtor para isso. */
public enum OpcoesMenu {
    SALVAR(1), 
    IMPRMIR(2), 
    ABRIR(3), 
    VISUALIZAR(4), 
    FECHAR(5);
    
    private final int valor;
    
    /* por definição, o construtor é privado */
    OpcoesMenu(int valorOpcao){
        valor = valorOpcao;
    }
    
    public int getValor(){
        return valor;
    }
}
