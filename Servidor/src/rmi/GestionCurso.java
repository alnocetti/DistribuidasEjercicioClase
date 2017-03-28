package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Iterator;
import java.util.Set;

import bean.CursoDTO;
import interfaz.TDACurso;

public class GestionCurso extends UnicastRemoteObject implements TDACurso {
	private Set<CursoDTO> cursos;
	
	public GestionCurso() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public CursoDTO obtengoCurso(int numero) throws RemoteException {
		CursoDTO aux;
		for(Iterator<CursoDTO> i = cursos.iterator();i.hasNext();){
			aux = i.next();
			if(aux.getNumeroCurso() == numero){
				return aux;
			}
			throw  new RemoteException ("No se encontró el curso");
		}
		return null;
	}

	@Override
	public void envioCurso(CursoDTO curso) throws RemoteException {
		cursos.add(curso);
		return;
	}

	@Override
	public Set<CursoDTO> obtengoCursos() throws RemoteException {
		// TODO Auto-generated method stub
		return cursos;
	}

	@Override
	public int cantidadCursos() throws RemoteException {
		// TODO Auto-generated method stub
		return cursos.size();
	}

}
