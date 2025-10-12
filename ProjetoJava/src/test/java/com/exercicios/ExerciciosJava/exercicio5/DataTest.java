package com.exercicios.ExerciciosJava.exercicio5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DataTest {

    @Test
    void testConstrutorDataValida() {
        Data data = new Data(12, 8, 2025);
        assertEquals(12, data.getDia(), "O dia está incorreto");
        assertEquals(8, data.getMes(), "O mês está incorreto");
        assertEquals(2025, data.getAno(), "O ano está incorreto");
    }

    @Test
    void testConstrutorDataInvalida() {
        assertThrows(IllegalArgumentException.class, () -> new Data(32, 13, 2025), "A data inválida não deveria ser aceita");
    }

    @Test
    void testAvancarDia() {
        Data data = new Data(31, 12, 2025);
        data.avancarDia();
        assertEquals(1, data.getDia(), "O dia não avançou corretamente");
        assertEquals(1, data.getMes(), "O mês não avançou corretamente");
        assertEquals(2026, data.getAno(), "O ano não avançou corretamente");
    }
}
