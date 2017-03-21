package bean;

import java.io.Serializable;

public class Materia implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String numeroMateria;
	private String nombreMateria;
	
	public Materia(String numeroMateria, String nombreMateria) {
		super();
		this.numeroMateria = numeroMateria;
		this.nombreMateria = nombreMateria;
	}

	public String getNumeroMateria() {
		return numeroMateria;
	}

	public void setNumeroMateria(String numeroMateria) {
		this.numeroMateria = numeroMateria;
	}

	public String getNombreMateria() {
		return nombreMateria;
	}

	public void setNombreMateria(String nombreMateria) {
		this.nombreMateria = nombreMateria;
	}
	

}
