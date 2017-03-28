package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Iterator;
import java.util.Set;

import bean.MateriaDTO;
import bean.ProfesorDTO;
import controlador.ProfesorControlador;
import interfaz.TDAProfesor;

public class ProfesorRemoteObject extends UnicastRemoteObject implements TDAProfesor{

	ProfesorControlador controlador;
	
	private static final long serialVersionUID = 1L;
	
	public ProfesorRemoteObject() throws RemoteException {
		super();
		this.controlador = new ProfesorControlador();
	}


	@Override
	public ProfesorDTO obtengoProfesor(int numero) throws RemoteException {
		return controlador.obtengoProfesor(numero);
	}

	@Override
	public void agregarProfesor(ProfesorDTO profesor) throws RemoteException {
		controlador.agregarProfesor(profesor);
		
	}

	public Set<ProfesorDTO> obtengoProfesores() throws RemoteException {
		return controlador.obtengoProfesores();
	}

	@Override
	public int cantidadProfesores() throws RemoteException {
		return controlador.cantidadProfesores();
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
		return controlador.existeProfesor(numero);
	}

}
