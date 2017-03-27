package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Iterator;
import java.util.Set;

import bean.Curso;
import interfaz.TDACurso;

public class GestionCurso extends UnicastRemoteObject implements TDACurso {
	private Set<Curso> cursos;
	
	public GestionCurso() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public Curso obtengoCurso(int numero) throws RemoteException {
		Curso aux;
		for(Iterator<Curso> i = cursos.iterator();i.hasNext();){
			aux = i.next();
			if(aux.getNumeroCurso() == numero){
				return aux;
			}
			throw  new RemoteException ("No se encontró el curso");
		}
		return null;
	}

	@Override
	public void envioCurso(Curso curso) throws RemoteException {
		cursos.add(curso);
		return;
	}

	@Override
	public Set<Curso> obtengoCursos() throws RemoteException {
		// TODO Auto-generated method stub
		return cursos;
	}

	@Override
	public int cantidadCursos() throws RemoteException {
		// TODO Auto-generated method stub
		return cursos.size();
	}

}
