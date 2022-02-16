package com.codingdojo.abstractart;

public class Pintura extends Arte {
	private String tipoPintura;
	
	public Pintura(String titulo, String autor, String descripcion, String tipoPintura ) {
		super(titulo,autor,descripcion);
		this.tipoPintura = tipoPintura;
	}
	
	@Override
	public void verArte() {
		System.out.println("Pintura: "+this.titulo+" "+this.autor+" "+this.descripcion+" "+this.tipoPintura);
	}

	public String getTipoPintura() {
		return tipoPintura;
	}

	public void setTipoPintura(String tipoPintura) {
		this.tipoPintura = tipoPintura;
	}
	
	

}
