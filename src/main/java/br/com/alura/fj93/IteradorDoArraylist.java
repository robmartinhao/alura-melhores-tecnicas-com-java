package br.com.alura.fj93;

public class IteradorDoArraylist implements Iterador {

    private final ArrayList colecao;

    public IteradorDoArraylist(ArrayList colecao) {
        this.colecao = colecao;
    }

    public Object proximo() {
        return null;
    }
}
