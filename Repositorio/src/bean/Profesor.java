package bean;

import java.io.Serializable;
import java.util.Set;

public class Profesor implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int numeroProfesor;
	private String nombreProfesor;
	private Set<Materia> materias;
	private Direccion direccion;
	
	public Profesor(int numeroProfesor, String nombreProfesor, Set<Materia> materias, Direccion direccion) {
		super();
		this.numeroProfesor = numeroProfesor;
		this.nombreProfesor = nombreProfesor;
		this.materias = materias;
		this.direccion = direccion;
	}

	public int getNumeroProfesor() {
		return numeroProfesor;
	}

	public void setNumeroProfesor(int numeroProfesor) {
		this.numeroProfesor = numeroProfesor;
	}

	public String getNombreProfesor() {
		return nombreProfesor;
	}

	public void setNombreProfesor(String nombreProfesor) {
		this.nombreProfesor = nombreProfesor;
	}

	public Set<Materia> getMaterias() {
		return materias;
	}

	public void setMaterias(Set<Materia> materias) {
		this.materias = materias;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
	
	
	

}
