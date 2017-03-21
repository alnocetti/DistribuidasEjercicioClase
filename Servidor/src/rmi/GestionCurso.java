package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Set;

import bean.Curso;
import interfaz.TDACurso;

public class GestionCurso extends UnicastRemoteObject implements TDACurso {

	protected GestionCurso() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public Curso obtengoCurso(int numero) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void envioCurso(Curso curso) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<Curso> obtengoCursos() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int cantidadCursos() throws RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}

}
