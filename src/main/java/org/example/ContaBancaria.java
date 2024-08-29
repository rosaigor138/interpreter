package org.example;

public class ContaBancaria {
    private double saldoInicial;
    private double valorTransacao;

    public double getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public double getValorTransacao() {
        return valorTransacao;
    }

    public void setValorTransacao(double valorTransacao) {
        this.valorTransacao = valorTransacao;
    }

    public double calcularSaldo(String operacao) {
        return Banco.calcularSaldo(this.saldoInicial, this.valorTransacao, operacao);
    }
}
