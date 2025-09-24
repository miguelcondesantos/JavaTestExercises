package com.exercicios.ExerciciosJava.exercicio4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {

    @Test
    void testModulo() {
        Complex c = new Complex(3, 4);
        assertEquals(5.0, c.modulo(), "O módulo do número complexo está incorreto");
    }

    @Test
    void testAdicao() {
        Complex c1 = new Complex(1, 2);
        Complex c2 = new Complex(3, 4);
        Complex resultado = c1.adicao(c2);
        assertEquals(new Complex(4, 6), resultado, "A adição de números complexos está incorreta");
    }

    @Test
    void testDivisao() {
        Complex c1 = new Complex(1, 2);
        Complex c2 = new Complex(2, 1);
        Complex resultado = c1.divisao(c2);
        assertEquals(new Complex(0.8, 0.6), resultado, "A divisão de números complexos está incorreta");
    }
}
