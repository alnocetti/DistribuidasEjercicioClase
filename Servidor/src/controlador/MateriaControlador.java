package controlador;

import java.util.HashSet;
import java.util.Set;

import bean.MateriaDTO;
import modelo.Materia;

public class MateriaControlador {
	
	Set <Materia> materias = new HashSet<Materia>();
	public MateriaControlador(){
		
	}
	
	public void agregarMateria(MateriaDTO materia){
		materias.add(fromDTO(materia));
	}
	
	private Materia fromDTO(MateriaDTO materiaDTO){
		Materia materia = new Materia();
		materia.setNombreMateria(materiaDTO.getNombreMateria());
		materia.setNumeroMateria(materiaDTO.getNumeroMateria());
		return materia;
	}
	
	public boolean existeMateria(int numero){
		for(Materia aux : this.materias){
			if (numero ==  aux.getNumeroMateria())
					return true;
		}
		return false;
	}
	
	public int cantidadMaterias(){
		return materias.size();
	}
	
	public Set<MateriaDTO> obtengoMaterias(){
		Set<MateriaDTO> materiasDTO = new HashSet<MateriaDTO>();
		for(Materia aux : this.materias){
			materiasDTO.add(aux.toDTO());
		}
		return materiasDTO;
	}
	
	public MateriaDTO obtengoMateria(int numero){
		for(Materia aux : this.materias){
			if(numero ==  aux.getNumeroMateria()){
				return aux.toDTO();
			}
		}
		return null;
	}

}
