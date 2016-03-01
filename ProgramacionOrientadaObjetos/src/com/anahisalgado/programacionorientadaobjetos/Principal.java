package com.anahisalgado.programacionorientadaobjetos;

import java.io.Serializable;

public class Principal implements Serializable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Telefono miTelefono = new Telefono();
		//miTelefono.mostrarDatos();
		
		Telefono tuTelefono = new Telefono(1, "Nexus", 2.0);
		//tuTelefono.mostrarDatos();
		//tuTelefono.precio = 4.0;
		tuTelefono.setPrecio(-4.0);
		tuTelefono.mostrarDatos();
		
		Integer a = new Integer(3);
		Integer b = new Integer(3);
		System.out.println(a==b);
		
		
		
	}

}
