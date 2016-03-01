package com.anahisalgado.controlflujo;

public class ControlFlujo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// If else
		// Obtener el numero mayor
		/*int a = 5;
		int b = 20;
		
		if (a > b) {
			//true
			System.out.println("a es MAYOR");
		}else if(a == b){
			System.out.println("a y b son iguales");
		}else {
			System.out.println("a no es el mayor y tampoco son iguales");
		}
		
		//switch
		
		int c = 1007;
		
		switch (c) {
			case 1005:
				System.out.println("c es 1005");
				break;
			case 1006:
				System.out.println("c es 1006");
				break;
			
			case 1004:
				System.out.println("c es 1007");
				break;
			case 1008:
				System.out.println("c es 1008");
				break;
			case 1009:
				System.out.println("c es 1009");
				break;
			default:
				System.out.println("c es otro valor");
				break;
		}*/
		
		
		//while
		int a = 1;
		while (a <= 5) {
			System.out.println("a: " + a);
			a++;//2 3
		}
		
		//for
		for(int i = 1; i <= 5; i++){
			System.out.println("i: " + i);
		}
		
		//Array
		int[] miArreglo = new int[5];
		/*miArreglo[0] = 6;
		miArreglo[1] = 6;
		miArreglo[2] = 6;
		miArreglo[3] = 6;
		miArreglo[4] = 6;*/
		
		for(int j = 0; j < miArreglo.length; j++){
			miArreglo[j] = j * 6;
			System.out.println("miArreglo["+j+"]: " + miArreglo[j]);
		}
		
		
		//foreach por cada
		for (int i : miArreglo) {
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
	}

}
