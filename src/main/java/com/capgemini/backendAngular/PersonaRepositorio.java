package com.capgemini.backendAngular;

import java.util.List;
import org.springframework.data.repository.Repository;

public interface PersonaRepositorio extends Repository<Persona, Integer> {
	// dialogar con el motor de MySQL
	// CRUD
	
	List<Persona> findAll(); // overriding el findAll del repository

	Persona findById(int id);

	Persona save(Persona p);

	void delete(Persona p);

}
