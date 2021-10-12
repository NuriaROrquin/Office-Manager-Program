package ar.edu.unlam.pb2;

public class Gerente extends Empleado {
	
	private Cochera cochera;
	
	public Gerente(String nombre, String apellido, int salario, String fechaDeNac) {
		super(nombre, apellido, salario, fechaDeNac);
	}	
	
	public Gerente(String nombre, String apellido, int salario, String fechaDeNac,
			Cochera cochera) {
		super(nombre, apellido, salario, fechaDeNac);
		this.cochera = cochera;
	}

	public Cochera getCochera() {
		return cochera;
	}


	public void setCochera(Cochera cochera) {
		this.cochera = cochera;
	}
	
	

}
