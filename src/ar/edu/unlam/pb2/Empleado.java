package ar.edu.unlam.pb2;

public class Empleado {
	private String nombre;
	private String apellido;
	private int salario;
	private String fechaDeNac;
	
	
	public Empleado(String nombre, String apellido, int salario, String fechaDeNac) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.salario = salario;
		this.fechaDeNac = fechaDeNac;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public long getSalario() {
		return salario;
	}
	
	public void setSalario(int salario) {
		this.salario = salario;
	}
	
	public String getFechaDeNac() {
		return fechaDeNac;
	}
	
	public void setFechaDeNac(String fechaDeNac) {
		this.fechaDeNac = fechaDeNac;
	}
	
	
}
