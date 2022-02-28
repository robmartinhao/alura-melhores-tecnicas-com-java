package br.com.alura.fj93;

public class GerenciadorDeDividas {
    public void efetuaPagamento(Divida divida, double valor, String nomePagador, Cnpj cnpjPagador) {
        Pagamento pagamento = new Pagamento();
        pagamento.setCnpjPagador(cnpjPagador);
        pagamento.setPagador(nomePagador);
        pagamento.setValor(valor);
        divida.registra(pagamento);
    }
}
