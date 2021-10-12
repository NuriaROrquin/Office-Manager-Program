package ar.edu.unlam.pb2;

public class Director extends Empleado {
	
	private int sueldoAdicional;
	private Cochera cochera;
	
	public Director(String nombre, String apellido, int salario, String fechaDeNac, int sueldoAdicional) {
		super(nombre, apellido, salario, fechaDeNac);
		this.sueldoAdicional = sueldoAdicional;
	}	
	

	public Director(String nombre, String apellido, int salario, String fechaDeNac, int sueldoAdicional,
			Cochera cochera) {
		super(nombre, apellido, salario, fechaDeNac);
		this.sueldoAdicional = sueldoAdicional;
		this.cochera = cochera;
	}
	

	public int getSueldoAdicional() {
		return sueldoAdicional;
	}

	public void setSueldoAdicional(int sueldoAdicional) {
		this.sueldoAdicional = sueldoAdicional;
	}
	
	public long getSalario() {
		long salarioTotal = super.getSalario() + sueldoAdicional;
		return salarioTotal;
	}

	public Cochera getCochera() {
		return cochera;
	}


	public void setCochera(Cochera cochera) {
		this.cochera = cochera;
	}


	public Boolean elSaldoEsCorrecto(Integer sueldoEsperado, Director juan) {
		Boolean saldoObtenidoEsIgual = false;
		
		if(juan.getSalario() == sueldoEsperado) {
			saldoObtenidoEsIgual = true;
		}
		
		return saldoObtenidoEsIgual;
	}
	
	
}
