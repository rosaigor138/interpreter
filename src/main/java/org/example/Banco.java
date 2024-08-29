package org.example;

public class Banco {

    public static double calcularSaldo(double saldoInicial, double valor, String operacao) {
        String expressao;
        expressao = saldoInicial + " " + operacao + " " + valor;
        InterpretadorExpressao interpretador = new InterpretadorExpressoesBancarias(expressao);
        return interpretador.interpretar();
    }
}