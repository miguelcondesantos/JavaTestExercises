package com.exercicios.ExerciciosJava.exercicio4;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.Objects;

@Getter
@Setter
@ToString
public class Complex {
    private double real;
    private double imaginario;

    public Complex() {
        this.real = 0;
        this.imaginario = 0;
    }

    public Complex(double real) {
        this.real = real;
        this.imaginario = 0;
    }

    public Complex(double real, double imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }

    public double modulo() {
        return Math.sqrt(real * real + imaginario * imaginario);
    }

    public double argumento() {
        return Math.atan2(imaginario, real);
    }

    public Complex adicao(Complex outro) {
        return new Complex(this.real + outro.real, this.imaginario + outro.imaginario);
    }

    public Complex subtracao(Complex outro) {
        return new Complex(this.real - outro.real, this.imaginario - outro.imaginario);
    }

    public Complex multiplicacao(Complex outro) {
        double realParte = this.real * outro.real - this.imaginario * outro.imaginario;
        double imagParte = this.real * outro.imaginario + this.imaginario * outro.real;
        return new Complex(realParte, imagParte);
    }

    public Complex divisao(Complex outro) {
        double divisor = outro.real * outro.real + outro.imaginario * outro.imaginario;
        double realParte = (this.real * outro.real + this.imaginario * outro.imaginario) / divisor;
        double imagParte = (this.imaginario * outro.real - this.real * outro.imaginario) / divisor;
        return new Complex(realParte, imagParte);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Complex)) return false;
        Complex c = (Complex) o;
        return Math.abs(this.real - c.real) < 0.0001 &&
               Math.abs(this.imaginario - c.imaginario) < 0.0001;
    }

    @Override
    public int hashCode() {
        return Objects.hash(real, imaginario);
    }
}
