package org.example;

public class Saque implements InterpretadorExpressao {

    private double saldo;
    private double valor;

    public Saque(Numero saldoAtual, Numero valorSaque) {
        this.saldo = saldoAtual.getNumero();
        this.valor = valorSaque.getNumero();
    }

    public double interpretar() {
        return saldo - valor;
    }
}