package View;

import Controller.CaixaControllerBebidas;
import Controller.CaixaControllerOutros;
import Controller.ICaixaController;
import Model.*;


public class Main {
    public static void main(String[] args) {

        Estoque estoque = new Estoque();

        estoque.addProdutos(new ProdutoSemRestricao("Carvao", 6.5));
        estoque.addProdutos(new ProdutoSemRestricao("Carvao", 6.5));
        estoque.addProdutos(new ProdutoSemRestricao("Carvao", 6.5));
        estoque.addProdutos(new ProdutoSemRestricao("Carvao", 6.5));
        estoque.addProdutos(new ProdutoSemRestricao("Carvao", 6.5));
        estoque.addProdutos(new ProdutoSemRestricao("Carvao", 6.5));
        estoque.addProdutos(new ProdutoSemRestricao("Cafe", 10.5));
        estoque.addProdutos(new ProdutoSemRestricao("Cafe", 10.5));
        estoque.addProdutos(new ProdutoSemRestricao("Cafe", 10.5));
        estoque.addProdutos(new ProdutoSemRestricao("Cafe", 10.5));
        estoque.addProdutos(new ProdutoSemRestricao("Cafe", 10.5));
        estoque.addProdutos(new ProdutoSemRestricao("Cafe", 10.5));
        estoque.addProdutos(new ProdutoSemRestricao("Cafe", 10.5));
        estoque.addProdutos(new ProdutoSemRestricao("Cafe", 10.5));


        estoque.addProdutos(new Cerveja("cervejaGelada", "1000", 2.50, "gelada"));
        estoque.addProdutos(new Cerveja("cervejaGelada", "1000", 2.50, "gelada"));
        estoque.addProdutos(new Cerveja("cervejaGelada", "1000", 2.50, "gelada"));
        estoque.addProdutos(new Cerveja("cervejaGelada", "1000", 2.50, "gelada"));
        estoque.addProdutos(new Cerveja("cervejaGelada", "1000", 2.50, "gelada"));
        estoque.addProdutos(new Cerveja("cervejaGelada", "1000", 2.50, "gelada"));
        estoque.addProdutos(new Cerveja("cervejaGelada", "1000", 2.50, "gelada"));
        estoque.addProdutos(new Cerveja("cerveja", "1000", 2.50, "natural"));
        estoque.addProdutos(new Cerveja("cerveja", "1000", 2.50, "natural"));
        estoque.addProdutos(new Cerveja("cerveja", "1000", 2.50, "natural"));
        estoque.addProdutos(new Cerveja("cerveja", "1000", 2.50, "natural"));
        estoque.addProdutos(new Cerveja("cerveja", "1000", 2.50, "natural"));
        estoque.addProdutos(new Cerveja("cerveja", "1000", 2.50, "natural"));
        estoque.addProdutos(new Cerveja("cerveja", "1000", 2.50, "natural"));


        estoque.addProdutos(new Whisky("whisky18", "1000ml", 40, 18));
        estoque.addProdutos(new Whisky("whisky18", "1000ml", 40, 18));
        estoque.addProdutos(new Whisky("whisky18", "1000ml", 40, 18));
        estoque.addProdutos(new Whisky("whisky18", "1000ml", 40, 18));
        estoque.addProdutos(new Whisky("whisky18", "1000ml", 40, 18));
        estoque.addProdutos(new Whisky("whisky18", "1000ml", 40, 18));
        estoque.addProdutos(new Whisky("whisky18", "1000ml", 40, 18));
        estoque.addProdutos(new Whisky("whisky18", "1000ml", 40, 18));
        estoque.addProdutos(new Whisky("whisky16", "1000ml", 40, 16));
        estoque.addProdutos(new Whisky("whisky16", "1000ml", 40, 16));
        estoque.addProdutos(new Whisky("whisky16", "1000ml", 40, 16));
        estoque.addProdutos(new Whisky("whisky16", "1000ml", 40, 16));
        estoque.addProdutos(new Whisky("whisky16", "1000ml", 40, 16));
        estoque.addProdutos(new Whisky("whisky16", "1000ml", 40, 16));
        estoque.addProdutos(new Whisky("whisky16", "1000ml", 40, 16));
        estoque.addProdutos(new Whisky("whisky16", "1000ml", 40, 16));
        estoque.addProdutos(new Whisky("whisky16", "1000ml", 40, 16));
        estoque.addProdutos(new Whisky("whisky16", "1000ml", 40, 16));

        estoque.addProdutos(new Vodka("vodkaPremium", "1000ml", 20, "premium"));
        estoque.addProdutos(new Vodka("vodkaPremium", "1000ml", 20, "premium"));
        estoque.addProdutos(new Vodka("vodkaPremium", "1000ml", 20, "premium"));
        estoque.addProdutos(new Vodka("vodkaPremium", "1000ml", 20, "premium"));
        estoque.addProdutos(new Vodka("vodkaPremium", "1000ml", 20, "premium"));
        estoque.addProdutos(new Vodka("vodkaPremium", "1000ml", 20, "premium"));
        estoque.addProdutos(new Vodka("vodkaPremium", "1000ml", 20, "premium"));


        estoque.addProdutos(new Vodka("vodka", "1000ml", 20, "Normal"));
        estoque.addProdutos(new Vodka("vodka", "1000ml", 20, "Normal"));
        estoque.addProdutos(new Vodka("vodka", "1000ml", 20, "Normal"));
        estoque.addProdutos(new Vodka("vodka", "1000ml", 20, "Normal"));
        estoque.addProdutos(new Vodka("vodka", "1000ml", 20, "Normal"));
        estoque.addProdutos(new Vodka("vodka", "1000ml", 20, "Normal"));
        estoque.addProdutos(new Vodka("vodka", "1000ml", 20, "Normal"));
        estoque.addProdutos(new Vodka("vodka", "1000ml", 20, "Normal"));
        estoque.addProdutos(new Vodka("vodka", "1000ml", 20, "Normal"));

        Caixa caixa = new Caixa(estoque);

        caixa.addCliente(new Cliente("Giniceu", "123456789", 2000));
        caixa.addCliente(new Cliente("Androceu", "321654987", 2002));
        caixa.addCliente(new Cliente("Maria", "789456123", 2001));
        caixa.addCliente(new Cliente("joão", "654789123", 2002));
        caixa.addCliente(new Cliente("pedro", "321987654", 2003));
        caixa.addCliente(new Cliente("Andre", "456789123", 2006));
        caixa.addCliente(new Cliente("Miguel", "12736172", 2004));
        caixa.addCliente(new Cliente("Vinicius", "987456321", 2002));
        caixa.addCliente(new Cliente("Clara", "789321456", 2001));
        caixa.addCliente(new Cliente("Marcos", "643512987", 2000));
        caixa.addCliente(new Cliente("Jubileu", "764197489", 2016));
        caixa.addCliente(new Cliente("Lucas", "42340905", 2003));

        ProdutoAbstract produtoAbstract = caixa.getEstoque().buscarProdutos("vodka");
        ICaixaController cc;


        if (produtoAbstract instanceof BebidaAbstract) {
            cc = new CaixaControllerBebidas(caixa);
            cc.addVenda(caixa.buscarCliente("42340905"), produtoAbstract);
        } else {
            cc = new CaixaControllerOutros(caixa);
            cc.addVenda(caixa.buscarCliente("42340905"), produtoAbstract);
        }

        cc.imprimirFaturamento();
        cc.faturamentoVenda();
        cc.clienteMaisCompras();
        cc.produtoMaisVendido();
        cc.mostrarVendascpf("42340905");
        cc.faturamentoVenda();
        cc.clienteMaisCompras();
        cc.produtoMaisVendido();


    }

}
