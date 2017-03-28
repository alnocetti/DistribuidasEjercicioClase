package rmi;

import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import java.util.*;

import controlador.AlumnoControlador;
import bean.AlumnoDTO;
import interfaz.TDAAlumno;


public class AlumnoRemoteObject extends UnicastRemoteObject implements TDAAlumno {
	
	private static final long serialVersionUID = 1L;
	private AlumnoControlador controlador;
	
	public AlumnoRemoteObject() throws RemoteException {
		super();
		this.controlador = new AlumnoControlador();
		
		
	}


	public AlumnoDTO obtengoAlumno(int numero) throws RemoteException {
		return controlador.obtengoAlumno(numero);
	}

	public Set<AlumnoDTO> obtengoAlumnos() throws RemoteException 
	{
		return controlador.obtengoAlumnos();
	}

	public int cantidadAlumnos() throws RemoteException {
		// TODO Auto-generated method stub
		return controlador.cantidadAlumnos();
	}

	@Override
	public void agregarAlumno(AlumnoDTO alumno) throws RemoteException {
		controlador.agregarAlumno(alumno);
	}


	@Override
	public void eliminarAlumno(AlumnoDTO alumno) throws RemoteException {
		controlador.eliminarAlumno(alumno);
		
	}
	
}
