package Model;

public class Vodka extends BebidaAbstract {

    private String tipo;


    public Vodka(String nome, String volume, double preco, String tipo) {
        super(nome, volume, preco);
        this.tipo = tipo;

    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public double getPreco() {
        if (this.tipo.equalsIgnoreCase("premium")) {
            return preco + (preco * 0.3);
        } else {
            return preco;
        }
    }

}
