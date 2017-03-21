package interfaz;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Set;

import bean.Curso;



public interface TDACurso extends Remote {
	
	/* retorna un curso */
	public Curso obtengoCurso(int numero) throws RemoteException;
	
	/* recibe un curso */ 
	public void envioCurso(Curso curso)throws RemoteException;
	 
	/* retorna todos los cursos */ 
	public Set<Curso> obtengoCursos()throws RemoteException;
	
	public int cantidadCursos() throws RemoteException;
}

