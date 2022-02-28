package br.com.alura.fj93;

public class MinhaEmpresa {
    public static void main(String[] args) {
        BancoDeDados bancoDeDados = new BancoDeDados("localhost", "usuario", "1234");
        BalancoEmpresa balanco = new BalancoEmpresa(bancoDeDados);

        //métodos

        bancoDeDados.desconecta();
    }
}
