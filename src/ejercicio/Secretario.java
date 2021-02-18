package ejercicio;

public class Secretario implements Empleados {

	public Secretario(CreacionDeInformes informeSecretario) {
		this.informeSecretario=informeSecretario;
	}
	
	
	
	@Override
	public String getTareas() {
		return "GESTIONA LA AGENDA DE LOS JEFES";
		// TODO Auto-generated method stub	
	}
	@Override
	public String getInforme() {
		return "ENTREGA INFORME DE LAS REUNIONES DEL MES: " + informeSecretario.getInformeFinanciero();
		// TODO Auto-generated method stub
	}
	
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa=empresa;
	}
	

	public CreacionDeInformes informeSecretario;
	public String email;
	public String empresa;
	

}
