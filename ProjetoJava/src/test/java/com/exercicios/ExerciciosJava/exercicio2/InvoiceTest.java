package com.exercicios.ExerciciosJava.exercicio2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InvoiceTest {

    @Test
    void testGetInvoiceAmount() {
        Invoice invoice = new Invoice(101, "Computador", 5, 1200.00);
        assertEquals(6000.00, invoice.getInvoiceAmount(), "O valor da fatura está incorreto");
    }

    @Test
    void testConstrutorQuantidadeNegativa() {
        Invoice invoice = new Invoice(101, "Computador", -1, 1200.00);
        assertEquals(0, invoice.getQuantidade(), "A quantidade deve ser 0 para valores negativos");
    }

    @Test
    void testConstrutorPrecoNegativo() {
        Invoice invoice = new Invoice(101, "Computador", 5, -1200.00);
        assertEquals(0.0, invoice.getPrecoUnitario(), "O preço unitário deve ser 0 para valores negativos");
    }
}
