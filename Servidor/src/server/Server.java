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
            TDAAlumno gestionAlumnos = new GestionAlumno();
            TDACurso gestionCursos = new GestionCurso();
            TDAMateria gestionMateria = new GestionMateria();
            TDAProfesor gestionProfesor = new GestionProfesor();
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
