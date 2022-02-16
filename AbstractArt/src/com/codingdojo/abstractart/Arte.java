package com.codingdojo.abstractart;

public abstract class Arte {
	protected String titulo;
	protected String autor;
	protected String descripcion;
	
	public Arte(String titulo, String autor, String descripcion) {
		this.titulo = titulo;
		this.autor = autor;
		this.descripcion = descripcion;
	}

	public abstract void verArte();

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
