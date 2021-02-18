package es.pildoras.IoC;

public class SecretarioEmpleado implements Empleados {

	private CreacionInformes informeNuevo;
	public void setInformeNuevo(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}
	
	public String getTareas() {	
		return "TAREA SECRETARIO: GESTIONA LA AGENDA DE LOS JEFES" ;
	}
	public String getInforme() {
		return "INFORME SECRETARIO: INFORME GENERADO POR EL SECRETARIO: " + informeNuevo.getInforme();
	}

	
	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}


	private String email;
	private String nombreEmpresa;
	
	
	
	
	
}
