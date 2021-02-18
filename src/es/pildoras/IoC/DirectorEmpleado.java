package es.pildoras.IoC;

public class DirectorEmpleado implements Empleados {

	private CreacionInformes informeNuevo;
	//CREACI�N DE CONSTRUCTOR QUE INYECTA LA DEPENDENCIA. SPRING INYECTA OBJ A TRAV�S DEL CONTRUCTOR
	public DirectorEmpleado(CreacionInformes informeNuevo) {
		this. informeNuevo =  informeNuevo;
	}
	
	
	public String getTareas() {
		return "TAREA DIRECTOR: GESTIONA LA PLANTILLA DE LA EMPRESA";
	}

	public String getInforme() {
		return "INFORME CREADO POR EL DIRECTOR: " + informeNuevo.getInforme() ;
	}

	
	
	//METODO INIT: EJECUTA TAREAS ANTES DE QUE EL BEAN EST� DISPONIBLE
	public void metodoInicial() {
		System.out.println("**************TAREAS ANTES DE QUE EL BEAN EST� DISPONIBLE");
	}
	
	//METODO DESTROY: EJECUTA TAREAS DESPU�S DE QUE EL BEAN HAYA SIDO USADO
	public void metodoFinal() {
		System.out.println("**************TAREAS DESPU�S DE QUE EL BEAN HAYA SIDO USADO");
	}
}
