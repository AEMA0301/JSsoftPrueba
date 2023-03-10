package com.report.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "REPORT")
public class Report {
	@Id
	@Column (name = "ID")
	@GeneratedValue
	private int id;
	@Column (name = "TIPO")
	private String tipo;
	@Column (name = "FOLIO")
	private String folio;
	@Column (name = "COMENTARIO")
	private String comentario;

	public Report() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Report(int id) {
		super();
		this.id = id;
	}
	

	public Report(int id, String tipo, String folio, String comentario) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.folio = folio;
		this.comentario = comentario;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getFolio() {
		return folio;
	}
	public void setFolio(String folio) {
		this.folio = folio;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
	
}
