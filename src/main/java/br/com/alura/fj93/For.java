package br.com.alura.fj93;

public class For {
    public void percorreColecao(Iteravel iteravel) {

        Iterador sequencia = iteravel.percorreColecao();

       Object primeiro = sequencia.proximo();
       Object segundo = sequencia.proximo();

    }
}
