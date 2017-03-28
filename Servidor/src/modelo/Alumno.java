package modelo;

import java.rmi.RemoteException;

import bean.AlumnoDTO;



public class Alumno {
	
	private int numeroAlumno;
	private String nombre;
	private String estado;
	public Alumno(int numeroAlumno, String nombre, String estado) {
		this.numeroAlumno = numeroAlumno;
		this.nombre = nombre;
		this.estado = estado;
	}
	public Alumno() {
		// TODO Auto-generated constructor stub
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
	
	public AlumnoDTO toDTO() throws RemoteException {
		AlumnoDTO alumnoDTO = new AlumnoDTO();
		alumnoDTO.setNombre(this.getNombre());
		alumnoDTO.setEstado(this.getEstado());
		alumnoDTO.setNumeroAlumno(this.getNumeroAlumno());
		return alumnoDTO;	
	}
	
	
}
