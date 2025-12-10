package com.ut4POO;

public class LetraDNI {
	
	private final String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
	private String letraDni = ""; //Propiedad de la clase
	
	public boolean calculoLetraDNI(String dni) {
		boolean retorno = false;

		retorno = this.trocearDni(dni);//propiedad de la clase
	
		return retorno;
	}
	
	
	
	@Override
	public String toString() {
		return letraDni;
	}



	private boolean trocearDni(String dni) { //la funcion dni es solo de este metodo, cuando termine desaparece
		boolean retorno = false;
		String numDni = "";
		String letDNI = "";
		
		numDni = dni.substring(0,dni.length()-1);
		letDNI = dni.substring(dni.length()-1, dni.length()).toLowerCase();
		this.letraDni = letDNI;
		
		if (isNumeric(letDNI))
			System.out.println ("No se puede realisar la operación por no tener letra");
			else { 
				retorno = resultadoOperacion(numDni,letDNI);
			}
		return retorno;
	}

	private boolean resultadoOperacion (String numDni, String letraDNI) {
		boolean resultado = false;
		Character letra;
		letra = letras.charAt (Integer.parseInt(numDni) % 23);
		
		if (letraDNI.charAt(0) == letra.toLowerCase(letra.charValue())) {
			System.out.println("Las letras son iguales" );
			resultado = true;
		} else
			System.out.println("Las letras no son iguales" );
		return resultado;
	}
	
	
	public static boolean isNumeric(String str) {
	    try {
	        Integer.parseInt(str);
	        return true;
	    } catch(NumberFormatException e) {
	        return false;
	    }
	}

	
}