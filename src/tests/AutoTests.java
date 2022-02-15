package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import principal.Asiento;
import principal.Auto;
import principal.Motor;

class AutoTests {

	@Test
	void validaUnAutoConMotorYAsientosOriginales() {
		//Arrange (Given)
		Auto auto = new Auto();
		auto.registro = 19;
		
		Motor motor = new Motor();
		motor.registro = 19;
		auto.motor = motor;
		
		Asiento asiento1 = new Asiento();
		asiento1.registro = 19;
		
		Asiento asiento2 = new Asiento();
		asiento1.registro = 19;
		
		Asiento[] asientos = { asiento1, asiento2 };
		auto.asientos = asientos;
		asiento2.registro = 19;
		
		//Act (When)
		String integridadAuto = auto.verificarIntegridad(); 
		
		//Assert (Then)
		assertEquals("Auto original", integridadAuto);
	}
	
	@Test
	void validaUnAutoConMotorRobadoYAsientosOriginales() {
		//Arrange (Given)
		Auto auto = new Auto();
		auto.registro = 19;
		
		Motor motor = new Motor();
		motor.registro = 20;
		auto.motor = motor;
		
		Asiento asiento1 = new Asiento();
		asiento1.registro = 19;
		
		Asiento asiento2 = new Asiento();
		asiento1.registro = 19;
		
		Asiento[] asientos = { asiento1, asiento2 };
		auto.asientos = asientos;
		asiento2.registro = 19;
		
		//Act (When)
		String integridadAuto = auto.verificarIntegridad(); 
		
		//Assert (Then)
		assertEquals("Las piezas no son originales", integridadAuto);
	}
	
	@Test
	void validaUnAutoConMotorOriginalYUnAsientoRobado() {
		//Arrange (Given)
		Auto auto = new Auto();
		auto.registro = 19;
		
		Motor motor = new Motor();
		motor.registro = 19;
		auto.motor = motor;
		
		Asiento asiento1 = new Asiento();
		asiento1.registro = 19;
		
		Asiento asiento2 = new Asiento();
		asiento1.registro = 20;
		
		Asiento[] asientos = { asiento1, asiento2 };
		auto.asientos = asientos;
		asiento2.registro = 19;
		
		//Act (When)
		String integridadAuto = auto.verificarIntegridad(); 
		
		//Assert (Then)
		assertEquals("Las piezas no son originales", integridadAuto);
	}

}
