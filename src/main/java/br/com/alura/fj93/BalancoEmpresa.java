package br.com.alura.fj93;

import java.util.HashMap;

public class BalancoEmpresa {

    private final HashMap<Documento, Divida> dividas = new HashMap<>();

    public void registraDivida(Divida divida) {
            dividas.put(divida.getDocumentoCredor(), divida);
    }

    public void pagaDivida(Documento documentoCredor, Pagamento pagamento) {
        Divida divida = dividas.get(documentoCredor);
        if (divida != null) {
            divida.registra(pagamento);
        }
    }
}
