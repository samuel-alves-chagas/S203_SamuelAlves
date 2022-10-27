package strategy.frete;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CalculadoraFreteTest {

	@Test
	public void deveCalcularFreteParaDHL() {
		CalculadoraFrete calculadora = new CalculadoraFrete();
		Fretavel servicoFreteDHL = new ServicoFreteDHL();
		double valorFrete = calculadora.calcular(servicoFreteDHL, 9);
		double valorEsperado = 100.00;

		assertTrue(valorFrete == valorEsperado);
	}

	@Test
	public void deveCalcularFreteParaSedex() {
		CalculadoraFrete calculadora = new CalculadoraFrete();
		Fretavel servicoFreteSedex= new ServicoFreteSedex();
		double valorFrete = calculadora.calcular(servicoFreteSedex, 9);
		double valorEsperado = 50.00;

		assertTrue(valorFrete == valorEsperado);
	}

	@Test
	public void deveCalcularFreteParaJadlog() {
		CalculadoraFrete calculadora = new CalculadoraFrete();
		Fretavel servicoFreteJadLog= new ServicoFreteJadlog();
		double valorFrete = calculadora.calcular(servicoFreteJadLog, 9);
		double valorEsperado = 0.00;

		assertTrue(valorFrete == valorEsperado);
	}
	
	@Test
	public void deveCalcularFreteParaFedEx() {
		CalculadoraFrete calculadora = new CalculadoraFrete();
		Fretavel servicoFreteFedEx= new ServicoFreteFedEx();
		double valorFrete = calculadora.calcular(servicoFreteFedEx, 40);
		double valorEsperado = 75;

		assertTrue(valorFrete == valorEsperado);
	}
}
