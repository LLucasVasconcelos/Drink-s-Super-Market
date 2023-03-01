package Model;

import java.util.ArrayList;

public class Estoque {
    public ArrayList<ProdutoAbstract> produtos = new ArrayList<>();

    public void addProdutos(ProdutoAbstract produto) {
        produtos.add(produto);
    }

    public void removerProduto(ProdutoAbstract produto) {
        produtos.remove(produto);
    }


    public ArrayList<ProdutoAbstract> getProdutos() {
        return produtos;
    }

    public ProdutoAbstract buscarProdutos(String nome) {
        for (ProdutoAbstract produto : produtos) {
            if (produto.getNome().equals(nome)) {
                return produto;
            }
        }
        return null;

    }

    public void setProdutos(ArrayList<ProdutoAbstract> produtos) {
        this.produtos = produtos;
    }
}
