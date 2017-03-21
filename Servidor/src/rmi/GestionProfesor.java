package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Set;

import bean.Materia;
import bean.Profesor;
import interfaz.TDAProfesor;

public class GestionProfesor extends UnicastRemoteObject implements TDAProfesor{
	private Set<Profesor> profesores;

	protected GestionProfesor() throws RemoteException {
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
		return null;
	}

	@Override
	public void envioProfesor(Profesor profesor) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<Profesor> obtengoProfesores() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int cantidadProfesores() throws RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void agregarMateria(Materia materia) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarMateria(Materia materia) {
		// TODO Auto-generated method stub
		
	}

}
