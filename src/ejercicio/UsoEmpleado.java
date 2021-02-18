package ejercicio;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleado {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContextEjercicio.xml");

		Empleados Lisa = contexto.getBean("miEmpleado",Empleados.class);
		System.out.println(Lisa.getTareas());
		System.out.println(Lisa.getInforme());
		
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		
		
		Secretario Julia = contexto.getBean("secretario", Secretario.class);
		System.out.println(Julia.getTareas());
		System.out.println(Julia.getInforme());
		System.out.println(Julia.getEmail());
		System.out.println(Julia.getEmpresa());
		
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		
		Director Juan = contexto.getBean("director", Director.class);
		System.out.println(Juan.getTareas());
		System.out.println(Juan.getInforme());
		System.out.println(Juan.getEmail());
		System.out.println(Juan.getOficina());
		System.out.println(Juan.getEmpresa());
		
		contexto.close();
	}
}
