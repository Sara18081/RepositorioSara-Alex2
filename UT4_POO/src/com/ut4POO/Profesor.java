package com.ut4POO;

public final class Profesor extends Trabajador implements IPersonal {
	
	private String departamento = "";
	public Profesor(String dni, int nrp, String departamento) {
		super(dni, nrp);
		this.departamento=departamento;	
	}
	float salario = 0.0f;
	public Profesor(String dni, String name, String apellido1, String apellido2, String fecNac, int nrp,
			Parentesco parentesco, String departamento) {
		super(dni, name, apellido1, apellido2, fecNac, nrp, parentesco);
		this.departamento=departamento;
	}
	
	@Override
	public void cobrarSalario(String identificacion, float salario) {
		// TODO Auto-generated method stub
		this.salario = salario;
	}
	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() { //Creamos el toString concatenado con el toString de la clase persona, para poder visualizarlo
		return super.toString() + ", Profesor:Depto. " + departamento;
	}
	
	
	public void recorrerDatos() {
		System.out.println("Profesor: " + super.name);
	}

	@Override
	public void realizarPedido() {
		System.out.println("clase tipo trabajador");
		super.setDescuento(1.0f);
		
	}
	
}