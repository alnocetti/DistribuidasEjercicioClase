package modelo;

import bean.MateriaDTO;


public class Materia  {
	
	
	private int numeroMateria;
	private String nombreMateria;
	
	public Materia(int numeroMateria, String nombreMateria) {
		super();
		this.numeroMateria = numeroMateria;
		this.nombreMateria = nombreMateria;
	}

	public int getNumeroMateria() {
		return numeroMateria;
	}

	public void setNumeroMateria(int numeroMateria) {
		this.numeroMateria = numeroMateria;
	}

	public String getNombreMateria() {
		return nombreMateria;
	}

	public void setNombreMateria(String nombreMateria) {
		this.nombreMateria = nombreMateria;
	}
	
	public MateriaDTO toDTO(){
		MateriaDTO materiaDTO = new MateriaDTO();
		materiaDTO.setNombreMateria(this.getNombreMateria());
		materiaDTO.setNumeroMateria(this.getNumeroMateria());
		return materiaDTO;
	}
}