package rmi;

import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import java.util.*;

import controlador.AlumnoControlador;
import bean.AlumnoDTO;
import interfaz.TDAAlumno;


public class AlumnoRemoteObject extends UnicastRemoteObject implements TDAAlumno {
	
	private static final long serialVersionUID = 1L;
	private Set<AlumnoDTO> alumnos;
	private AlumnoControlador controlador;
	
	public AlumnoRemoteObject() throws RemoteException {
		super();
		this.controlador = new AlumnoControlador();
		
		
	}

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
	public void agregarAlumno(AlumnoDTO alumno) throws RemoteException {
		controlador.agregarAlumno(alumno);
	}
	
}
