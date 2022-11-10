package Teste;

import Classe.Calculo;
import junit.framework.TestCase;

public class CalculoTest extends TestCase {

	public void testExecutaCalculo() {

		// Define os valores a serem calculados e testados
		float PassValor1 = 25;
		float PassValor2 = 32;
		float RetEsp = 57;

		// Dispara o metodo "ExecutaCalculo" da classe "Calculo" e armazena
		// resultado em uma variavel
		float RetFeito = Calculo.ExecutaCalculo(PassValor1, PassValor2);

		// Compara o valor retornado com o que era esperado
		assertEquals(RetEsp, RetFeito, 0);

	}

}
