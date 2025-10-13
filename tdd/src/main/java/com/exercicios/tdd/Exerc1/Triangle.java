package com.exercicios.tdd.Exerc1;

public class Triangle {

    public static String classify(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0)
            return "Inválido";

        if (a + b <= c || a + c <= b || b + c <= a)
            return "Inválido";

        if (a == b && b == c)
            return "Equilátero";
        else if (a == b || b == c || a == c)
            return "Isósceles";
        else
            return "Escaleno";
    }
}
