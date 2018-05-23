package br.fateczl.amigosecreto.entidade;

import java.io.Serializable;
import java.text.DecimalFormat;

public class Evento implements Serializable{
	private static final long serialVersionUID = 1L;

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
