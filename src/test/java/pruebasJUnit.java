import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import com.sanvalero.FeedbakMiguelJuarez.model.Detalle_Partido;

class pruebasJUnit {

	@Test
	@Timeout(5)
	@BeforeAll
	//Aqui lo unico que vamos a comprobar es que nos realize la  suma que tenemos en Detalle_Partido en este caso el total de Goles
	public void testAddOperation() {
		assertEquals(5, Detalle_Partido.add(3,2)); 
		assertEquals(1, Detalle_Partido.add(0,1)); 
		assertEquals(3, Detalle_Partido.add(3,0)); 
		assertEquals(7, Detalle_Partido.add(2,4)); 
		assertEquals(2, Detalle_Partido.add(1,1)); 
	}
	
	@Test
	void test() {
		fail("Not yet implemented");
	}

}
