package br.com.alura.fj93;

public interface ArmazenadorDeDividas {

    void salva(Divida divida);
    Divida carrega(Documento documentoCredor);
}
