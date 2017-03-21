package negocio;
import java.util.Set;

import bean.*;

public class Negocio {
	
	private Set<Materia> materias;
	private Set<Profesor> profesores;
	private Set<Direccion> direcciones;
	private Set<Alumno> alumnos;
	private Set<Curso> cursos;
	
	public Negocio(Set<Materia> materias, Set<Profesor> profesores, Set<Direccion> direcciones, Set<Alumno> alumnos, Set<Curso> cursos) {
		super();
		this.materias = materias;
		this.profesores = profesores;
		this.direcciones = direcciones;
		this.alumnos = alumnos;
		this.cursos = cursos;
	}
	
	public Negocio() {
		
	}
	
	
	
}
