package controlador;

import java.util.HashSet;
import java.util.Set;

import bean.AlumnoDTO;
import bean.CursoDTO;
import bean.DireccionDTO;
import bean.MateriaDTO;
import bean.ProfesorDTO;
import modelo.Alumno;
import modelo.Curso;
import modelo.Direccion;
import modelo.Materia;
import modelo.Profesor;

public class CursoControlador {
	Set<Curso> cursos;
	
	public CursoControlador(){
		this.cursos = new HashSet<Curso>();
	}
	
	public void agregarCurso(CursoDTO cursoDTO){
		this.cursos.add(fromDTO(cursoDTO));
	}
	
	public CursoDTO obtengoCurso(int numero){
		for(Curso aux : this.cursos){
			if(numero == aux.getNumeroCurso())
				return aux.toDTO();
		}
		return null;
	}
	
	public Set<CursoDTO> obtengoCursos(){
		Set<CursoDTO> cursosDTO = new HashSet<CursoDTO>();
		for(Curso aux : this.cursos){
			cursosDTO.add(aux.toDTO());
		}
		return cursosDTO;
	}
	
	public int cantidadCursos(){
		return this.cursos.size();
	}
	
	public void eliminarCurso(CursoDTO cursoDTO){
		if(this.cursos.contains(cursoDTO))
			cursos.remove(cursoDTO);
	}
	
	private Curso fromDTO(CursoDTO cursoDTO){
		Curso curso = new Curso();
		Set<Alumno> alumnos = new HashSet<Alumno>();
		curso.setCantidadMaxima(cursoDTO.getCantidadMaxima());
		curso.setMateria(fromDTOaMateria(cursoDTO.getMateria()));
		curso.setProfesor(fromDTOaProfesor(cursoDTO.getProfesor()));
		for(AlumnoDTO aux : cursoDTO.getAlumnos()){
			alumnos.add(fromDTOaAlumno(aux));
		}
		curso.setAlumnos(alumnos);
		
		return curso;
	}
	
	
	
	private Materia fromDTOaMateria(MateriaDTO materiaDTO){
		Materia materia = new Materia();
		materia.setNombreMateria(materiaDTO.getNombreMateria());
		materia.setNumeroMateria(materiaDTO.getNumeroMateria());
		return materia;
	}
	
	private Profesor fromDTOaProfesor(ProfesorDTO profesorDTO){
		Profesor profesor = new Profesor();
		Set<Materia> materias = new HashSet<Materia>();
		profesor.setNombreProfesor(profesorDTO.getNombreProfesor());
		profesor.setNumeroProfesor(profesorDTO.getNumeroProfesor());
		profesor.setDireccion(fromDTOaDireccion(profesorDTO.getDireccion()));
		for(MateriaDTO aux : profesorDTO.getMaterias()){
			materias.add(fromDTOaMateria(aux));						
		}
		profesor.setMaterias(materias);					
		return profesor;
	}
	
	private Direccion fromDTOaDireccion(DireccionDTO direccionDTO){
		Direccion direccion = new Direccion();
		direccion.setCalle(direccionDTO.getCalle());
		direccion.setCodigoPostal(direccionDTO.getCodigoPostal());
		direccion.setDepartamento(direccionDTO.getDepartamento());
		direccion.setLocalidad(direccionDTO.getLocalidad());
		direccion.setNumeroDireccion(direccionDTO.getNumeroDireccion());
		direccion.setPiso(direccionDTO.getPiso());
		return direccion;
	}
	
	private Alumno fromDTOaAlumno(AlumnoDTO alumnoDTO){
		Alumno alumno  = new Alumno();
		alumno.setEstado(alumnoDTO.getEstado());
		alumno.setNombre(alumnoDTO.getNombre());
		alumno.setNumeroAlumno(alumnoDTO.getNumeroAlumno());
		return alumno;	
	}

}
