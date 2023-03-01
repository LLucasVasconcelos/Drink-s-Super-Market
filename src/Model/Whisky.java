package Model;

public class Whisky extends BebidaAbstract {
    private int idade;


    public Whisky(String nome, String volume, double preco, int idade) {
        super(nome, volume, preco);
        this.idade = idade;

    }

    public int getIdade() {
        return idade;
    }

    @Override
    public double getPreco() {
        if (this.idade == (16)) {
            return preco + (preco * 0.20);
        } else if (this.idade == (18)) {
            return preco + (preco * 0.40);
        } else {
            return preco;
        }
    }
}
