package concessionaria;

public class Venda {

    private int codigoVenda;
    private Cliente cliente;

    public Venda(int codigoVenda, Cliente cliente) {
        this.codigoVenda = codigoVenda;
        this.cliente = cliente;
    }

    public int getCodigoVenda() {
        return codigoVenda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCodigoVenda(int codigoVenda) {
        this.codigoVenda = codigoVenda;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "\nCódigo do Cliente: " + this.cliente.getCodigo()
                + "\nNome: " + this.cliente.getNome()
                + "\nCPF: " + this.cliente.getCpf()
                + "\nCódigo da venda: " + this.codigoVenda;
    }
}
