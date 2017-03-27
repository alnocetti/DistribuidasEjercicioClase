package rmi;

import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import java.util.*;

import bean.Alumno;
import interfaz.TDAAlumno;


public class GestionAlumno extends UnicastRemoteObject implements TDAAlumno {

	public GestionAlumno() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	private static final long serialVersionUID = 1L;
	private Set<Alumno> alumnos;

	public void envioAlumno(Alumno alumno) throws RemoteException 
	{
		alumnos.add(alumno);
	}

	public Alumno obtengoAlumno(int nroAlumno) throws RemoteException {
		Alumno aux;
		for(Iterator<Alumno> i=alumnos.iterator();i.hasNext();)
		{
			aux = i.next();
			if(aux.getNumeroAlumno()==nroAlumno)
				return aux;
		}
		throw new RemoteException("No encontre al alumno");
	}

	public Set<Alumno> obtengoAlumnos() throws RemoteException 
	{
		return alumnos;
	}

	public int cantidadAlumnos() throws RemoteException {
		// TODO Auto-generated method stub
		return alumnos.size();
	}
}
