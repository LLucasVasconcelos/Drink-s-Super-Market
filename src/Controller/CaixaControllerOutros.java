package Controller;



import Model.*;


public class CaixaControllerOutros extends ICaixaController {

    public CaixaControllerOutros(Caixa caixa) {
        super(caixa);
    }

    public void addVenda(Cliente cliente,ProdutoAbstract produtoAbstract) {
        this.caixa.addVenda(cliente,produtoAbstract);
    }


}



