package modelo;

import java.rmi.RemoteException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import bean.AlumnoDTO;
import bean.CursoDTO;

public class Curso {


	private int numeroCurso;
	private Materia materia;
	private Profesor profesor;
	private Set<Alumno> alumnos;
	private int cantidadMaxima;
	
	public Curso(int numeroCurso, Materia materia, Profesor profesor, Set<Alumno> alumnos, int cantidadMaxima) {
		super();
		this.numeroCurso = numeroCurso;
		this.materia = materia;
		this.profesor = profesor;
		this.alumnos = alumnos;
		this.cantidadMaxima = cantidadMaxima;
	}

	public int getNumeroCurso() {
		return numeroCurso;
	}

	public void setNumeroCurso(int numeroCurso) {
		this.numeroCurso = numeroCurso;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public Set<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(Set<Alumno> alumnos) {
		this.alumnos = alumnos;
	}

	public int getCantidadMaxima() {
		return cantidadMaxima;
	}

	public void setCantidadMaxima(int cantidadMaxima) {
		this.cantidadMaxima = cantidadMaxima;
	}
	public CursoDTO toDTO(){
		Set<AlumnoDTO> alumnosDTO = new HashSet<AlumnoDTO>();
		
		CursoDTO cursoDTO = new CursoDTO();
		Alumno aux;
		for(Iterator<Alumno> i = this.getAlumnos().iterator();i.hasNext();){
			aux = i.next();
			try {
				alumnosDTO.add(aux.toDTO());
			} catch (RemoteException e) {
				e.printStackTrace();
			}			
		}
		cursoDTO.setAlumnos(alumnosDTO);
		
		cursoDTO.setCantidadMaxima(this.getCantidadMaxima());
		cursoDTO.setMateria(this.getMateria().toDTO());
		cursoDTO.setNumeroCurso(this.getNumeroCurso());
		cursoDTO.setProfesor(this.getProfesor().toDTO());
		
		return cursoDTO;
	}

	
	
	
}