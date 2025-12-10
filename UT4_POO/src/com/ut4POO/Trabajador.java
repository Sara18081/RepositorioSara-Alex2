package com.ut4POO;

import java.util.Scanner;

public abstract class  Trabajador extends Persona{
	
	Scanner sc = new Scanner (System.in);
	protected int nrp;
	Direccion [] direccion; // que tenga varias direcciones
	
	public Trabajador(String dni, String name, String apellido1, String apellido2, String fecNac, int nrp, Parentesco parentesco) {
		super(dni, name, apellido1, apellido2, fecNac, parentesco);
		this.nrp=nrp;
		// TODO Auto-generated constructor stub
	}

	public Trabajador(String dni, int nrp) {
		super(dni);
		this.nrp=nrp;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Trabajador [nrp=" + nrp + "], toString()=" + super.toString();
	}

	public int getNrp() {
		return nrp;
	}

	public void setNrp(int nrp) {
		this.nrp = nrp;
	}
	
	public void anyadirDireccion(int cantidad) {  //creamos un arrays que cada posicion sea el objeto direccion con todo lo que esto supone calle localidad codPostal
		
		String calle = ""; 
		int numero = 0;
		String codPostal = "";
		String localidad = "";
		String provincia = "";
		direccion = new Direccion[cantidad];
		for (int i = 0; i< cantidad; i++) {
			
			System.out.println("Introduce la via");
			calle = sc.nextLine();
			System.out.println("Tu via " + calle);
			//direccion[i].setCalle(sc.nextLine());
			
			System.out.println("Introduce codPostal");
			//direccion[i].setCodPostal(sc.nextLine());
			codPostal = sc.nextLine();
			System.out.println("Tu codPostal " + codPostal);
			
			System.out.println("Introduce Localidad");
			localidad = sc.nextLine();
			//direccion[i].setLocalidad(sc.nextLine());
			System.out.println("Tu localidad " + localidad);
			
			System.out.println("Introduce Numero");
			numero = sc.nextInt();
			//direccion[i].setNumero(sc.nextInt());
			System.out.println("Tu Numero " + numero);
			
			System.out.println("Introduce Provincia");
			provincia = sc.nextLine();
			//direccion[i].setProvincia(sc.nextLine());
			System.out.println("Tu Provincia " + provincia);
			
			Direccion dir = new Direccion(calle,numero,codPostal,localidad,provincia);
			
			if (dir.equals(null)){
				System.out.println("Objeto no creado");
			} else {
				System.out.println("objeto creado correctamente");
				direccion[i] = dir;
			}
			System.out.println("Calle en el array: " + direccion[i].getCalle());
			System.out.println("Datos dirección : " + (i+1) + ": " + direccion[i].toString());
		}
	}

	@Override
	public abstract void realizarPedido(); /*{
		System.out.println("clase tipo trabajador");
		this.descuento = 1.0f;
		
		
	}*/
	
	
}