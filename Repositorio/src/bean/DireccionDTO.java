package bean;

import java.io.Serializable;

public class DireccionDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String calle;
	private int numeroDireccion;
	private String codigoPostal;
	private String localidad;
	private int piso;
	private String departamento;
	
	public DireccionDTO(String calle, int numeroDireccion, String codigoPostal, String localidad, int piso,
			String departamento) {
		super();
		this.calle = calle;
		this.numeroDireccion = numeroDireccion;
		this.codigoPostal = codigoPostal;
		this.localidad = localidad;
		this.piso = piso;
		this.departamento = departamento;
	}
	
	public DireccionDTO(){
		
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getNumeroDireccion() {
		return numeroDireccion;
	}

	public void setNumeroDireccion(int numeroDireccion) {
		this.numeroDireccion = numeroDireccion;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public int getPiso() {
		return piso;
	}

	public void setPiso(int piso) {
		this.piso = piso;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	

}
