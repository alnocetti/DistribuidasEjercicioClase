package bean;

import java.io.Serializable;
import java.util.Set;

public class ProfesorDTO implements Serializable{
	//Comenntario prueba commit
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int numeroProfesor;
	private String nombreProfesor;
	private Set<MateriaDTO> materias;
	private DireccionDTO direccion;
	
	public ProfesorDTO(int numeroProfesor, String nombreProfesor, Set<MateriaDTO> materias, DireccionDTO direccion) {
		super();
		this.numeroProfesor = numeroProfesor;
		this.nombreProfesor = nombreProfesor;
		this.materias = materias;
		this.direccion = direccion;
	}
	public ProfesorDTO(){
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

	public Set<MateriaDTO> getMaterias() {
		return materias;
	}

	public void setMaterias(Set<MateriaDTO> materias) {
		this.materias = materias;
	}

	public DireccionDTO getDireccion() {
		return direccion;
	}

	public void setDireccion(DireccionDTO direccion) {
		this.direccion = direccion;
	}

}
