package br.fateczl.amigosecreto.entidade;

import java.io.Serializable;

public class Participante implements Serializable {
	private static final long serialVersionUID = 1L;
	private String nome;
	private String email;
	private String dicaPresente;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDicaPresente() {
		return dicaPresente;
	}
	public void setDicaPresente(String dicaPresente) {
		this.dicaPresente = dicaPresente;
	}
	
	
}
