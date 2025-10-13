package com.exercicios.tdd;

import org.junit.jupiter.api.Test;

import com.exercicios.tdd.Exerc1.Triangle;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void testEscalenoValido() {
        assertEquals("Escaleno", Triangle.classify(3, 4, 5));
    }

    @Test
    void testIsoscelesValido() {
        assertEquals("Isósceles", Triangle.classify(5, 5, 3));
        assertEquals("Isósceles", Triangle.classify(5, 3, 5));
        assertEquals("Isósceles", Triangle.classify(3, 5, 5));
    }

    @Test
    void testEquilateroValido() {
        assertEquals("Equilátero", Triangle.classify(4, 4, 4));
    }

    @Test
    void testValorZero() {
        assertEquals("Inválido", Triangle.classify(0, 3, 4));
    }

    @Test
    void testValorNegativo() {
        assertEquals("Inválido", Triangle.classify(-3, 4, 5));
    }

    @Test
    void testSomaIgualAoTerceiro() {
        assertEquals("Inválido", Triangle.classify(2, 3, 5));
        assertEquals("Inválido", Triangle.classify(3, 5, 2));
        assertEquals("Inválido", Triangle.classify(5, 2, 3));
    }

    @Test
    void testSomaMenorQueTerceiro() {
        assertEquals("Inválido", Triangle.classify(2, 3, 6));
        assertEquals("Inválido", Triangle.classify(3, 6, 2));
        assertEquals("Inválido", Triangle.classify(6, 2, 3));
    }

    @Test
    void testTresZeros() {
        assertEquals("Inválido", Triangle.classify(0, 0, 0));
    }
}