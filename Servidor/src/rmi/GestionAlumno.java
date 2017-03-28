package rmi;

import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import java.util.*;

import bean.AlumnoDTO;
import interfaz.TDAAlumno;


public class GestionAlumno extends UnicastRemoteObject implements TDAAlumno {

	public GestionAlumno() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	private static final long serialVersionUID = 1L;
	private Set<AlumnoDTO> alumnos;

	public void envioAlumno(AlumnoDTO alumno) throws RemoteException 
	{
		alumnos.add(alumno);
	}

	public AlumnoDTO obtengoAlumno(int nroAlumno) throws RemoteException {
		AlumnoDTO aux;
		for(Iterator<AlumnoDTO> i=alumnos.iterator();i.hasNext();)
		{
			aux = i.next();
			if(aux.getNumeroAlumno()==nroAlumno)
				return aux;
		}
		throw new RemoteException("No encontre al alumno");
	}

	public Set<AlumnoDTO> obtengoAlumnos() throws RemoteException 
	{
		return alumnos;
	}

	public int cantidadAlumnos() throws RemoteException {
		// TODO Auto-generated method stub
		return alumnos.size();
	}

	@Override
	public void agregarAlumno() throws RemoteException {
		// TODO Auto-generated method stub
		
	}
	
}
