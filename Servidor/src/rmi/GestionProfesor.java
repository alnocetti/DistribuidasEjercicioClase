package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Iterator;
import java.util.Set;

import bean.Materia;
import bean.Profesor;
import interfaz.TDAProfesor;

public class GestionProfesor extends UnicastRemoteObject implements TDAProfesor{
	Set<Profesor> profesores;

	public GestionProfesor() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public Profesor obtengoProfesor(int numero) throws RemoteException {
		// TODO Auto-generated method stub
		Profesor aux;
		for(Iterator<Profesor> i = profesores.iterator();i.hasNext();){
			aux = i.next();
			if(aux.getNumeroProfesor() == numero){
				return aux;
			}
			throw new RemoteException("No se encontró el profesor");
		}
		return null;
	}

	@Override
	public void envioProfesor(Profesor profesor) throws RemoteException {
		// TODO Auto-generated method stub
		profesores.add(profesor);
		
	}

	public Set<Profesor> obtengoProfesores() throws RemoteException {
		// TODO Auto-generated method stub
		return profesores;
	}

	@Override
	public int cantidadProfesores() throws RemoteException {
		// TODO Auto-generated method stub
		return profesores.size();
	}


	@Override
	public void AsignarMateriaProfesor(Materia materia, Profesor profesor) throws RemoteException {

	}

	@Override
	public void eliminarMateriaProfesor(Materia materia, Profesor profesor) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean existeProfesor(int numero) {
		Profesor aux;
		for(Iterator<Profesor> i = profesores.iterator(); i.hasNext();){
			aux = i.next();
			if (aux.getNumeroProfesor() == numero){
				return true;
			}
		}
		return false;
	}

}
