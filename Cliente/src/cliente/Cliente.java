package cliente;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.Iterator;
import java.util.Set;
import bean.*;
import interfaz.TDAAlumno;
//esto es una prueba

public class Cliente {
    
	TDAAlumno manejoAlumnos;
	AlumnoDTO alumno;
	
	public static void main(String[] args)
	{
		new Cliente();
	}
	
    public boolean getStub() {
    	
    	try {
			manejoAlumnos = (TDAAlumno)Naming.lookup ("//localhost/GestionAlumnos");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
    }
    
    public Cliente(){
    	if(getStub()) 
    	{
    		try {
    			/*Busco por  n�mero de alumno*/
    			alumno = manejoAlumnos.obtengoAlumno(1);
    			System.out.println(alumno.getNombre());
    			/*Listo todos los alumnos*/
    			System.out.println("\nListo Todos los Alumnos");
    			Set<AlumnoDTO> alumnos = manejoAlumnos.obtengoAlumnos();
    			for(Iterator<AlumnoDTO> i=alumnos.iterator();i.hasNext();)
    			{
    				System.out.println(i.next().toString());
    			}
    			/*Agrego un alumno*/
    			System.out.println("\nAgrego un alumno");
    			alumno = new AlumnoDTO(11, "Claudio","Activo");
    			manejoAlumnos.agregarAlumno(alumno);
    			/*Listo todos los alumnos con el agregado*/
    			System.out.println("\nListo Todos los Alumnos");
    			alumnos = manejoAlumnos.obtengoAlumnos();
    			for(Iterator<AlumnoDTO> i=alumnos.iterator();i.hasNext();)
    			{
    				System.out.println(i.next().toString());
    			}
    			/*Obtengo la cantidad de alumnos*/
    			System.out.println("\nCantidad de Alumnos " + manejoAlumnos.cantidadAlumnos());
    		} catch (RemoteException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
    	} 
    }

}
