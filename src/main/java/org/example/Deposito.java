package org.example;

public class Deposito implements InterpretadorExpressao {

    private double saldo;
    private double valor;

    public Deposito(Numero saldoAtual, Numero valorDeposito) {
        this.saldo = saldoAtual.getNumero();
        this.valor = valorDeposito.getNumero();
    }

    public double interpretar() {
        return saldo + valor;
    }
}
