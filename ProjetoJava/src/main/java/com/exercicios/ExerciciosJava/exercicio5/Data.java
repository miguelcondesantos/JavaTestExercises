package com.exercicios.ExerciciosJava.exercicio5;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.time.LocalDate;

@Getter
@Setter
@ToString
public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        if (dia < 1 || dia > 31 || mes < 1 || mes > 12 || ano < 1900) {
            throw new IllegalArgumentException("Data inválida.");
        }
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public Data() {
        LocalDate today = LocalDate.now();
        this.dia = today.getDayOfMonth();
        this.mes = today.getMonthValue();
        this.ano = today.getYear();
    }

    public void avancarDia() {
        LocalDate currentDate = LocalDate.of(ano, mes, dia).plusDays(1);
        this.dia = currentDate.getDayOfMonth();
        this.mes = currentDate.getMonthValue();
        this.ano = currentDate.getYear();
    }

    public static void main(String[] args) {
        Data data = new Data();
        System.out.println("Data atual: " + data);
        data.avancarDia();
        System.out.println("Data do dia seguinte: " + data);
    }
}
