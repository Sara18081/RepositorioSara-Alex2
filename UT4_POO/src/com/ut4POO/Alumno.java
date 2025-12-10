package com.ut4POO;

public class Alumno extends Persona implements IMetodosAlumno, IPersonal{

	protected int nia;
	Direccion direccion1 = new Direccion();
	Direccion direccion2 = new Direccion();
	float beca = 0.0f;
	Dni dniaNia = new Dni();
	
	public Dni getDniaNia() {
		return dniaNia;
	}

	public void setDniaNia(Dni dniaNia) {
		this.dniaNia = dniaNia;
	}

	public Alumno(String dni, String name, String apellido1, String apellido2, String fecNac, int nia, Parentesco parentesco) {
		super(dni, name, apellido1, apellido2, fecNac, Parentesco.padres);
		this.nia=nia;
		// TODO Auto-generated constructor stub
	}

	public Alumno(String dni, int nia) {
		super(dni);
		this.nia=nia;
		// TODO Auto-generated constructor stub
	}
	
	public void realizarPedido() {
		System.out.println("clase tipo trabajador");
		super.setDescuento(1.5f);
		
	}
	
	@Override
	public boolean matricularse(String nombre, int nia, Dni dni) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public void cobrarSalario(String dni, float beca) {
		// TODO Auto-generated method stub
		this.beca = beca;
		
		
	}

	public int getNia() {
		return nia;
	}

	public void setNia(int nia) {
		this.nia = nia;
	}

	@Override
	public String toString() {
		return "Alumno [nia=" + nia + "],\n" +  "toString()=" + super.toString() + "]";
	}

	


}