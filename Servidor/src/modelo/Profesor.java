package modelo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import bean.MateriaDTO;
import bean.ProfesorDTO;

public class Profesor {
	
	
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

	public Profesor() {
		// TODO Auto-generated constructor stub
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
	
	public ProfesorDTO toDTO(){
		ProfesorDTO profesorDTO = new ProfesorDTO();
		profesorDTO.setNombreProfesor(this.getNombreProfesor());
		profesorDTO.setNumeroProfesor(this.getNumeroProfesor());
		profesorDTO.setDireccion(this.getDireccion().toDTO());
		
		Set<MateriaDTO> materiasDTO = new HashSet<MateriaDTO>();
		Materia aux;
		for(Iterator<Materia> i = this.getMaterias().iterator();i.hasNext();){
			aux = i.next();
			materiasDTO.add(aux.toDTO());
		}
		profesorDTO.setMaterias(materiasDTO);
		
		return profesorDTO;
	}
	
	
	

}