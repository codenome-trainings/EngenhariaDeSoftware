package br.com.calculacusto.modelo.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.calculacusto.modelo.Complexidade;
import br.com.calculacusto.modelo.PontoDeFuncaoDeDados;
import br.com.calculacusto.modelo.TipoDado;

public class PontoDeFuncaoDeDadosTest {

	@Before
	public void setUp() throws Exception {

	}

	@Test
	public void testValorDoPontoDeFuncaoInternoSimples1() {
		
		for (int i = 1; i <= 50; i++) {
			PontoDeFuncaoDeDados pontoDeFuncaoDeDados = new PontoDeFuncaoDeDados("SomaValores", 1, i, TipoDado.INTERNO);
			assertEquals(7, pontoDeFuncaoDeDados.valorDoPontoDeFuncao());
		}
		
	}
	
	@Test
	public void testValorDoPontoDeFuncaoInternoSimples2() {
		
		for (int i = 2; i <= 5; i++) {
			for (int j = 1; j <= 19; j++) {
				PontoDeFuncaoDeDados pontoDeFuncaoDeDados = new PontoDeFuncaoDeDados("SomaValores", i, j, TipoDado.INTERNO);
				assertEquals(7, pontoDeFuncaoDeDados.valorDoPontoDeFuncao());
			}
		}
		
	}

	@Test
	public void testValorDoPontoDeFuncaoInternoMedio1() {
		
		for (int i = 51; i <= 1000; i++) {
			PontoDeFuncaoDeDados pontoDeFuncaoDeDados = new PontoDeFuncaoDeDados("SomaValores", 1, i, TipoDado.INTERNO);
			assertEquals(10, pontoDeFuncaoDeDados.valorDoPontoDeFuncao());
		}

	}
	
	@Test
	public void testValorDoPontoDeFuncaoInternoMedio2() {
		for (int i = 2; i <= 5; i++) {
			for (int j = 20; j <= 50; j++) {
				PontoDeFuncaoDeDados pontoDeFuncaoDeDados = new PontoDeFuncaoDeDados("SomaValores", i, j, TipoDado.INTERNO);
				assertEquals(10, pontoDeFuncaoDeDados.valorDoPontoDeFuncao());
			}
		}
	}
	
	@Test
	public void testValorDoPontoDeFuncaoInternoMedio3() {
		for (int i = 6; i <= 1000; i++) {
			for (int j = 1; j <= 19; j++) {
				PontoDeFuncaoDeDados pontoDeFuncaoDeDados = new PontoDeFuncaoDeDados("SomaValores", i, j, TipoDado.INTERNO);
				assertEquals(10, pontoDeFuncaoDeDados.valorDoPontoDeFuncao());
			}
		}
	}
	
	@Test
	public void testValorDoPontoDeFuncaoInternoComplexo1() {
		for (int i = 2; i <= 5; i++) {
			for (int j = 51; j <= 1000; j++) {
				PontoDeFuncaoDeDados pontoDeFuncaoDeDados = new PontoDeFuncaoDeDados("SomaValores", i, j, TipoDado.INTERNO);
				assertEquals(15, pontoDeFuncaoDeDados.valorDoPontoDeFuncao());
			}
		}
	}
	
	@Test
	public void testValorDoPontoDeFuncaoInternoComplexo2() {
		for (int i = 6; i <= 1000; i++) {
			for (int j = 20; j <= 1000; j++) {
				PontoDeFuncaoDeDados pontoDeFuncaoDeDados = new PontoDeFuncaoDeDados("SomaValores", i, j, TipoDado.INTERNO);
				assertEquals(15, pontoDeFuncaoDeDados.valorDoPontoDeFuncao());
			}
		}
	}

	@Test
	public void testComplexidadeFuncionalSimples1() {
		for (int i = 1; i <= 19; i++) {
			PontoDeFuncaoDeDados pontoDeFuncaoDeDados = new PontoDeFuncaoDeDados(1, i);
			assertEquals(Complexidade.SIMPLES, pontoDeFuncaoDeDados.complexidadeFuncional());
		}
	}

