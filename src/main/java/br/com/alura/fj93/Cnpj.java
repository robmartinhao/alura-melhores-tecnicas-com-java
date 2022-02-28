package br.com.alura.fj93;

public class Cnpj {

    private String valor;

    public boolean ehValido() {
        return primeiroDigitoVerificador() == primeiroDigitoCorreto() &&
                segundoDigitoVerificador() == segundoDigitoCorreto();
    }

    private int segundoDigitoCorreto() {
        //TODO
        return 2;
    }
    private int segundoDigitoVerificador() {
        //TODO
        return 2;
    }
    private int primeiroDigitoCorreto() {
        //TODO
        return 1;
    }
    private int primeiroDigitoVerificador() {
        //TODO
        return 1;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String novoValor) {
        this.valor = novoValor;
    }

    @Override
    public String toString() {
        return this.valor;
    }
}
