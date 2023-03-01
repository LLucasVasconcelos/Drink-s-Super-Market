package Model;

public class Cerveja extends BebidaAbstract {
    private String temperatura;


    public Cerveja(String nome, String volume, double preco, String temperatura) {
        super(nome, volume, preco);
        this.temperatura = temperatura;

    }

    public String getTemperatura() {
        return temperatura;
    }

    @Override
    public double getPreco() {
        if (getTemperatura().equalsIgnoreCase("gelada")) {
            return preco + (preco * 0.1);
        } else {
            return preco;
        }
    }
}
