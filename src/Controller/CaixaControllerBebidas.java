package Controller;


import Model.*;


public class CaixaControllerBebidas extends ICaixaController {

    public CaixaControllerBebidas(Caixa caixa) {
        super(caixa);
    }

    public void addVenda(Cliente cliente,ProdutoAbstract produto) {

        if (cliente!=null) {
            if (cliente.getIdade() >= 18) {
                if (produto != null)
                    this.caixa.addVenda(cliente, produto);
                else
                    System.out.println("Não Existe Bebida!");
            } else {
                System.out.println("Cliente Menor de Idade");
            }
        }
    }
    }




