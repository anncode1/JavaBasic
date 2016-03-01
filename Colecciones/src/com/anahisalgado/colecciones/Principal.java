package com.anahisalgado.colecciones;

import java.util.ArrayList;
import java.util.Vector;

public class Principal {
	public static void main(String[] args) {
		ArrayList<String> androids = new ArrayList<String>();
		androids.add("Cupcake");
		androids.add("Donut");
		androids.add("Eclair");
		androids.add("Froyo");
		androids.add("Gingerbread");
		androids.add("Honeycomb");
		
		System.out.println("Tamaño del ArrayList: " + androids.size());
		System.out.println("androids: " + androids);
		
		androids.remove(3);
		System.out.println("Tamaño del ArrayList: " + androids.size());
		System.out.println("androids: " + androids);
		
		Vector<String> androidsV2 = new Vector<String>();

		androidsV2.addElement("Ice Cream Sandwitch");
		androidsV2.addElement("Jelly Bean");
		androidsV2.addElement("Kit Kat");
		androidsV2.addElement("Lollipop");
		androidsV2.addElement("Marshmallow");
		
		System.out.println("Tamaño de Vector: " + androidsV2.size());
		System.out.println("androidsV2: " + androidsV2);
		
		androidsV2.remove(4);
		System.out.println("Tamaño de Vector: " + androidsV2.size());
		System.out.println("androidsV2: " + androidsV2);
		
	}
}
