package br.com.alura.fj93;

import java.util.Objects;

public class Cpf implements Documento {
    private final String valor;

    public boolean ehValido() {
        return primeiroDigitoVerificador() == primeiroDigitoCorreto() &&
                segundoDigitoVerificador() == segundoDigitoCorreto();
    }

    public Cpf(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cpf cpf = (Cpf) o;
        return Objects.equals(valor, cpf.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
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
}
