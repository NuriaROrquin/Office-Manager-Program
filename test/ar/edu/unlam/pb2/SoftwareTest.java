package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class SoftwareTest {

	@Test
	public void queSePuedaObtenerElSalarioTotalDeIngeniero() {
		Integer sueldoEsperado = 12150;
		Ingeniero juan = new Ingeniero("Juan", "Perez", 12000, "24/06/1997", 150);
		
		assertTrue(sueldoEsperado == juan.getSalario());
	}
	
	@Test
	public void noSePuedeObtenerElSalarioTotalDelIngenieroPorqueNoEsElEsperado() {
		Integer sueldoEsperado = 12;
		Ingeniero juan = new Ingeniero ("Juan", "Perez", 12000, "24/06/1997", 150);
		Boolean sePudoObtenerElSaldo = false;
		Boolean valorObtenido = juan.elSaldoEsCorrecto(sueldoEsperado, juan);
		assertEquals (sePudoObtenerElSaldo,valorObtenido);
	}
	
	
	
	@Test
	public void queSePuedaCrearUnEmpleado() {
		Empleado juan = new Empleado("Juan", "Perez", 12000, "24/06/1997");
		
		assertNotNull(juan);
	}
	
	@Test
	public void queSePuedaCrearUnGerenteConCochera() {
		Cochera nuevaCochera = new Cochera(1);
		Gerente juan = new Gerente("Juan", "Perez", 12000, "24/06/1997", nuevaCochera);
		
		assertNotNull(juan);
	}
	
	@Test
	public void queSePuedaCrearUnDirectorConCochera() {
		Cochera nuevaCochera = new Cochera(1);
		Director juan = new Director("Juan", "Perez", 12000, "24/06/1997", 190, nuevaCochera);
		
		assertNotNull(juan);
	}
	
	@Test
	public void noSePuedeObtenerElSalarioTotalDelDirectorPorqueNoEsElEsperado() {
		Integer sueldoEsperado = 12;
		Director juan = new Director ("Juan", "Perez", 12000, "24/06/1997", 150);
		Boolean sePudoObtenerElSaldo = false;
		Boolean valorObtenido = juan.elSaldoEsCorrecto(sueldoEsperado, juan);
		assertEquals (sePudoObtenerElSaldo,valorObtenido);
	}
	
	@Test
	public void queSePuedaCrearUnDepartamento() {
		Cochera nuevaCochera = new Cochera(1);
		Gerente juan = new Gerente("Juan", "Perez", 12000, "24/06/1997", nuevaCochera);
		Departamento ingenieria = new Departamento(juan, "Ingenieria");
		
		assertEquals(juan.getCochera(), ingenieria.getGerente().getCochera());
	}
	
	

}
