package com.exercicios.tdd.Exerc3;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Funcionario {
    private String nome;
    private String email;
    private double salarioBase;
    private Cargo cargo;
}