	@Test
	public void testComplexidadeFuncionalSimples2() {
		for (int i = 20; i <= 50; i++) {
			PontoDeFuncaoDeDados pontoDeFuncaoDeDados = new PontoDeFuncaoDeDados(1, i);
			assertEquals(Complexidade.SIMPLES, pontoDeFuncaoDeDados.complexidadeFuncional());
		}
	}

	@Test
	public void testComplexidadeFuncionalSimples3() {
		for (int i = 2; i <= 5; i++) {
			for (int j = 1; j <= 19; j++) {
				PontoDeFuncaoDeDados pontoDeFuncaoDeDados = new PontoDeFuncaoDeDados(i, j);
				assertEquals(Complexidade.SIMPLES, pontoDeFuncaoDeDados.complexidadeFuncional());
			}
		}
	}

	@Test
	public void testComplexidadeFuncionalMedio1() {
		for (int i = 51; i <= 1000; i++) {
			PontoDeFuncaoDeDados pontoDeFuncaoDeDadosInterno = new PontoDeFuncaoDeDados(1, i);
			assertEquals(Complexidade.MEDIO, pontoDeFuncaoDeDadosInterno.complexidadeFuncional());
		}
	}

	@Test
	public void testComplexidadeFuncionalMedio2() {
		for (int i = 2; i <= 5; i++) {
			for (int j = 20; j <= 50; j++) {
				PontoDeFuncaoDeDados pontoDeFuncaoDeDadosInterno = new PontoDeFuncaoDeDados(i, j);
				assertEquals(Complexidade.MEDIO, pontoDeFuncaoDeDadosInterno.complexidadeFuncional());
			}
		}
	}

	@Test
	public void testComplexidadeFuncionalMedio3() {
		for (int i = 6; i <= 1000; i++) {
			for (int j = 1; j < 19; j++) {
				PontoDeFuncaoDeDados pontoDeFuncaoDeDadosInterno = new PontoDeFuncaoDeDados(i, j);
				assertEquals(Complexidade.MEDIO, pontoDeFuncaoDeDadosInterno.complexidadeFuncional());
			}
		}
	}

	@Test
	public void testComplexidadeFuncionalComplexo1() {
		for (int i = 2; i <= 5; i++) {
			for (int j = 51; j <= 1000; j++) {
				PontoDeFuncaoDeDados pontoDeFuncaoDeDadosInterno = new PontoDeFuncaoDeDados(i, j);
				assertEquals(Complexidade.COMPLEXO, pontoDeFuncaoDeDadosInterno.complexidadeFuncional());
			}
		}
	}

	@Test
	public void testComplexidadeFuncionalComplexo2() {
		for (int i = 6; i < 1000; i++) {
			for (int j = 20; j <= 50; j++) {
				PontoDeFuncaoDeDados pontoDeFuncaoDeDadosInterno = new PontoDeFuncaoDeDados(i, j);
				assertEquals(Complexidade.COMPLEXO, pontoDeFuncaoDeDadosInterno.complexidadeFuncional());
			}
		}
	}

	@Test
	public void testComplexidadeFuncionalComplexo3() {
		for (int i = 6; i < 1000; i++) {
			for (int j = 51; j <= 1000; j++) {
				PontoDeFuncaoDeDados pontoDeFuncaoDeDadosInterno = new PontoDeFuncaoDeDados(i, j);
				assertEquals(Complexidade.COMPLEXO, pontoDeFuncaoDeDadosInterno.complexidadeFuncional());
			}
		}
	}

	@Test
	public void testComplexidadeFuncionalComplexoNull() {
		PontoDeFuncaoDeDados pontoDeFuncaoDeDadosInternoMedio = new PontoDeFuncaoDeDados(0, 0);
		assertEquals(null, pontoDeFuncaoDeDadosInternoMedio.complexidadeFuncional());
	}

	/*
	 * Definição de valor de ponto de função Interno
	 */
	@Test
	public void testDefineValorPontoDeFuncaoInternoSimples1() {
		int valorEsperado = 7;
		for (int i = 1; i <= 19; i++) {
			PontoDeFuncaoDeDados pontoDeFuncaoDeDados = new PontoDeFuncaoDeDados(1, i);
			assertEquals(valorEsperado, pontoDeFuncaoDeDados.defineValorPontoDeFuncaoInterno());
		}
	}

