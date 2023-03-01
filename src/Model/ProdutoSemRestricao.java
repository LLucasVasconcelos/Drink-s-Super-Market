package Model;

public class ProdutoSemRestricao extends ProdutoAbstract {

    public ProdutoSemRestricao(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double getPreco() {
        return preco;
    }
}
