package strategy.frete;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CalculadoraFreteTest {

	@Test
	public void deveCalcularFreteParaDHL() {
		CalculadoraFrete calculadora = new CalculadoraFrete();
		double valorFrete = calculadora.calcularValor("dhl", 9);
		double valorEsperado = 100.00;
		
		System.out.println(valorFrete);
		System.out.println(valorEsperado);

		assertNotNull(calculadora);
		assertTrue(valorFrete==valorEsperado);			
	}
	
	@Test
	public void deveCalcularFreteParaSedex() {
		CalculadoraFrete calculadora = new CalculadoraFrete();
		double valorFrete = calculadora.calcularValor("sedex", 9);
		double valorEsperado = 50.00;
		
		System.out.println(valorFrete);
		System.out.println(valorEsperado);

		assertNotNull(calculadora);
		assertTrue(valorFrete==valorEsperado);			
	}
	
	@Test
	public void deveCalcularFreteParaJadlog() {
		CalculadoraFrete calculadora = new CalculadoraFrete();
		double valorFrete = calculadora.calcularValor("jadlog", 9);
		double valorEsperado = 0.00;
		
		System.out.println(valorFrete);
		System.out.println(valorEsperado);

		assertNotNull(calculadora);
		assertTrue(valorFrete==valorEsperado);			
	}

}
