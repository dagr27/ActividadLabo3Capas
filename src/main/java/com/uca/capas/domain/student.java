package com.uca.capas.domain;

public class student {
	private String nombre;
	private String apellido;
	private String Fentrada;
	private String carrera;
	private Boolean estado;
	
	
	
	public student(String nombre, String apellido, String fentrada, String carrera, Boolean estado) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.Fentrada = fentrada;
		this.carrera = carrera;
		this.estado = estado;
	}
	public student() {
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getFentrada() {
		return Fentrada;
	}
	public void setFentrada(String fentrada) {
		Fentrada = fentrada;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	public Boolean getEstado() {
		return estado;
	}
	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	public String delegateStatus() {
		return estado?"Activo":"Inactivo";
	}
	
}
