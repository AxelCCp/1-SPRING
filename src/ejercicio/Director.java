package ejercicio;

public class Director implements Empleados {

	public Director(CreacionDeInformes nuevoInforme) {
		this.nuevoInforme=nuevoInforme;
	}
	
	
	@Override
	public String getTareas() {
		return "DIRIGE EL DESARROLLO DE UN PROYECTO";
		// TODO Auto-generated method stub	
	}
	@Override
	public String getInforme() {
		return "ENTREGA INFORME ACERCA DE LA DIRECCIÓN DEL PROYECTO: " + nuevoInforme.getInformeFinanciero();
		// TODO Auto-generated method stub
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getOficina() {
		return oficina;
	}

	public void setOficina(String oficina) {
		this.oficina = oficina;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}


	public CreacionDeInformes nuevoInforme;
	public String email;
	public String oficina;
	public String empresa;
}
