package com.anahisalgado.arreglos;

public class Arreglo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] miArregloInt = new int[5];//indices 0 - 4
		miArregloInt[0] = 4;
		miArregloInt[1] = 8;
		miArregloInt[2] = 5;
		miArregloInt[3] = 9;
		miArregloInt[4] = 9;
		//miArregloInt[5] = 5;
		//System.out.println(miArregloInt[2]);
		//System.out.println(miArregloInt[4]);
		
		double[][] miArregloDouble2D = new double[3][3]; //matriz  i j
		//i -> renglon
		//j -> columna
		miArregloDouble2D[0][0] = 3.45;
		miArregloDouble2D[0][1] = 9.45;
		miArregloDouble2D[0][2] = 7.34;
		miArregloDouble2D[1][0] = 6.54;
		miArregloDouble2D[1][1] = 4.56; //int double 4.0
		miArregloDouble2D[1][2] = 6.54;
		miArregloDouble2D[2][0] = 6.54;
		miArregloDouble2D[2][1] = 6.54;
		miArregloDouble2D[2][2] = 6.54;
		System.out.println(miArregloDouble2D[1][1]);
		
		char[][][] miArregloChar3D = new char[2][2][2];//indices 0-1
		miArregloChar3D[0][0][0] = 'a';
		miArregloChar3D[0][1][0] = 'a';
		miArregloChar3D[0][0][1] = 'a';
		miArregloChar3D[0][0][1] = 'a';
		
		
		
	}

}
