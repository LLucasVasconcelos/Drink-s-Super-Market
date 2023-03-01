package Model;

public class Venda {
    private ProdutoAbstract produto;
    private Cliente cliente;
    private double valor;

    public Venda(ProdutoAbstract produto, Cliente cliente) {
        this.produto = produto;
        this.cliente = cliente;
    }

    public ProdutoAbstract getProduto() {
        return produto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getValor() {
        if (getCliente().getCpf().equalsIgnoreCase("42340905")) {
            return produto.preco - (produto.getPreco() * 0.20);
        } else return produto.preco;
    }

}
