package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Iterator;
import java.util.Set;

import bean.MateriaDTO;
import bean.ProfesorDTO;
import interfaz.TDAProfesor;

public class ProfesorRemoteObject extends UnicastRemoteObject implements TDAProfesor{
	Set<ProfesorDTO> profesores;

	public ProfesorRemoteObject() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public ProfesorDTO obtengoProfesor(int numero) throws RemoteException {
		// TODO Auto-generated method stub
		ProfesorDTO aux;
		for(Iterator<ProfesorDTO> i = profesores.iterator();i.hasNext();){
			aux = i.next();
			if(aux.getNumeroProfesor() == numero){
				return aux;
			}
			throw new RemoteException("No se encontró el profesor");
		}
		return null;
	}

	@Override
	public void envioProfesor(ProfesorDTO profesor) throws RemoteException {
		// TODO Auto-generated method stub
		profesores.add(profesor);
		
	}

	public Set<ProfesorDTO> obtengoProfesores() throws RemoteException {
		// TODO Auto-generated method stub
		return profesores;
	}

	@Override
	public int cantidadProfesores() throws RemoteException {
		// TODO Auto-generated method stub
		return profesores.size();
	}


	@Override
	public void AsignarMateriaProfesor(MateriaDTO materia, ProfesorDTO profesor) throws RemoteException {

	}

	@Override
	public void eliminarMateriaProfesor(MateriaDTO materia, ProfesorDTO profesor) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean existeProfesor(int numero) {
		ProfesorDTO aux;
		for(Iterator<ProfesorDTO> i = profesores.iterator(); i.hasNext();){
			aux = i.next();
			if (aux.getNumeroProfesor() == numero){
				return true;
			}
		}
		return false;
	}

}
