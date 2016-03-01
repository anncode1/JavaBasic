package com.anahisalgado.holamundo;

public class HolaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short i  = 0; // 2 bytes
		byte j 	 = 0; // 1 bytes
		int k 	 = 0; // 4 bytes
		long l 	 = 0; // 8 bytes
		
		//long edad = 22;
		byte edad = 22;
		short year = 2000;
		int id = 452839;
		long horaMilisegundos = 77722349;
		
		float estatura = 1.80F;
		double resultado = 932.45690872;
		
		char genero = 'F'; //Femenino
		
		boolean status = true;
		boolean existe = true;
		
		long edadLong = edad;
		byte hora = (byte) horaMilisegundos;
		
		int estaturaInt = (int) estatura;
		System.out.println(estaturaInt);
		
		int resultadoInt = (int) resultado;
		
		
		
		
	}
	
	public static double distanciaTresPuntos(double x1, double y1, double z1, double x2, double y2, double z2){
		return Math.sqrt(((x2 - x1) * (x2 - x1))+ ((y2 - y1)*(y2 - y1)) + ((z2 - z1) * (z2 - z1)) );
	}

}
