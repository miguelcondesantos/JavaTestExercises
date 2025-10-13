package com.exercicios.tdd.Exerc3;

public class CalculadoraSalario {

    public double calcularSalarioLiquido(Funcionario funcionario) {
        double salario = funcionario.getSalarioBase();
        Cargo cargo = funcionario.getCargo();
        
        if (cargo == null) {
            throw new IllegalArgumentException("Cargo inválido");
        }
        
        double desconto = 0.0;

        switch (cargo) {
            case DESENVOLVEDOR:
                desconto = (salario >= 3000) ? 0.20 : 0.10;
                break;
            case DBA:
            case TESTADOR:
                desconto = (salario >= 2000) ? 0.25 : 0.15;
                break;
            case GERENTE:
                desconto = (salario >= 5000) ? 0.30 : 0.20;
                break;
            default:
                throw new IllegalArgumentException("Cargo inválido");
        }

        return salario * (1 - desconto);
    }
}
