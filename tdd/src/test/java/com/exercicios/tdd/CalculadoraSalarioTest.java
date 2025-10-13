package com.exercicios.tdd;

import org.junit.jupiter.api.Test;

import com.exercicios.tdd.Exerc3.CalculadoraSalario;
import com.exercicios.tdd.Exerc3.Cargo;
import com.exercicios.tdd.Exerc3.Funcionario;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraSalarioTest {

    private final CalculadoraSalario calc = new CalculadoraSalario();

    @Test
    void testDesenvolvedorSalarioMenorQue3000() {
        Funcionario f = new Funcionario("João", "joao@empresa.com", 2500.0, Cargo.DESENVOLVEDOR);
        assertEquals(2250.0, calc.calcularSalarioLiquido(f), 0.001);
    }

    @Test
    void testDesenvolvedorSalarioMaiorOuIgual3000() {
        Funcionario f = new Funcionario("Ana", "ana@empresa.com", 3000.0, Cargo.DESENVOLVEDOR);
        assertEquals(2400.0, calc.calcularSalarioLiquido(f), 0.001);
    }

    @Test
    void testDbaSalarioMenorQue2000() {
        Funcionario f = new Funcionario("Carlos", "carlos@empresa.com", 1800.0, Cargo.DBA);
        assertEquals(1530.0, calc.calcularSalarioLiquido(f), 0.001);
    }

    @Test
    void testDbaSalarioMaiorOuIgual2000() {
        Funcionario f = new Funcionario("Maria", "maria@empresa.com", 2000.0, Cargo.DBA);
        assertEquals(1500.0, calc.calcularSalarioLiquido(f), 0.001);
    }

    @Test
    void testTestadorSalarioMaiorOuIgual2000() {
        Funcionario f = new Funcionario("Bruno", "bruno@empresa.com", 2500.0, Cargo.TESTADOR);
        assertEquals(1875.0, calc.calcularSalarioLiquido(f), 0.001);
    }

    @Test
    void testGerenteSalarioMenorQue5000() {
        Funcionario f = new Funcionario("Paula", "paula@empresa.com", 4000.0, Cargo.GERENTE);
        assertEquals(3200.0, calc.calcularSalarioLiquido(f), 0.001);
    }

    @Test
    void testGerenteSalarioMaiorOuIgual5000() {
        Funcionario f = new Funcionario("José", "jose@empresa.com", 6000.0, Cargo.GERENTE);
        assertEquals(4200.0, calc.calcularSalarioLiquido(f), 0.001);
    }

    @Test
    void testCargoInvalido() {
        Funcionario f = new Funcionario("Erro", "erro@empresa.com", 3000.0, null);
        assertThrows(IllegalArgumentException.class, () -> calc.calcularSalarioLiquido(f));
    }
}
