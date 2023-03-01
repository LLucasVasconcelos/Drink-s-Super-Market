package Model;

public abstract class ProdutoAbstract {
    protected String nome;
    protected double preco;

    public ProdutoAbstract(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

}
