package com.ut4POO;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Persona per1 = new  Persona ("43242322x",
				//"Pepito", "Delospalotes","martinez","", Parentesco.madres );
		//System.out.println(per1.toString());
		
		//Persona per2 = new Persona("43242322x"); 
		//System.out.println(per2.toString());
		
		//System.out.println("El nombre de per1: " + per1.hashCode());
		
		//System.out.println("El nombre de per2: " + per2.hashCode());
		
		//System.out.println(per1.equals(null));
		
		
		Alumno alu1 = new Alumno("12345678z",
				"Pepito", "Delospalotes","martinez","", 31312, Parentesco.hijo);
		System.out.println("Alu1:"+ alu1.toString() );
		
		/*Trabajador trab1 = new Trabajador("12345678z",
				"Pepito", "Delospalotes","martinez","", 31312, Parentesco.madres);
		System.out.println("Trab1"+trab1.toString());
		
		trab1.setNrp(5555);
		
		
		trab1.setName("Vicente");
		System.out.println("Trab1"+trab1.toString());
		System.out.println("Trab1 Nombre: "+trab1.getName());
		*/
		//trab1.anyadirDireccion(2); //asignar direcciones
		//trab1.realizarPedido();
		
		Articulo art1 = new Articulo("000111");
		
		Pedido pedido = new Pedido ("001", alu1);
		
		//pedido.anyadirArticulo(art1);
		pedido.setArticulo(art1);
		
		System.out.println("Pedido ::: \n" + pedido.toString());
		//Conseguimos los datos de direccion solo llamando al constructor en la clase trabajador y creadno una direccion a trabajador
			//trab1.direccion1.setCalle("Vicente");
		/*
			alu1.direccion1.crearDireccion("san juan", 4, "312", "Alicante", "Ibi");
			
			System.out.println(alu1.direccion1.toString());
			
		Profesor prof1 = new Profesor("12345678z",
				"Pepito", "Delospalotes","martinez","01/03/2005", 122, Parentesco.madres, "ciencias");
		
		System.out.println(prof1.toString());
		*/
	}
}
