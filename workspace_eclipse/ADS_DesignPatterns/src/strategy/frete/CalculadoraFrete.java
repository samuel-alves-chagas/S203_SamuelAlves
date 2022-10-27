package strategy.frete;

import javax.management.RuntimeErrorException;

public class CalculadoraFrete {

	public double calcular(Fretavel fretavel, double pesoEmKg) {
		return fretavel.calcularValor(pesoEmKg);
	}
}
