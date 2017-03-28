package interfaz;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Set;

import bean.MateriaDTO;

public interface TDAMateria extends Remote{
	
	public MateriaDTO obtengoMateria(int numero) throws RemoteException;
	
	public void envioMateria(MateriaDTO materia) throws RemoteException;
	
	public Set<MateriaDTO> obtengoMaterias() throws RemoteException;
	
	public int cantidadMaterias() throws RemoteException;
	
	public boolean existeMateria(int numero) throws RemoteException;
	
}
