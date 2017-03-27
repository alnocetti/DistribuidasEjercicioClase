package interfaz;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Set;

import bean.Materia;
import bean.Profesor;

public interface TDAProfesor extends Remote{
	
	public Profesor obtengoProfesor(int numero) throws RemoteException;
	
	public void envioProfesor(Profesor profesor) throws RemoteException;
	
	public Set<Profesor> obtengoProfesores() throws RemoteException;
	
	public int cantidadProfesores() throws RemoteException;
	
	public void AsignarMateriaProfesor(Materia materia, Profesor profesor) throws RemoteException;
	
	public void eliminarMateriaProfesor(Materia materia, Profesor profesor) throws RemoteException;
	
	public boolean existeProfesor(int numero) throws RemoteException;
 
}
