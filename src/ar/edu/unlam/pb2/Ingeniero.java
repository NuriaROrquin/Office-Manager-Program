package ar.edu.unlam.pb2;

public class Ingeniero extends Empleado {
	
	private int sueldoAdicional;
	
	public Ingeniero(String nombre, String apellido, int salario, String fechaDeNac, int sueldoAdicional) {
		super(nombre, apellido, salario, fechaDeNac);
		this.sueldoAdicional = sueldoAdicional;
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

	public Boolean elSaldoEsCorrecto(Integer sueldoEsperado, Ingeniero juan) {
		Boolean saldoObtenidoEsIgual = false;
		
		if(juan.getSalario() == sueldoEsperado) {
			saldoObtenidoEsIgual = true;
		}
		
		return saldoObtenidoEsIgual;
	}


}
