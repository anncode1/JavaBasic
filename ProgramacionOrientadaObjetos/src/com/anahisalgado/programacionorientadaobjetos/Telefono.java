package com.anahisalgado.programacionorientadaobjetos;

public class Telefono {
	
	
	//atributos
	private int id;
	private String marca;
	public String modelo;
	private double precio;
	
	public Telefono(){
		this.id = 0;
		this.marca = "Motorola";
		this.modelo = "Moto E";
		this.precio = 1.0;
	}
	
	public Telefono(int id, String marca, double precio){
		this.id = id;
		this.marca = marca;
		this.precio = precio;
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		if(precio > 1){
			this.precio = precio;
		}else{
			this.precio = 1.0;
			//System.out.println("El precio no es válido");
		}
		
	}

	//comportamientos - metodos
	public void mostrarDatos(){
		//comportamiento del metodo
		System.out.println("Datos Telefono");
		System.out.println("ID: " + id);
		System.out.println("Marca: " + marca);
		System.out.println("Modelo:" + modelo);
		System.out.println("Precio: " + precio);
	}
	

}
