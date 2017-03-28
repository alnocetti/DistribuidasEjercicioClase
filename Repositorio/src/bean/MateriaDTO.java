package bean;

import java.io.Serializable;

public class MateriaDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int numeroMateria;
	private String nombreMateria;
	
	public MateriaDTO(int numeroMateria, String nombreMateria) {
		super();
		this.numeroMateria = numeroMateria;
		this.nombreMateria = nombreMateria;
	}
	
	public MateriaDTO(){
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
	

}
