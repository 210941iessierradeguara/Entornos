package calculadora;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class CalculadoraTest {
	
	@BeforeAll
	public static void init() {
		System.out.println("Método Init");
	}
	
	@BeforeEach
	public void initEach() {
		System.out.println("Método InitEach");
	}
	
	@AfterAll
	public static void End() {
		System.out.println("Método Init");
	}
	
	@AfterEach
	public void EndEach() {
		System.out.println("Método InitEach");
	}
	
	@Test
	void testCalculadora() {
		//fail("Not yet implemented");
	}

	@Test
	@RepeatedTest(10)
	void testSuma() {
		Calculadora c = new Calculadora(4,5);
		int resultado = c.suma();
		assertEquals(9, resultado);
		//fail("Not yet implemented");
	}

	@Test
	void testResta() {
		Calculadora c = new Calculadora(10,5);
		int resultado = c.resta();
		assertEquals(5, resultado, "Deberia dar: 5");
		//fail("Not yet implemented");
	}

	@Test
	void testProducto() {
		Calculadora c = new Calculadora(4,5);
		int resultado = c.producto();
		assertEquals(20, resultado);
		//fail("Not yet implemented");
	}

	@Test
	void testDivision() {
		Calculadora c = new Calculadora(4,5);
		double resultado = c.division();
		assertEquals(0.8, resultado);
		//fail("Not yet implemented");
	}
	
	@ParameterizedTest
	@ValueSource(ints = { 2,3,4,5,6 })
	void testSignoRaiz(int candidate) {
		Calculadora c = new Calculadora(candidate , 1);
		assertTrue(c.raizNum1() > 0);
	}
	
	@ParameterizedTest
	@CsvSource({"1,1,2", "2,-1,1"})
	void comprobarSumas(int num1, int num2, int result) {
		Calculadora c = new Calculadora(num1, num2);
		assertEquals(result, c.suma());
	}
	
	@Test
	@Timeout(value = 500, unit=TimeUnit.MILLISECONDS)
	void testSumaLenta() {
		Calculadora c = new Calculadora(2, 3);
		assertEquals(5, c.sumaLenta());
	}

}
