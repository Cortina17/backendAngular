package com.capgemini.backendAngular;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "personas")
public class Persona {
	
	@Column
	private int id;
	
	@Column
	private String nombre;
	
	@Column
	private String apellido;

}
