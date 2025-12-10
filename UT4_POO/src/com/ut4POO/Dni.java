package com.ut4POO;
import java.util.Scanner;

public class Dni {
	String dni ="";
	LetraDNI letraDNI = new LetraDNI();
	
	public String getDni() {
		return dni;
	}
	
	/*
	public void setDni(String dni) {
		this.dni = dni;
	}
	public LetraDNI getLetraDNI() {
		return letraDNI;
	}
	public void setLetraDNI(LetraDNI letraDNI) {
		this.letraDNI = letraDNI;
	}*/
	
	@Override
	public String toString() {
		return  dni + letraDNI ;
	}
	 
	public boolean dniAdd () {
		boolean retorno = false;
		String dni = "12345678Z";
		Scanner sc = new Scanner(System.in);
		
		retorno = letraDNI.calculoLetraDNI(dni);
		if ( retorno == false) {
			System.out.println("No se puede añadir el DNI por ser incorrecto");
		}else {
			this.dni = dni;
		}
		sc.close();
		return retorno;
	}
	
	public boolean dniAdd (String dni) {
		boolean retorno = letraDNI.calculoLetraDNI(dni);
		if ( retorno == false) {
			System.out.println("No se puede añadir el DNI por ser incorrectoooooo");
		}else {
			this.dni = dni;
		}
		return retorno;
	}
}