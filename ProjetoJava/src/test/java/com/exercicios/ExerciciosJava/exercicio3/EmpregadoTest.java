package com.exercicios.ExerciciosJava.exercicio3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EmpregadoTest {

    @Test
    void testCalcularSalarioAnual() {
        Empregado emp = new Empregado("João", "Silva", 3000.00);
        assertEquals(36000.00, emp.calcularSalarioAnual(), "O salário anual está incorreto");
    }

    @Test
    void testConstrutorSalarioNegativo() {
        Empregado emp = new Empregado("Maria", "Oliveira", -2000.00);
        assertEquals(0.0, emp.getSalarioMensal(), "O salário mensal deve ser 0 para valores negativos");
    }
}
