package br.com.alura.fj93;

public class IteradorDoHashSet implements Iterador {

    private final HashSet colecao;

    public IteradorDoHashSet(HashSet colecao) {
        this.colecao = colecao;
    }

    public Object proximo() {
        return null;
    }
}
