package controlador;

import java.rmi.RemoteException;
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
	
	public void eliminarAlumno(AlumnoDTO alumno){
		if(alumnos.contains(alumno))
			alumnos.remove(alumno);
	}
	
	public Set<Alumno> getAlumnos() {
		return alumnos;
	}
	
	public AlumnoDTO obtengoAlumno(int numero){
		for (Alumno aux : this.alumnos){
			if (numero == aux.getNumeroAlumno()){
				try {
					return aux.toDTO();
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return null;
	}
	
	public Set<AlumnoDTO> obtengoAlumnos(){
		Set<AlumnoDTO> alumnosDTO = new HashSet<AlumnoDTO>();
		for(Alumno aux : this.alumnos){
			try {
				alumnosDTO.add(aux.toDTO());
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
		return alumnosDTO;
			
	}
	
	public int cantidadAlumnos(){
		return this.alumnos.size();
	}
		
	private Alumno fromDTO(AlumnoDTO alumnoDTO){
		Alumno alumno  = new Alumno();
		alumno.setEstado(alumnoDTO.getEstado());
		alumno.setNombre(alumnoDTO.getNombre());
		alumno.setNumeroAlumno(alumnoDTO.getNumeroAlumno());
		return alumno;	
	}


	

}