	@Test
	public void testDefineValorPontoDeFuncaoInternoSimples2() {
		int valorEsperado = 7;
		for (int i = 20; i <= 50; i++) {
			PontoDeFuncaoDeDados pontoDeFuncaoDeDados = new PontoDeFuncaoDeDados(1, i);
			assertEquals(valorEsperado, pontoDeFuncaoDeDados.defineValorPontoDeFuncaoInterno());
		}
	}

	@Test
	public void testDefineValorPontoDeFuncaoInternoSimples3() {
		int valorEsperado = 7;
		for (int i = 2; i <= 5; i++) {
			for (int j = 1; j <= 19; j++) {
				PontoDeFuncaoDeDados pontoDeFuncaoDeDados = new PontoDeFuncaoDeDados(i, j);
				assertEquals(valorEsperado, pontoDeFuncaoDeDados.defineValorPontoDeFuncaoInterno());
			}
		}
	}

	@Test
	public void testDefineValorPontoDeFuncaoInternoMedio1() {
		int valorEsperado = 10;
		for (int i = 51; i <= 1000; i++) {
			PontoDeFuncaoDeDados pontoDeFuncaoDeDados = new PontoDeFuncaoDeDados(1, i);
			assertEquals(valorEsperado, pontoDeFuncaoDeDados.defineValorPontoDeFuncaoInterno());
		}
	}

	@Test
	public void testDefineValorPontoDeFuncaoInternoMedio2() {
		int valorEsperado = 10;
		for (int i = 2; i <= 5; i++) {
			for (int j = 20; j <= 50; j++) {
				PontoDeFuncaoDeDados pontoDeFuncaoDeDados = new PontoDeFuncaoDeDados(i, j);
				assertEquals(valorEsperado, pontoDeFuncaoDeDados.defineValorPontoDeFuncaoInterno());
			}
		}
	}

	@Test
	public void testDefineValorPontoDeFuncaoInternoMedio3() {
		int valorEsperado = 10;
		for (int i = 6; i <= 1000; i++) {
			for (int j = 1; j < 19; j++) {
				PontoDeFuncaoDeDados pontoDeFuncaoDeDados = new PontoDeFuncaoDeDados(i, j);
				assertEquals(valorEsperado, pontoDeFuncaoDeDados.defineValorPontoDeFuncaoInterno());
			}
		}
	}

	@Test
	public void testDefineValorPontoDeFuncaoInternoComplexo1() {
		int valorEsperado = 15;
		for (int i = 2; i <= 5; i++) {
			for (int j = 51; j <= 1000; j++) {
				PontoDeFuncaoDeDados pontoDeFuncaoDeDados = new PontoDeFuncaoDeDados(i, j);
				assertEquals(valorEsperado, pontoDeFuncaoDeDados.defineValorPontoDeFuncaoInterno());
			}
		}
	}

	@Test
	public void testDefineValorPontoDeFuncaoInternoComplexo2() {
		int valorEsperado = 15;
		for (int i = 6; i < 1000; i++) {
			for (int j = 20; j <= 50; j++) {
				PontoDeFuncaoDeDados pontoDeFuncaoDeDados = new PontoDeFuncaoDeDados(i, j);
				assertEquals(valorEsperado, pontoDeFuncaoDeDados.defineValorPontoDeFuncaoInterno());
			}
		}
	}

	@Test
	public void testDefineValorPontoDeFuncaoInternoComplexo3() {
		int valorEsperado = 15;
		for (int i = 6; i < 1000; i++) {
			for (int j = 51; j <= 1000; j++) {
				PontoDeFuncaoDeDados pontoDeFuncaoDeDados = new PontoDeFuncaoDeDados(i, j);
				assertEquals(valorEsperado, pontoDeFuncaoDeDados.defineValorPontoDeFuncaoInterno());
			}
		}
	}

