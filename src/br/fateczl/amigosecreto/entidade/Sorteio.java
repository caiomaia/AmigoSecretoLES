package br.fateczl.amigosecreto.entidade;

import java.io.Serializable;
import java.sql.Date;

public class Sorteio implements Serializable{
	private static final long serialVersionUID = 1L;
	private Date data;
	private String local;
	private String horario;
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	
	
	
}
