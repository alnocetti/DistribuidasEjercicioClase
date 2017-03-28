package interfaz;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Set;
import bean.AlumnoDTO;


public interface TDAAlumno extends Remote 
{
	/* retorna un alumno */
	public AlumnoDTO obtengoAlumno(int nroAlumno) throws RemoteException;
	
	/* recibe un alumno */ 
	public void envioAlumno(AlumnoDTO alumno)throws RemoteException;
	 
	/* retorna todos los alumnos */ 
	public Set<AlumnoDTO> obtengoAlumnos()throws RemoteException;
	
	public int cantidadAlumnos() throws RemoteException;
	
	public void agregarAlumno() throws RemoteException;
}
