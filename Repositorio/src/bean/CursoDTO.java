package bean;

import java.io.Serializable;
import java.util.Set;

public class CursoDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int numeroCurso;
	private MateriaDTO materia;
	private ProfesorDTO profesor;
	private Set<AlumnoDTO> alumnos;
	private int cantidadMaxima;
	
	public CursoDTO(int numeroCurso, MateriaDTO materia, ProfesorDTO profesor, Set<AlumnoDTO> alumnos, int cantidadMaxima) {
		super();
		this.numeroCurso = numeroCurso;
		this.materia = materia;
		this.profesor = profesor;
		this.alumnos = alumnos;
		this.cantidadMaxima = cantidadMaxima;
	}
	
	public CursoDTO(){
		
	}

	public int getNumeroCurso() {
		return numeroCurso;
	}

	public void setNumeroCurso(int numeroCurso) {
		this.numeroCurso = numeroCurso;
	}

	public MateriaDTO getMateria() {
		return materia;
	}

	public void setMateria(MateriaDTO materia) {
		this.materia = materia;
	}

	public ProfesorDTO getProfesor() {
		return profesor;
	}

	public void setProfesor(ProfesorDTO profesor) {
		this.profesor = profesor;
	}

	public Set<AlumnoDTO> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(Set<AlumnoDTO> alumnos) {
		this.alumnos = alumnos;
	}

	public int getCantidadMaxima() {
		return cantidadMaxima;
	}

	public void setCantidadMaxima(int cantidadMaxima) {
		this.cantidadMaxima = cantidadMaxima;
	}

	
	
	
}
