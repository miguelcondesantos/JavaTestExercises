package com.exercicios.ExerciciosJava.exercicio2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Invoice{
	private int numeroItem;
	private String descricaoItem;
	private int quantidade;
	private double precoUnitario;
	
	public Invoice (int numeroItem, String descricaoItem, int quantidade, double precoUnitario){
		this.numeroItem = numeroItem;
		this.descricaoItem = descricaoItem;
		this.quantidade = (quantidade > 0) ? quantidade: 0;
		this.precoUnitario = (precoUnitario > 0.0) ? precoUnitario : 0.0;
	}
	
	public double getInvoiceAmount(){
		return quantidade * precoUnitario;
	}
}