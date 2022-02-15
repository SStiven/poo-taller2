package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import principal.Asiento;

class AsientoTests {

	@Test
	void mantieneColorCuandoElNuevoNoEsValido() {
		//Arrange (Given)
		Asiento asiento = new Asiento();
		asiento.color = "rojo";
		
		//Act (When)
		asiento.cambiarColor("no permitido");
		
		//Assert (Then)
		assertEquals("rojo", asiento.color);
	}
	
	@Test
	void cambiaColorCorrectamenteCuandoElNuevoEsValido() {
		//Arrange (Given)
		Asiento asiento = new Asiento();
		asiento.color = "rojo";
		
		//Act (When)
		asiento.cambiarColor("amarillo");
		
		//Assert (Then)
		assertEquals("amarillo", asiento.color);
	}

}
