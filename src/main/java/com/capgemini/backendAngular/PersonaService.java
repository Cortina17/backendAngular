package com.capgemini.backendAngular;

import java.util.List;

public interface PersonaService {
//dialogar hacia el frontend > con angular
	
	List <Persona> listar();
	Persona listarId(int id);
	Persona edit(Persona p);
	Persona add(Persona p);
	void delete(int id);
}
