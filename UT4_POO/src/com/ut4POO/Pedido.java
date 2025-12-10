package com.ut4POO;

import java.time.LocalDate;
import java.util.Arrays;

public class Pedido {
	private String codPedido = "";
	// lista de articulos (muchos articulos...)
	
	private String fecPedido = "";
	private float precioTotalPedido = 0.0f;
	private int numArtPedido = 0;
	private float pesoPedido = 0.0f;
	private Persona persona;
	private Articulo articulo [] = new Articulo [1];
	
	//metodo borrar articulo
	
	 // Añadir producto
	 public void anyadirArticulo (Articulo articulo) {
		 if (articulo != null) { //controlar que el articulo es almenos algo
		 this.articulo [numArtPedido] = articulo; //this porque me quiero referir a otra variable
		 numArtPedido++; //autoincrementar el articulo
	 }
}	

	 public void borrarAticulo (String codArticulo) {
		 // 1. buscamos el articulo en el array por el código del artículo
		 // 2. Si se encuentra, recogemos posición
		 // 3. Si no encuentra devolver false
		 // 2.1 Encontrado, posicion, movemos desde esa posicion hasta el final los articulos
		 // avanzando posicion posición
		 
		 
		 
	 }
	/* Calcular el precio total
	 * Peso del pesoPedido
	 */
	
	/* 
	 * Peso del pesoPedido
	 */
	
	/* 
	 * Añadir producto
	 */
	
	// Crear Pedido
	public boolean crearPedido() {
		boolean retorno = false;
		fecPedido = LocalDate.now().toString();
		
		return retorno;
	}
	
	public int getNumArtPedido() {
		return numArtPedido;
	}

	public Pedido(String codPedido, Persona persona) {
		super();
		this.codPedido = codPedido;
		this.persona = persona;
	}

	public void setNumArtPedido(int numArtPedido) {
		this.numArtPedido = numArtPedido;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public Articulo[] getArticulo() {
		return articulo;
	}
	
	public void setArticulo (Articulo articulo) {
		this.articulo[numArtPedido] = articulo;
		numArtPedido++;
	}

	public void setArticulo(Articulo[] articulo) {
		this.articulo = articulo;
		//Prevenir no machacar si ya existe.
		
		numArtPedido = numArtPedido + articulo.length;
	}

	@Override
	public String toString() {
		return "Pedido [codPedido=" + codPedido + ", fecPedido=" + fecPedido + ", precioTotalPedido="
				+ precioTotalPedido + ", numArtPedido=" + numArtPedido + ", pesoPedido=" + pesoPedido + ", persona="
				+ persona + ", articulo=" + Arrays.toString(articulo) + "]";
	}

	//cerrar pedido
	public boolean cerrarPedido() {
		boolean retorno = false;
		return retorno;
	}
	
	/*
	 * Getters y Setters
	 */
	public String getCodPedido() {
		return codPedido;
	}

	public void setCodPedido(String codPedido) {
		this.codPedido = codPedido;
	}

	public String getFecPedido() {
		return fecPedido;
	}

	public void setFecPedido(String fecPedido) {
		this.fecPedido = fecPedido;
	}

	public float getPrecioTotalPedido() {
		return precioTotalPedido;
	}

	public void setPrecioTotalPedido(float precioTotalPedido) {
		this.precioTotalPedido = precioTotalPedido;
	}

	public float getPesoPedido() {
		return pesoPedido;
	}

	public void setPesoPedido(float pesoPedido) {
		this.pesoPedido = pesoPedido;
	}

	public int getnumArtPedido() {
		return numArtPedido;
	}
	
	
}