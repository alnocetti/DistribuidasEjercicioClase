package controlador;

import java.util.HashSet;
import java.util.Set;

import bean.DireccionDTO;
import bean.MateriaDTO;
import bean.ProfesorDTO;
import modelo.Direccion;
import modelo.Materia;
import modelo.Profesor;

public class ProfesorControlador {
	private Set<Profesor> profesores;
	
	public ProfesorControlador(){
		this.profesores = new HashSet<Profesor>();
	}
	
	public void agregarProfesor(ProfesorDTO profesorDTO){
		profesores.add(fromDTO(profesorDTO));				
	}
	
	public ProfesorDTO obtengoProfesor(int numero){
		for (Profesor aux : this.profesores){
			if(numero == aux.getNumeroProfesor())
				return aux.toDTO();
		}
		return null;
			
	}
	
	public Set<ProfesorDTO> obtengoProfesores(){
		Set<ProfesorDTO> profesoresDTO = new HashSet<ProfesorDTO>();
		for(Profesor aux : this.profesores){
			profesoresDTO.add(aux.toDTO());
		}
		return profesoresDTO;
	}
	
	public int cantidadProfesores(){
		return this.profesores.size();
	}
	
	public boolean existeProfesor(int numero){
		for (Profesor aux : this.profesores){
			if(numero == aux.getNumeroProfesor())
				return true;
		}
		return false;
	}
	
	private Profesor fromDTO (ProfesorDTO profesorDTO){
		Profesor profesor = new Profesor();
		Set<Materia> materias = new HashSet<Materia>();
		profesor.setNombreProfesor(profesorDTO.getNombreProfesor());
		profesor.setNumeroProfesor(profesorDTO.getNumeroProfesor());
		profesor.setDireccion(fromDTOaDireccion(profesorDTO.getDireccion()));
		for(MateriaDTO aux : profesorDTO.getMaterias()){
			materias.add(fromDTOaMateria(aux));						
		}
		profesor.setMaterias(materias);					
		return profesor;
	}
	
	private Direccion fromDTOaDireccion(DireccionDTO direccionDTO){
		Direccion direccion = new Direccion();
		direccion.setCalle(direccionDTO.getCalle());
		direccion.setCodigoPostal(direccionDTO.getCodigoPostal());
		direccion.setDepartamento(direccionDTO.getDepartamento());
		direccion.setLocalidad(direccionDTO.getLocalidad());
		direccion.setNumeroDireccion(direccionDTO.getNumeroDireccion());
		direccion.setPiso(direccionDTO.getPiso());
		return direccion;
	}
	
	private Materia fromDTOaMateria(MateriaDTO materiaDTO){
		Materia materia = new Materia();
		materia.setNombreMateria(materiaDTO.getNombreMateria());
		materia.setNumeroMateria(materiaDTO.getNumeroMateria());
		return materia;
	}
	

}
