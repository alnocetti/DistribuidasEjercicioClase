package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Iterator;
import java.util.Set;

import bean.CursoDTO;
import controlador.CursoControlador;
import interfaz.TDACurso;

public class CursoRemoteObject extends UnicastRemoteObject implements TDACurso {
	private Set<CursoDTO> cursos;
	private CursoControlador controlador;
	
	public CursoRemoteObject() throws RemoteException {
		super();
		this.controlador = new CursoControlador();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public CursoDTO obtengoCurso(int numero) throws RemoteException {
		return controlador.obtengoCurso(numero);
	}

	@Override
	public void agregarCurso(CursoDTO cursoDTO) throws RemoteException {
		controlador.agregarCurso(cursoDTO);
		return;
	}

	@Override
	public Set<CursoDTO> obtengoCursos() throws RemoteException {
		// TODO Auto-generated method stub
		return controlador.obtengoCursos();
	}

	@Override
	public int cantidadCursos() throws RemoteException {
		// TODO Auto-generated method stub
		return controlador.cantidadCursos();
	}

	@Override
	public void eliminarCurso(CursoDTO cursoDTO) throws RemoteException {
		controlador.eliminarCurso(cursoDTO);
	}

}
