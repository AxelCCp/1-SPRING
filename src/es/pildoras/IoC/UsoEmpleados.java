package es.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
		
		//(1)CREAMOS UN CONTEXTO
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//(2)PEDIR EL BEAN               (ID DEL BEAN, NOMBRE DE LA INTERFAZ)
		Empleados juan = contexto.getBean("miEmpleado",Empleados.class);
		//(3)
		System.out.println(juan.getTareas());
		System.out.println(juan.getInforme());
		
		
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		
		
		//(2)
		Empleados Fran = contexto.getBean("miSecretarioEmpleado",Empleados.class);
		//(3)
		System.out.println(Fran.getTareas());
		System.out.println(Fran.getInforme());
		
		
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		
		
		//(2)
		SecretarioEmpleado liss = contexto.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);
		//(3)
		System.out.println(liss.getTareas());
		System.out.println(liss.getInforme());
		System.out.println(liss.getEmail());
		System.out.println(liss.getNombreEmpresa());
		
		
		
		//(4)
		contexto.close();
	} 

}
