package com.anahisalgado.interfaces;

public class Principal {
	public static void main(String[] args) {
		Playera 		playera 		= new Playera(1, 299.5, "CH", "Gris", "Polo");
		PlayeraPersonalizada playeraPersonalizada = new PlayeraPersonalizada(4, 499.5, "M", "Negro", "@anncode");
		Jeans 		jeans 		= new Jeans(2, 799, "32", "Azul", "Skinny", 'F');
		Calcetin 	calcetin 	= new Calcetin(3, 29, "M", "Rojo");
		
		playera.mostrarDatos("Playera Gris");
		playeraPersonalizada.mostrarDatos("Playera de @anncode");
		jeans.mostrarDatos("Jeans Mujer");
		calcetin.mostrarDatos("Calcetines");
		
		playera.hacerDevolucion();
		jeans.hacerDevolucion();
		
		SmartPhone smartPhone = new SmartPhone(5, 7999, "Motorola", "Moto G", "Alguna Telefonica");
		smartPhone.hacerDevolucion();
		
		
	}
}
