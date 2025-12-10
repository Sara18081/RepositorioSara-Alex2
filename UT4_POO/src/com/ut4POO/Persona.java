package com.ut4POO;

import java.util.Objects;
import java.time.LocalDate;

public abstract class  Persona {
	
	private Dni dni = new Dni();
	protected String name;
	private String apellido1;
	private String apellido2;
	private String fecNac;
	private Parentesco parentesco;
	protected float descuento = 0.0f;

	private int diaNac = 0;
	private int mesNac = 0;
	private int anyoNac = 0;
	private LocalDate localDate;
	//private Pedido pedido = new Pedido (); //lo pasamos a array luego
	
	
	public abstract void realizarPedido (); { //defines el metodo pero no lo implementas ;
		//this.pedido = new Pedido ();
		//this.pedido.crearPedido();
	}

	public float getDescuento() {
		return descuento;
	}

	public void setDescuento(float descuento) {
		this.descuento = descuento;
	}
	
	public String getDni() {
		return dni.getDni();
	}
	
	//Quitamos esta propiedad ya que al ser una clave unica no se debe de poder modificar, solo conseguir el valor
	//public void setDni(String dni){ 
	//	this.dni=dni;
	//}
	
	public String getName() {
		return name;
	}
	

	public void setName(String name) {
		this.name = name;
	}
	
	public String getApellido1() {
		return apellido1;
	}
	
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	
	public String getApellido2() {
		return apellido2;
	}
	
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	
	public String getFecNac() {
		return fecNac;
	}
	
	public void setFecNac(String fecNac) {
		this.fecNac = fecNac;
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellido1, apellido2, dni, fecNac, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			System.out.println("Entro comparacion de objetos");
			return true;
		}
		if (obj == null) {
			System.out.println("Entro objeto nulo");
			return false;
		}
			
		if (getClass() != obj.getClass()) {
			System.out.println("Comparo clases");
			return false;
		}
		
		Persona other = (Persona) obj;//Se guardan los valores entrantes en other.apellido1 y se compara con el apellido1 guardado en la clase, llamandose a ella misma para comparar
		return Objects.equals(apellido1, other.apellido1) && Objects.equals(apellido2, other.apellido2)
				&& Objects.equals(dni, other.dni) && Objects.equals(fecNac, other.fecNac)
				&& Objects.equals(name, other.name);
	}
	
	public Persona(String dni, String name, String apellido1, String apellido2, String fecNac, Parentesco parentesco) {
		//super();
		if (this.dni.dniAdd(dni) == true) {
			System.out.println("DNI es correcto, creamos a la persona");
			this.name = name;
			this.apellido1 = apellido1;
			this.apellido2 = apellido2;
			this.fecNac = fecNac;
			this.parentesco= parentesco;
			this.localDate = LocalDate.now();
			this.fecNac = "" + LocalDate.now().getDayOfMonth()+"/" + LocalDate.now().getMonth().getValue() + "/" + LocalDate.now().getYear();
			System.out.println("Fecha actual: " + this.fecNac);
		}
		
	}
	public Persona(String dni) { //Segundo constructor con valores de entrada distintos.
		//super();
		if (this.dni.dniAdd(dni) == true) {
		this.name = "";
		this.apellido1 = "";
		this.apellido2 = "";
		this.fecNac = "";
		}
	}
	@Override //Como ya tiene uno lo sobreescribe, por eso sale override
	public String toString() {
		return "Persona [dni=" + dni + 
				", name=" + name + 
				", apellido1=" + apellido1 + 
				", apellido2=" + apellido2 + 
				", fecNac=" + fecNac + 
				", Parentesco= " + parentesco;
	}
	
	
}
