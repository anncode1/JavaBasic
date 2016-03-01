package com.anahisalgado.herencia;

public class Principal {
	public static void main(String[] args) {
		Playera 		playera 		= new Playera(1, 299.5, "CH", "Gris", "Polo");
		Jeans 		jeans 		= new Jeans(2, 799, "32", "Azul", "Skinny", 'F');
		Calcetin 	calcetin 	= new Calcetin(3, 29, "M", "Rojo");
		playera.mostrarDatos("Playera Gris");
		jeans.mostrarDatos("Jeans Mujer");
		calcetin.mostrarDatos("Calcetines");
		
	}
}
