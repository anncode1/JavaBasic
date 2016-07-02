package com.anncode.transporteshibernate.camion;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="camion")
public class Camion implements Serializable {
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="matricula")
	private String matricula;
	
	@Column(name="modelo")
	private String modelo;
	
	@Column(name="tipo")
	private String tipo;
	
	@Column(name="potencia")
	private double potencia;
	
	
	//private List<Camionero> camionero =  new ArrayList<>();
	
	public Camion(){
		
	}
	
	public Camion(String matricula, String modelo, String tipo, double potencia) {
		super();
		
		this.matricula = matricula;
		this.modelo = modelo;
		this.tipo = tipo;
		this.potencia = potencia;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	
	

}
