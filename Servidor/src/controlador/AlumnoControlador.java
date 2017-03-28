package controlador;

import java.util.HashSet;
import java.util.Set;

import bean.AlumnoDTO;
import modelo.Alumno;

public class AlumnoControlador {
	Set<Alumno>alumnos = new HashSet<Alumno>();
	public AlumnoControlador(){
		
	}
	
	public void agregarAlumno(AlumnoDTO alumno){
		alumnos.add(this.fromDTO(alumno));
		return;
	}
		
	private Alumno fromDTO(AlumnoDTO alumnoDTO){
		Alumno alumno  = new Alumno();
		alumno.setEstado(alumnoDTO.getEstado());
		alumno.setNombre(alumnoDTO.getNombre());
		alumno.setNumeroAlumno(alumnoDTO.getNumeroAlumno());
		return alumno;	
	}

	public Set<Alumno> getAlumnos() {
		return alumnos;
	}
	
	

}
