package br.fateczl.amigosecreto.entidade;

import java.text.DecimalFormat;

public class Evento {

	private String nome;
	private DecimalFormat valorSugerido;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public DecimalFormat getValorSugerido() {
		return valorSugerido;
	}
	
	public void setValorSugerido(DecimalFormat valorSugerido) {
		this.valorSugerido = valorSugerido;
	}
}
