package com.codingdojo.abstractart;

public class Escultura extends Arte {
	private String material;
	
	public Escultura(String titulo, String autor, String descripcion, String material) {
		super(titulo,autor,descripcion);
		this.material = material;
	}
	
	@Override
	public void verArte() {
		System.out.println("Escultura: "+this.titulo+" "+this.autor+" "+this.descripcion+" "+this.material);
	}


	public String getMaterial() {
		return material;
	}


	public void setMaterial(String material) {
		this.material = material;
	}
	
	

}
