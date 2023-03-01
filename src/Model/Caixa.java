package Model;


import java.util.ArrayList;

public class Caixa {
    protected ArrayList<Venda> vendas = new ArrayList<>();
    protected ArrayList<Cliente> clientes = new ArrayList<>();

    private Estoque estoque;

    public Caixa(Estoque estoque) {
        this.estoque = estoque;
    }


    public void addVenda(Cliente cliente,ProdutoAbstract produtoAbstract){
        Venda venda=new Venda(produtoAbstract, cliente);
        if (cliente!=null && produtoAbstract!=null){
           vendas.add(venda);
           estoque.removerProduto(venda.getProduto());
        } else if (venda.getProduto() == null) {
            System.out.println("Não tem no estoque.");
        } else if (venda.getCliente() == null) {
            System.out.println("Cliente não consta no caixa.");
        }
    }

    public void addCliente(Cliente cliente){
        clientes.add(cliente);
    }

    public Cliente buscarCliente(String cpf) {
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equalsIgnoreCase(cpf)) {
                return cliente;
            }
        }
        return null;
    }

    public void mostrarVendascpf(String cpf) {
        System.out.println();
        System.out.println();
        System.out.println("Vendas para o CPF: " + cpf);
        System.out.println();
        for (Venda venda : vendas) {
            if (venda.getCliente().getCpf().equalsIgnoreCase(cpf)) {
                System.out.println("O Produto foi:  " + venda.getProduto().getNome() + " No valor de: " + venda.getValor() + "\n");
            }
        }
    }

    public void faturamentoVenda() {
        double soma = 0;
        for (Venda venda : vendas) {
            if (venda.getValor() != 0) {
                soma += venda.getValor();
            }
        }
        System.out.println("Total faturado no caixa " + soma + " R$");
    }

    public void clienteMaisCompras() {
        int cont;
        int clienteMaisCompras = 0;
        System.out.println();
        System.out.println();
        System.out.println("Cliente com mais compras: ");
        System.out.println();
        for (Cliente cliente : clientes) {
            cont = 0;
            for (Venda venda : vendas) {
                if (venda.getCliente().getCpf().equalsIgnoreCase(cliente.getCpf()) && venda.getValor() != 0) {
                    cont++;
                }
                if (clienteMaisCompras < cont) {
                    clienteMaisCompras = cont;
                }
            }
        }
        for (Cliente cliente : clientes) {
            cont = 0;
            for (Venda venda : vendas) {
                if (venda.getCliente().getCpf().equalsIgnoreCase(cliente.getCpf())) {
                    cont++;
                }
            }
            if (cont == clienteMaisCompras) {
                System.out.println("nome: " + cliente.getNome() + "\n" + "CPF: " + cliente.getCpf() + "\n" + "Comprou: " + cont + " vezes");
            }
        }
    }

    public void produtoMaisVendido() {
        int cont;
        int contMaisCompras = 0;
        System.out.println();
        System.out.println();
        System.out.println("Produto mais vendido");
        System.out.println();

        for (ProdutoAbstract produto : estoque.produtos) {
            cont = 0;
            for (Venda venda : vendas) {
                if (venda.getProduto().getNome().equalsIgnoreCase(produto.getNome())) {
                    cont++;
                }
                if (cont > contMaisCompras) {
                    contMaisCompras = cont;
                }
            }
        }

        for (ProdutoAbstract produto : estoque.produtos) {
            cont = 0;
            for (Venda venda : vendas) {
                if (venda.getProduto().getNome().equalsIgnoreCase(produto.getNome())) {
                    cont++;
                }
            }
            if (cont == contMaisCompras) {
                System.out.println("nome: " + produto.getNome() + "\n" + "Comprou: " + cont + " vezes");
                break;
            }
        }
    }

    public Estoque getEstoque() {
        return estoque;
    }
}
