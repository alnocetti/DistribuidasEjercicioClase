package interfaz;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Set;

import bean.CursoDTO;



public interface TDACurso extends Remote {
	
	/* retorna un curso */
	public CursoDTO obtengoCurso(int numero) throws RemoteException;
	
	/* recibe un curso */ 
	public void envioCurso(CursoDTO curso)throws RemoteException;
	 
	/* retorna todos los cursos */ 
	public Set<CursoDTO> obtengoCursos()throws RemoteException;
	
	public int cantidadCursos() throws RemoteException;
}

