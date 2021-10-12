package ar.edu.unlam.pb2;

public class Departamento {
	
	private Gerente gerente;
	private String nombreDelDepartamento;
	
	
	public Departamento(Gerente gerente, String nombreDelDepartamento) {
		super();
		this.gerente = gerente;
		this.nombreDelDepartamento = nombreDelDepartamento;
	}


	public Gerente getGerente() {
		return gerente;
	}


	public void setGerente(Gerente gerente) {
		this.gerente = gerente;
	}


	public String getNombreDelDepartamento() {
		return nombreDelDepartamento;
	}


	public void setNombreDelDepartamento(String nombreDelDepartamento) {
		this.nombreDelDepartamento = nombreDelDepartamento;
	}
	
	
	

}
