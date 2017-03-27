package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Iterator;
import java.util.Set;

import bean.Materia;
import interfaz.TDAMateria;

public class GestionMateria extends UnicastRemoteObject implements TDAMateria{
	Set<Materia> materias;

	public GestionMateria() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public Materia obtengoMateria(int numero) throws RemoteException {
		// TODO Auto-generated method stub
		Materia aux;
		for(Iterator<Materia> i = materias.iterator(); i.hasNext();){
			aux = i.next();
			if (aux.getNumeroMateria() == numero){
				return aux;
			}
			throw new RemoteException("No se encontró la materia");
		}
		return null;
	}

	@Override
	public void envioMateria(Materia materia) {
		// TODO Auto-generated method stub
		materias.add(materia);
		return;
		
	}

	@Override
	public Set<Materia> obtengoMaterias() {
		// TODO Auto-generated method stub
		return materias;
	}

	@Override
	public int cantidadMaterias() {
		// TODO Auto-generated method stub
		return materias.size();
	}

	@Override
	public boolean existeMateria(int numero) throws RemoteException {
		// TODO Auto-generated method stub
		Materia aux;
		for(Iterator<Materia> i = materias.iterator(); i.hasNext();){
			aux = i.next();
			if(aux.getNumeroMateria() == numero)
				return true;
		}
		return false;
	}

}
