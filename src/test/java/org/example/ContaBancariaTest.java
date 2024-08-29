package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContaBancariaTest {

    @Test
    void deveCalcularSaldoComDeposito() {
        ContaBancaria conta = new ContaBancaria();
        conta.setSaldoInicial(100.0);
        conta.setValorTransacao(50.0);

        assertEquals(150.0, conta.calcularSaldo("deposito"));
    }

    @Test
    void deveCalcularSaldoComSaque() {
        ContaBancaria conta = new ContaBancaria();
        conta.setSaldoInicial(100.0);
        conta.setValorTransacao(30.0);

        assertEquals(70.0, conta.calcularSaldo("saque"));
    }
}