package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Set;

import controlador.MateriaControlador;
import bean.MateriaDTO;
import interfaz.TDAMateria;

public class MateriaRemoteObject extends UnicastRemoteObject implements TDAMateria{
	private MateriaControlador controlador;

	public MateriaRemoteObject() throws RemoteException {
		super();
		this.controlador = new MateriaControlador();
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public MateriaDTO obtengoMateria(int numero) throws RemoteException {
		return controlador.obtengoMateria(numero);
	}


	@Override
	public Set<MateriaDTO> obtengoMaterias() {
		return controlador.obtengoMaterias();
	}

	@Override
	public int cantidadMaterias() {
		return controlador.cantidadMaterias();
	}

	@Override
	public boolean existeMateria(int numero) throws RemoteException {
		return controlador.existeMateria(numero);
	}

	@Override
	public void agregarMateria(MateriaDTO materia) throws RemoteException {
		controlador.agregarMateria(materia);
		
	}

}
