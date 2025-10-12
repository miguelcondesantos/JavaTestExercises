package com.exercicios.ExerciciosJava;

import com.exercicios.ExerciciosJava.exercicio2.Invoice;
import com.exercicios.ExerciciosJava.exercicio3.Empregado;
import com.exercicios.ExerciciosJava.exercicio4.Complex;
import com.exercicios.ExerciciosJava.exercicio5.Data;

public class App {
  public static void main(String[] args) {
	  executarExercicio2();
      executarExercicio3();
      executarExercicio4();
      executarExercicio5();
  }
  
  //Invoice
  public static void executarExercicio2() {
      System.out.println("Exercício 2 - Invoice:");
      Invoice invoice = new Invoice(101, "Computador", 5, 1200.00);
      System.out.println("Invoice: " + invoice);
      System.out.println("Valor da fatura: R$ " + invoice.getInvoiceAmount());
      System.out.println();
  }

  //Empregado
  public static void executarExercicio3() {
      System.out.println("Exercício 3 - Empregado:");
      Empregado emp1 = new Empregado("João", "Silva", 3000.00);
      Empregado emp2 = new Empregado("Maria", "Oliveira", 4000.00);
      
      System.out.println("Salário anual de João: R$ " + emp1.calcularSalarioAnual());
      System.out.println("Salário anual de Maria: R$ " + emp2.calcularSalarioAnual());

      //Aumento de 10%
      emp1.setSalarioMensal(emp1.getSalarioMensal() * 1.10);
      emp2.setSalarioMensal(emp2.getSalarioMensal() * 1.10);

      System.out.println("Novo salário anual de João: R$ " + emp1.calcularSalarioAnual());
      System.out.println("Novo salário anual de Maria: R$ " + emp2.calcularSalarioAnual());
      System.out.println();
  }

  //Complex
  public static void executarExercicio4() {
      System.out.println("Exercício 4 - Complex:");
      Complex c1 = new Complex(3, 4);
      Complex c2 = new Complex(1, 2);
      System.out.println("C1: " + c1);
      System.out.println("C2: " + c2);
      Complex resultado = c1.adicao(c2);
      System.out.println("C1 + C2: " + resultado);
      resultado = c1.multiplicacao(c2);
      System.out.println("C1 * C2: " + resultado);
      System.out.println();
  }

  //Data
  public static void executarExercicio5() {
      System.out.println("Exercício 5 - Data:");
      Data data = new Data();
      System.out.println("Data atual: " + data);
      data.avancarDia();
      System.out.println("Data do dia seguinte: " + data);
  }
}
