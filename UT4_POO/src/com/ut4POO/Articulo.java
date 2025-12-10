package com.ut4POO;

import java.util.Objects;

public class Articulo {
	
	private String codArticulo = "";
	private String desArticulo = "";
	private float precioUnidad = 0.0f;
	private float peso = 0.0f;
	
	
	
	public Articulo(String codArticulo) { 
		super();
		this.codArticulo = codArticulo;
	}

	
	public Articulo(String codArticulo, String desArticulo, float precioUnidad, float peso) {
		super();
		this.codArticulo = codArticulo;
		this.desArticulo = desArticulo;
		this.precioUnidad = precioUnidad;
		this.peso = peso;
	}
	
	
	public String getDesArticulo() {
		return desArticulo;
	}
	public void setDesArticulo(String desArticulo) {
		this.desArticulo = desArticulo;
	}
	public float getPrecioUnidad() {
		return precioUnidad;
	}
	public void setPrecioUnidad(float precioUnidad) {
		this.precioUnidad = precioUnidad;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public String getCodArticulo() {
		return codArticulo;
	}
	
	@Override
	public String toString() {
		return "Articulo [codArticulo=" + codArticulo + ", desArticulo=" + desArticulo + ", precioUnidad="
				+ precioUnidad + ", peso=" + peso + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(codArticulo);
	}


	@Override
	public boolean equals(Object obj) {  //comparar si el objeto es igual con el codigo
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Articulo other = (Articulo) obj;
		return Objects.equals(codArticulo, other.codArticulo);
	}
	
	
}
