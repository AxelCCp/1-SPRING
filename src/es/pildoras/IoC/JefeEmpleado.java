package es.pildoras.IoC;

public class JefeEmpleado implements Empleados {
	
	private CreacionInformes informeNuevo;
	
	public JefeEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	
	
	public String getTareas() {
		return "TAREA JEFE: GESTIONA LAS CUESTIONES RELATIVAS A LOS EMPLEADOS";
	}

	public String getInforme() {
		return "IMFORME PRESENTADO POR EL JEFE, CON ARREGLOS: " + informeNuevo.getInforme();
	}
}