	/*
	 * Definição de valor de ponto de função Externo
	 */
	@Test
	public void testDefineValorPontoDeFuncaoExternoSimples1() {
		int valorEsperado = 5;
		for (int i = 1; i <= 19; i++) {
			PontoDeFuncaoDeDados pontoDeFuncaoDeDados = new PontoDeFuncaoDeDados(1, i);
			assertEquals(valorEsperado, pontoDeFuncaoDeDados.defineValorPontoDeFuncaoExterno());
		}
	}

	@Test
	public void testDefineValorPontoDeFuncaoExternoSimples2() {
		int valorEsperado = 5;
		for (int i = 20; i <= 50; i++) {
			PontoDeFuncaoDeDados pontoDeFuncaoDeDados = new PontoDeFuncaoDeDados(1, i);
			assertEquals(valorEsperado, pontoDeFuncaoDeDados.defineValorPontoDeFuncaoExterno());
		}
	}

	@Test
	public void testDefineValorPontoDeFuncaoExternoSimples3() {
		int valorEsperado = 5;
		for (int i = 2; i <= 5; i++) {
			for (int j = 1; j <= 19; j++) {
				PontoDeFuncaoDeDados pontoDeFuncaoDeDados = new PontoDeFuncaoDeDados(i, j);
				assertEquals(valorEsperado, pontoDeFuncaoDeDados.defineValorPontoDeFuncaoExterno());
			}
		}
	}

	@Test
	public void testDefineValorPontoDeFuncaoExternoMedio1() {
		int valorEsperado = 7;
		for (int i = 51; i <= 1000; i++) {
			PontoDeFuncaoDeDados pontoDeFuncaoDeDados = new PontoDeFuncaoDeDados(1, i);
			assertEquals(valorEsperado, pontoDeFuncaoDeDados.defineValorPontoDeFuncaoExterno());
		}
	}

	@Test
	public void testDefineValorPontoDeFuncaoExternoMedio2() {
		int valorEsperado = 7;
		for (int i = 2; i <= 5; i++) {
			for (int j = 20; j <= 50; j++) {
				PontoDeFuncaoDeDados pontoDeFuncaoDeDados = new PontoDeFuncaoDeDados(i, j);
				assertEquals(valorEsperado, pontoDeFuncaoDeDados.defineValorPontoDeFuncaoExterno());
			}
		}
	}

	@Test
	public void testDefineValorPontoDeFuncaoExternoMedio3() {
		int valorEsperado = 7;
		for (int i = 6; i <= 1000; i++) {
			for (int j = 1; j < 19; j++) {
				PontoDeFuncaoDeDados pontoDeFuncaoDeDados = new PontoDeFuncaoDeDados(i, j);
				assertEquals(valorEsperado, pontoDeFuncaoDeDados.defineValorPontoDeFuncaoExterno());
			}
		}
	}

	@Test
	public void testDefineValorPontoDeFuncaoExternoComplexo1() {
		int valorEsperado = 10;
		for (int i = 2; i <= 5; i++) {
			for (int j = 51; j <= 1000; j++) {
				PontoDeFuncaoDeDados pontoDeFuncaoDeDados = new PontoDeFuncaoDeDados(i, j);
				assertEquals(valorEsperado, pontoDeFuncaoDeDados.defineValorPontoDeFuncaoExterno());
			}
		}
	}

	@Test
	public void testDefineValorPontoDeFuncaoExternoComplexo2() {
		int valorEsperado = 10;
		for (int i = 6; i < 1000; i++) {
			for (int j = 20; j <= 50; j++) {
				PontoDeFuncaoDeDados pontoDeFuncaoDeDados = new PontoDeFuncaoDeDados(i, j);
				assertEquals(valorEsperado, pontoDeFuncaoDeDados.defineValorPontoDeFuncaoExterno());
			}
		}
	}

	@Test
	public void testDefineValorPontoDeFuncaoExternoComplexo3() {
		int valorEsperado = 10;
		for (int i = 6; i < 1000; i++) {
			for (int j = 51; j <= 1000; j++) {
				PontoDeFuncaoDeDados pontoDeFuncaoDeDados = new PontoDeFuncaoDeDados(i, j);
				assertEquals(valorEsperado, pontoDeFuncaoDeDados.defineValorPontoDeFuncaoExterno());
			}
		}
	}

}