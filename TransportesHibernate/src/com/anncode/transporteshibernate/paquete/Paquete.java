package com.anncode.transporteshibernate.paquete;


import java.io.Serializable;
import javax.persistence.*;
import org.hibernate.annotations.IndexColumn;

import com.anncode.transporteshibernate.camionero.Camionero;
import com.anncode.transporteshibernate.provincia.Provincia;

@Entity
@Table(name="paquete")
public class Paquete implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="codigo")
	private String codigo;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="destinatario")
	private String destinatario;
	
	@Column(name="direccion_destinatario")
	private String direccion_destinatario;
	
	@ManyToOne
	@JoinColumn(name="id_camionero")
	private Camionero camionero;
	
	@ManyToOne
	@JoinColumn(name="id_provincia")
	private Provincia provincia;
	
	public Paquete(String codigo, String descripcion,
			String destinatario, 
			String direccion_destinatario
			,Provincia provincia
			,Camionero camionero
			) {
		
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.destinatario = destinatario;
		this.direccion_destinatario = direccion_destinatario;
		this.provincia = provincia;
		this.camionero = camionero;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	public String getDireccion_destinatario() {
		return direccion_destinatario;
	}

	public void setDireccion_destinatario(String direccion_destinatario) {
		this.direccion_destinatario = direccion_destinatario;
	}

//	public Camionero getCamionero() {
//		return camionero;
//	}
//
//	public void setCamionero(Camionero camionero) {
//		this.camionero = camionero;
//	}
//
	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}
	
	
	
	

}
