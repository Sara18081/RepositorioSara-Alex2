package com.ut4POO;

public class Direccion {
	
	//Propiedades
	private String calle;
	private int numero;
	private String codPostal;
	private String localidad;
	private String provincia;
	
	//Getters y Setters
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCodPostal() {
		return codPostal;
	}
	public void setCodPostal(String codPostal) {
		this.codPostal = codPostal;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	//Constructor
	public Direccion(String calle, int numero, String codPostal, String localidad, String provincia) {
		this.calle = calle;
		this.numero = numero;
		this.codPostal = codPostal;
		this.localidad = localidad;
		this.provincia = provincia;
	}
	
	public Direccion() {
		
	}
	
	public void actualizarDireccion() {
		System.out.println("sin implementar");
	}
	public void crearDireccion( String calle, int numero, String codPostal, String provincia, String localidad) {
		this.calle = calle;
		this.numero = numero;
		this.codPostal = codPostal;
		this.localidad = localidad;
		this.provincia = provincia;
	}
	@Override
	public String toString() {
		return "Direccion [calle=" + calle + ", numero=" + numero + ", codPostal=" + codPostal + ", localidad="
				+ localidad + ", provincia=" + provincia + "]";
	}
	
}
