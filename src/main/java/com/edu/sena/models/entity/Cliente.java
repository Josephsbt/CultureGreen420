package com.edu.sena.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "clientes")
public class Cliente {
	
	@Id
	@Column(name = "id_clien")
	private String id;
	
	@Column(name = "nom_clien")
	private String nombre;
	
	@Column(name = "tel_clien")
	private String telefono;
	
	@Column(name = "direc_clien")
	private String direccion;
	
	@Column(name = "cont_clien")
	private String contraseña;

	public Cliente(String id, String nombre, String telefono, String direccion, String contraseña) {
		
		super();
		this.id = id;
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
		this.contraseña = contraseña;
	}

	public Cliente() {
		super();
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	
	

}
