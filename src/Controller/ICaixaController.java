package Controller;

import Model.Caixa;
import Model.Cliente;
import Model.ProdutoAbstract;

public abstract class ICaixaController {

    protected Caixa caixa;

    public ICaixaController(Caixa caixa) {
        this.caixa = caixa;
    }

    public abstract void addVenda(Cliente cliente,ProdutoAbstract produtoAbstract);

    public void imprimirFaturamento() {
        caixa.faturamentoVenda();
    }

    public void mostrarVendascpf(String cpf) {
        caixa.mostrarVendascpf(cpf);
    }

    public void faturamentoVenda() {
        caixa.faturamentoVenda();
    }
    public void clienteMaisCompras() {
caixa.clienteMaisCompras();
    }
    public void produtoMaisVendido() {
        caixa.produtoMaisVendido();
    }
}
