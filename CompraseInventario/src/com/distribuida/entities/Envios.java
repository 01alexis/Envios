package com.distribuida.entities;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Envios {
	   @Id
	    @GeneratedValue(strategy= GenerationType.IDENTITY)
	   @Column(name="id_envios")
	private int idEnvios;
	    @Column(name="fechaenvio")
	private Date fechaenvio;
	
	private Date fechaenvio;
	@JoinColumn(name="id_Pedido")
	@ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	private Pedido pedido;
	
	@JoinColumn(name="id_SucursalOrigen")
	@ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	private Sucursalorigen sucursalorigen;
	
	@JoinColumn(name="id_SucursalDestino")
	@ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	private Sucursaldestino sucursaldestino;
	
	

	
	public static void main(String[] args) {
		                                         

	}



	public Envios(int idEnvios, Date fechaenvio) {
		
		this.idEnvios = idEnvios;
		this.fechaenvio = fechaenvio;
	}



	public int getIdEnvios() {
		return idEnvios;
	}



	public void setIdEnvios(int idEnvios) {
		this.idEnvios = idEnvios;
	}



	public Date getFechaenvio() {
		return fechaenvio;
	}



	public void setFechaenvio(Date fechaenvio) {
		this.fechaenvio = fechaenvio;
	}



	@Override
	public String toString() {
		return "Envios [idEnvios=" + idEnvios + ", fechaenvio=" + fechaenvio + ", getIdEnvios()=" + getIdEnvios()
				+ ", getFechaenvio()=" + getFechaenvio() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	

}
