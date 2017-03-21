package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Set;

import bean.Materia;
import interfaz.TDAMateria;

public class GestionMateria extends UnicastRemoteObject implements TDAMateria{

	protected GestionMateria() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public Materia obtengoMateria(int numero) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void envioMateria(Materia materia) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<Materia> obtengoMaterias() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int cantidadMaterias() {
		// TODO Auto-generated method stub
		return 0;
	}

}
