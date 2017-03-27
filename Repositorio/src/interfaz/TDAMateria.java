package interfaz;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Set;

import bean.Materia;

public interface TDAMateria extends Remote{
	
	public Materia obtengoMateria(int numero) throws RemoteException;
	
	public void envioMateria(Materia materia) throws RemoteException;
	
	public Set<Materia> obtengoMaterias() throws RemoteException;
	
	public int cantidadMaterias() throws RemoteException;
	
	public boolean existeMateria(int numero) throws RemoteException;
	
}
