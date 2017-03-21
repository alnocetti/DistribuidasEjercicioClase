package bean;

import java.io.Serializable;

public class Alumno implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int numeroAlumno;
	private String nombre;
	private String estado;
	public Alumno(int numeroAlumno, String nombre, String estado) {
		this.numeroAlumno = numeroAlumno;
		this.nombre = nombre;
		this.estado = estado;
	}
	public int getNumeroAlumno() {
		return numeroAlumno;
	}
	public String getNombre() {
		return nombre;
	}
	public String getEstado() {
		return estado;
	}
	public void setNumeroAlumno(int numeroAlumno) {
		this.numeroAlumno = numeroAlumno;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", numeroAlumno=" + numeroAlumno
				+ "]";
	}
	
}
