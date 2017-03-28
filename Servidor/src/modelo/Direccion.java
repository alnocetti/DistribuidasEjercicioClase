package modelo;

import bean.DireccionDTO;



public class Direccion {
	
	private String calle;
	private int numeroDireccion;
	private String codigoPostal;
	private String localidad;
	private int piso;
	private String departamento;
	
	public Direccion(String calle, int numeroDireccion, String codigoPostal, String localidad, int piso,
			String departamento) {
		super();
		this.calle = calle;
		this.numeroDireccion = numeroDireccion;
		this.codigoPostal = codigoPostal;
		this.localidad = localidad;
		this.piso = piso;
		this.departamento = departamento;
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

	public DireccionDTO toDTO(){
		DireccionDTO direccionDTO = new DireccionDTO();
		direccionDTO.setCalle(this.getCalle());
		direccionDTO.setCodigoPostal(this.getCodigoPostal());
		direccionDTO.setDepartamento(this.getDepartamento());
		direccionDTO.setLocalidad(this.getLocalidad());
		direccionDTO.setNumeroDireccion(this.getNumeroDireccion());
		direccionDTO.setPiso(this.getPiso());
		return direccionDTO;
	}
	

}