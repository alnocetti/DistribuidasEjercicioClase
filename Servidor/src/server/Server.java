package server;

import java.rmi.*;
import java.rmi.registry.LocateRegistry;

import interfaz.TDAAlumno;
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
            Naming.rebind ("//localhost/GestionAlumnos", gestionAlumnos);
            System.out.println("Fijado en //localhost/GestionAlumnos");
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}
