package com.anahisalgado.interfaces;

public class TelefonoHogar extends Telefono implements IDevolucion{
	
	public TelefonoHogar(int id, double precio, String marca, String modelo, boolean alambrico) {
		super(id, precio, marca, modelo);
		// TODO Auto-generated constructor stub
		this.alambrico = alambrico;
	}

	private boolean alambrico;

	public boolean isAlambrico() {
		return alambrico;
	}

	public void setAlambrico(boolean alambrico) {
		this.alambrico = alambrico;
	}

	@Override
	public void hacerDevolucion() {
		// TODO Auto-generated method stub
		System.out.println("Devolucion de un Telefono Hogar");
	}
	

}
