package Model;


public abstract class BebidaAbstract extends ProdutoAbstract {
    protected String volume;

    public BebidaAbstract(String nome, String volume, double preco) {
        super(nome, preco);
        this.volume = volume;
    }

    public abstract double getPreco();
}
