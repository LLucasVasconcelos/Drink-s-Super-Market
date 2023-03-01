package Model;

public class Cliente {
    private String nome;
    private String cpf;
    private int anoNascimento;

    public Cliente(String nome, String cpf, int anoNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.anoNascimento = anoNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getIdade() {
        return 2022 - anoNascimento;
    }
}
