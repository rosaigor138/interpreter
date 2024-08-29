package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InterpretadorExpressaoTest {

    @Test
    void deveCalcularExpressaoDeposito() {
        InterpretadorExpressao interpretador = new InterpretadorExpressoesBancarias("100 deposito 50");
        assertEquals(150.0, interpretador.interpretar());
    }

    @Test
    void deveCalcularExpressaoSaque() {
        InterpretadorExpressao interpretador = new InterpretadorExpressoesBancarias("100 saque 30");
        assertEquals(70.0, interpretador.interpretar());
    }

    @Test
    void deveCalcularExpressaoCombinada() {
        // Neste exemplo, vamos simular um saldo inicial, um depósito e depois um saque.
        // Começa com saldo de 100, deposita 50 (150), e saca 20 (130).
        InterpretadorExpressao interpretador = new InterpretadorExpressoesBancarias("100 deposito 50 saque 20");
        assertEquals(130.0, interpretador.interpretar());
    }

    @Test
    void deveRetonarExcecaoElementoInvalido() {
        try {
            InterpretadorExpressao interpretador = new InterpretadorExpressoesBancarias("100 ^ 50");
            interpretador.interpretar();
            fail("Deveria ter lançado uma exceção");
        } catch(IllegalArgumentException e) {
            assertEquals("Expressão com elemento inválido", e.getMessage());
        }
    }

    @Test
    void deveRetonarExcecaoInvalida() {
        try {
            InterpretadorExpressao interpretador = new InterpretadorExpressoesBancarias("100 deposito");
            interpretador.interpretar();
            fail("Deveria ter lançado uma exceção");
        } catch(IllegalArgumentException e) {
            assertEquals("Expressão inválida", e.getMessage());
        }
    }
}
