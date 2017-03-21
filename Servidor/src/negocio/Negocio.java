package negocio;
import java.util.Set;

import bean.*;

public class Negocio {
	
	private Set<Materia> materias;
	private Set<Profesor> profesores;
	private Set<Direccion> direcciones;
	private Set<Alumno> alumnos;
	
	public Negocio(Set<Materia> materias, Set<Profesor> profesores, Set<Direccion> direcciones, Set<Alumno> alumnos) {
		super();
		this.materias = materias;
		this.profesores = profesores;
		this.direcciones = direcciones;
		this.alumnos = alumnos;
	}
	
	public Negocio() {
		
	}
	
	
	
}
