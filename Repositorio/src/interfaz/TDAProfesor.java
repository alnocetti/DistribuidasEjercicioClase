package interfaz;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Set;

import bean.MateriaDTO;
import bean.ProfesorDTO;

public interface TDAProfesor extends Remote{
	
	public ProfesorDTO obtengoProfesor(int numero) throws RemoteException;
	
	public void agregarProfesor(ProfesorDTO profesor) throws RemoteException;
	
	public Set<ProfesorDTO> obtengoProfesores() throws RemoteException;
	
	public int cantidadProfesores() throws RemoteException;
	
	public void AsignarMateriaProfesor(MateriaDTO materia, ProfesorDTO profesor) throws RemoteException;
	
	public void eliminarMateriaProfesor(MateriaDTO materia, ProfesorDTO profesor) throws RemoteException;
	
	public boolean existeProfesor(int numero) throws RemoteException;
 
}
