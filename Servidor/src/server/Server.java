package server;

import java.rmi.*;
import java.rmi.registry.LocateRegistry;

import interfaz.TDAAlumno;
import interfaz.TDACurso;
import interfaz.TDAMateria;
import interfaz.TDAProfesor;
import rmi.*;

public class Server {
    
	TDAAlumno objetoRemoto;
	
	public static void main(String[] args)
	{
		new Server();
	}
	
	public Server() {
		iniciar();
	}
	
    public void iniciar() {
    	try {
    		LocateRegistry.createRegistry(1099);	
            TDAAlumno gestionAlumnos = new AlumnoRemoteObject();
            TDACurso gestionCursos = new CursoRemoteObject();
            TDAMateria gestionMateria = new MateriaRemoteObject();
            TDAProfesor gestionProfesor = new ProfesorRemoteObject();
            Naming.rebind ("//localhost/GestionAlumnos", gestionAlumnos);
            Naming.rebind("//localhost/GestionCursos", gestionCursos);
            Naming.rebind("//localhost/GestionMateria", gestionMateria);
            Naming.rebind("//localhost/GestionProfesor", gestionProfesor);
            
            //System.out.println("Fijado en //localhost/GestionAlumnos");
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}
