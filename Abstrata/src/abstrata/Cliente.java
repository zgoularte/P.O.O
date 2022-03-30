package abstrata;

public class Cliente implements Autenticavel {

    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean autentica(String senha) {
        return senha.equals("abc");
    }

}
