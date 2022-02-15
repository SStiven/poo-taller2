package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import principal.Motor;

class MotorTests {
	@Test
	void asignaTipoValido() {
		//Arrange (Given)
		Motor motor = new Motor();
		motor.tipo = "electrico";
		
		//Act (When)
		motor.asignarTipo("gasolina");
		
		//Assert (Then)
		assertEquals("gasolina", motor.tipo);
	}
	
	@Test
	void matieneTipoCuandoAsignaInvalido() {
		//Arrange (Given)
		Motor motor = new Motor();
		motor.tipo = "electrico";
		
		//Act (When)
		motor.asignarTipo("hibrido");
		
		//Assert (Then)
		assertEquals("electrico", motor.tipo);
	}

}
