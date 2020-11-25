package ar.edu.unlam.pb220202c.eva03;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestAutoPista {
	
	@Test
	public void queSePuedaRegistrarTelepase () {
		Autopista autopista = new Autopista ("DelSol");
		Vehiculo vehiculoCamion = new Camion("AAA123", 60, 80, 4);
		Vehiculo vehiculoCamion1 = new Camion("AAA124", 60, 80, 4);
		Vehiculo vehiculoCamion2 = new Camion("AAA125", 60, 80, 4);
		assertTrue(autopista.registrarTelepase(1, vehiculoCamion));
	}
	
	
	@Test (expected = VehiculoNotFounException.class)
	public void queAlSalirDelAutopistaNoestaEncirculacionLanceUnaExcepcion() throws VehiculoNotFounException {
		Autopista autopista = new Autopista ("DelSol");
		Vehiculo vehiculoCamion = new Camion("AAA123", 60, 80, 4);
	
		autopista.salirAutpista(vehiculoCamion);
		assertEquals(0,autopista.cantidadDeVehiculosENCirculacion(),0.01);
	}
	
	@Test(expected = VehiculoNotFounException.class )
	public void queVerifiqueQueSeObtengaUnaListaDeAutosInsfractoresOrdenadaPorPatente()throws VehiculoNotFounException{
		Autopista autopista = new Autopista ("DelSol");
		Vehiculo vehiculoCamion = new Camion("AAA123", 60, 80, 4);
		autopista.registrarTelepase(1, vehiculoCamion);
		
		autopista.ingresarAutopista(1);
	
		assertEquals(1,autopista.obtenerVehiculosConExcesosDeVelocidadOrdenadosPorPatente().size());
	}
	
	
	
	
	
	
	
	
}
