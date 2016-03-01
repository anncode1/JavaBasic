package com.anahisalgado.interfaces;

public class Jeans extends Ropa implements IDevolucion{

	public Jeans(int id, double precio, String talla, String color, String corte, char genero) {
		super(id, precio, talla, color);
		// TODO Auto-generated constructor stub
		this.corte = corte;
		this.genero = genero;
	}
	private String corte;
	private char	genero;
	
	public String getCorte() {
		return corte;
	}
	public void setCorte(String corte) {
		this.corte = corte;
	}
	public char getGenero() {
		return genero;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
	
	@Override
	public void mostrarDatos(String nombreClase) {
		// TODO Auto-generated method stub
		super.mostrarDatos(nombreClase);
		System.out.println("corte: " + corte);
		System.out.println("genero: " + genero);
	}
	@Override
	public void hacerDevolucion() {
		// TODO Auto-generated method stub
		System.out.println("Devolucion de Jeans");
	}
	
	
}
