package br.com.calculacusto.modelo.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.calculacusto.modelo.Complexidade;
import br.com.calculacusto.modelo.PontoDeFuncaoTransacional;
import br.com.calculacusto.modelo.TipoFuncao;

public class PontoDeFuncaoTransacionalTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testValorDoPontoDeFuncaoEntradaSimples1() {
		for (int i = 0; i <= 1; i++) {
			for (int j = 1; j <= 4; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j, TipoFuncao.ENTRADA);
				assertEquals(3, pontoDeFuncaoTransacional.valorDoPontoDeFuncao());
			}
		}
	}
	
	@Test
	public void testValorDoPontoDeFuncaoEntradaSimples2() {
		for (int i = 0; i <= 1; i++) {
			for (int j = 5; j <= 15; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j,
						TipoFuncao.ENTRADA);
				assertEquals(3, pontoDeFuncaoTransacional.valorDoPontoDeFuncao());
			}
		}
	}
	
	@Test
	public void testValorDoPontoDeFuncaoEntradaSimples3() {
		for (int i = 1; i <= 4; i++) {
			PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(2, i,
					TipoFuncao.ENTRADA);
			assertEquals(3, pontoDeFuncaoTransacional.valorDoPontoDeFuncao());
		}
	}
	
	@Test
	public void testValorDoPontoDeFuncaoEntradaMedio1() {
		for (int i = 0; i <= 1; i++) {
			for (int j = 16; j <= 1000; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j,
						TipoFuncao.ENTRADA);
				assertEquals(4, pontoDeFuncaoTransacional.valorDoPontoDeFuncao());
			}
		}
	}
	
	@Test
	public void testValorDoPontoDeFuncaoEntradaMedio2() {
		for (int j = 5; j <= 15; j++) {
			PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(2, j,
					TipoFuncao.ENTRADA);
			assertEquals(4, pontoDeFuncaoTransacional.valorDoPontoDeFuncao());
		}
	}
	
	@Test
	public void testValorDoPontoDeFuncaoEntradaMedio3() {
		for (int i = 3; i <= 1000; i++) {
			for (int j = 1; j <= 4; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j,
						TipoFuncao.ENTRADA);
				assertEquals(4, pontoDeFuncaoTransacional.valorDoPontoDeFuncao());
			}
		}
	}
	
	@Test
	public void testValorDoPontoDeFuncaoEntradaComplexo1() {
		for (int i = 16; i <= 1000; i++) {
			PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(2, i,
					TipoFuncao.ENTRADA);
			assertEquals(6, pontoDeFuncaoTransacional.valorDoPontoDeFuncao());
		}
	}
	
	@Test
	public void testValorDoPontoDeFuncaoEntradaComplexo2() {
		for (int i = 3; i <= 1000; i++) {
			for (int j = 5; j < 15; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j,
						TipoFuncao.ENTRADA);
				assertEquals(6, pontoDeFuncaoTransacional.valorDoPontoDeFuncao());
			}
		}
	}
	
	@Test
	public void testValorDoPontoDeFuncaoEntradaComplexo3() {
		for (int i = 3; i <= 1000; i++) {
			for (int j = 16; j <= 1000; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j,
						TipoFuncao.ENTRADA);
				assertEquals(6, pontoDeFuncaoTransacional.valorDoPontoDeFuncao());
			}
		}
	}
	
	@Test
	public void testValorDoPontoDeFuncaoSaidaSimples1() {
		for (int i = 0; i <= 1; i++) {
			for (int j = 1; j <= 5; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j, TipoFuncao.SAIDA);
				assertEquals(4, pontoDeFuncaoTransacional.valorDoPontoDeFuncao());
			}
		}
	}

	@Test
	public void testValorDoPontoDeFuncaoSaidaSimples2() {
		for (int i = 0; i <= 1; i++) {
			for (int j = 6; j <= 19; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j, TipoFuncao.SAIDA);
				assertEquals(4, pontoDeFuncaoTransacional.valorDoPontoDeFuncao());
			}
		}
	}

	@Test
	public void testValorDoPontoDeFuncaoSaidaSimples3() {
		for (int i = 2; i <= 3; i++) {
			for (int j = 1; j <= 5; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j, TipoFuncao.SAIDA);
				assertEquals(4, pontoDeFuncaoTransacional.valorDoPontoDeFuncao());
			}
		}
	}
	
	@Test
	public void testValorDoPontoDeFuncaoSaidaMedio1() {
		for (int i = 0; i <= 1; i++) {
			for (int j = 20; j <= 1000; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j, TipoFuncao.SAIDA);
				assertEquals(5, pontoDeFuncaoTransacional.valorDoPontoDeFuncao());
			}
		}
	}

	@Test
	public void testValorDoPontoDeFuncaoSaidaMedio2() {
		for (int i = 2; i <= 3; i++) {
			for (int j = 6; j <= 19; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j, TipoFuncao.SAIDA);
				assertEquals(5, pontoDeFuncaoTransacional.valorDoPontoDeFuncao());
			}
		}
	}

	@Test
	public void testValorDoPontoDeFuncaoSaidaMedio3() {
		for (int i = 4; i <= 1000; i++) {
			for (int j = 1; j <= 5; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j, TipoFuncao.SAIDA);
				assertEquals(5, pontoDeFuncaoTransacional.valorDoPontoDeFuncao());
			}
		}
	}
	
	@Test
	public void testValorDoPontoDeFuncaoSaidaComplexo1() {
		for (int i = 2; i <= 3; i++) {
			for (int j = 20; j <= 1000; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j, TipoFuncao.SAIDA);
				assertEquals(7, pontoDeFuncaoTransacional.valorDoPontoDeFuncao());
			}
		}
	}

	@Test
	public void testValorDoPontoDeFuncaoSaidaComplexo2() {
		for (int i = 4; i <= 1000; i++) {
			for (int j = 6; j <= 19; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j, TipoFuncao.SAIDA);
				assertEquals(7, pontoDeFuncaoTransacional.valorDoPontoDeFuncao());
			}
		}
	}

	@Test
	public void testValorDoPontoDeFuncaoSaidaComplexo3() {
		for (int i = 4; i <= 1000; i++) {
			for (int j = 20; j <= 1000; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j, TipoFuncao.SAIDA);
				assertEquals(7, pontoDeFuncaoTransacional.valorDoPontoDeFuncao());
			}
		}
	}
	
	@Test
	public void testValorDoPontoDeFuncaoConsultaSimples1() {
		for (int i = 0; i <= 1; i++) {
			for (int j = 1; j <= 5; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j, TipoFuncao.CONSULTA);
				assertEquals(3, pontoDeFuncaoTransacional.valorDoPontoDeFuncao());
			}
		}
	}

	@Test
	public void testValorDoPontoDeFuncaoConsultaSimples2() {
		for (int i = 0; i <= 1; i++) {
			for (int j = 6; j <= 19; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j, TipoFuncao.CONSULTA);
				assertEquals(3, pontoDeFuncaoTransacional.valorDoPontoDeFuncao());
			}
		}
	}

	@Test
	public void testValorDoPontoDeFuncaoConsultaSimples3() {
		for (int i = 2; i <= 3; i++) {
			for (int j = 1; j <= 5; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j, TipoFuncao.CONSULTA);
				assertEquals(3, pontoDeFuncaoTransacional.valorDoPontoDeFuncao());
			}
		}
	}
	
	@Test
	public void testValorDoPontoDeFuncaoConsultaMedio1() {
		for (int i = 0; i <= 1; i++) {
			for (int j = 20; j <= 1000; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j, TipoFuncao.CONSULTA);
				assertEquals(4, pontoDeFuncaoTransacional.valorDoPontoDeFuncao());
			}
		}
	}

	@Test
	public void testValorDoPontoDeFuncaoConsultaMedio2() {
		for (int i = 2; i <= 3; i++) {
			for (int j = 6; j <= 19; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j, TipoFuncao.CONSULTA);
				assertEquals(4, pontoDeFuncaoTransacional.valorDoPontoDeFuncao());
			}
		}
	}

	@Test
	public void testValorDoPontoDeFuncaoConsultaMedio3() {
		for (int i = 4; i <= 1000; i++) {
			for (int j = 1; j <= 5; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j, TipoFuncao.CONSULTA);
				assertEquals(4, pontoDeFuncaoTransacional.valorDoPontoDeFuncao());
			}
		}
	}
	
	@Test
	public void testValorDoPontoDeFuncaoConsultaComplexo1() {
		for (int i = 2; i <= 3; i++) {
			for (int j = 20; j <= 1000; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j, TipoFuncao.CONSULTA);
				assertEquals(6, pontoDeFuncaoTransacional.valorDoPontoDeFuncao());
			}
		}
	}

	@Test
	public void testValorDoPontoDeFuncaoConsultaComplexo2() {
		for (int i = 4; i <= 1000; i++) {
			for (int j = 6; j <= 19; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j, TipoFuncao.CONSULTA);
				assertEquals(6, pontoDeFuncaoTransacional.valorDoPontoDeFuncao());
			}
		}
	}

	@Test
	public void testValorDoPontoDeFuncaoConsultaComplexo3() {
		for (int i = 4; i <= 1000; i++) {
			for (int j = 20; j <= 1000; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j, TipoFuncao.CONSULTA);
				assertEquals(6, pontoDeFuncaoTransacional.valorDoPontoDeFuncao());
			}
		}
	}
	
	@Test
	public void testComplexidadeFuncionalEntradaSimples1() {
		for (int i = 0; i <= 1; i++) {
			for (int j = 1; j <= 4; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j,
						TipoFuncao.ENTRADA);
				assertEquals(Complexidade.SIMPLES, pontoDeFuncaoTransacional.complexidadeFuncional());
			}
		}
	}

	@Test
	public void testComplexidadeFuncionalEntradaSimples2() {
		for (int i = 0; i <= 1; i++) {
			for (int j = 5; j <= 15; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j,
						TipoFuncao.ENTRADA);
				assertEquals(Complexidade.SIMPLES, pontoDeFuncaoTransacional.complexidadeFuncional());
			}
		}
	}

	@Test
	public void testComplexidadeFuncionalEntradaSimples3() {
		for (int i = 1; i <= 4; i++) {
			PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(2, i,
					TipoFuncao.ENTRADA);
			assertEquals(Complexidade.SIMPLES, pontoDeFuncaoTransacional.complexidadeFuncional());
		}
	}

	@Test
	public void testComplexidadeFuncionalEntradaMedio1() {
		for (int i = 0; i <= 1; i++) {
			for (int j = 16; j <= 1000; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j,
						TipoFuncao.ENTRADA);
				assertEquals(Complexidade.MEDIO, pontoDeFuncaoTransacional.complexidadeFuncional());
			}
		}
	}

	@Test
	public void testComplexidadeFuncionalEntradaMedio2() {
		for (int j = 5; j <= 15; j++) {
			PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(2, j,
					TipoFuncao.ENTRADA);
			assertEquals(Complexidade.MEDIO, pontoDeFuncaoTransacional.complexidadeFuncional());
		}
	}

	@Test
	public void testComplexidadeFuncionalEntradaMedio3() {
		for (int i = 3; i <= 1000; i++) {
			for (int j = 1; j <= 4; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j,
						TipoFuncao.ENTRADA);
				assertEquals(Complexidade.MEDIO, pontoDeFuncaoTransacional.complexidadeFuncional());
			}
		}
	}

	@Test
	public void testComplexidadeFuncionalEntradaComplexo1() {
		for (int i = 16; i <= 1000; i++) {
			PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(2, i,
					TipoFuncao.ENTRADA);
			assertEquals(Complexidade.COMPLEXO, pontoDeFuncaoTransacional.complexidadeFuncional());
		}
	}

	@Test
	public void testComplexidadeFuncionalEntradaComplexo2() {
		for (int i = 3; i <= 1000; i++) {
			for (int j = 5; j < 15; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j,
						TipoFuncao.ENTRADA);
				assertEquals(Complexidade.COMPLEXO, pontoDeFuncaoTransacional.complexidadeFuncional());
			}
		}
	}

	@Test
	public void testComplexidadeFuncionalEntradaComplexo3() {
		for (int i = 3; i <= 1000; i++) {
			for (int j = 16; j <= 1000; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j,
						TipoFuncao.ENTRADA);
				assertEquals(Complexidade.COMPLEXO, pontoDeFuncaoTransacional.complexidadeFuncional());
			}
		}
	}

	@Test
	public void testComplexidadeFuncionalSaidaSimples1() {
		for (int i = 0; i <= 1; i++) {
			for (int j = 1; j <= 5; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j,
						TipoFuncao.SAIDA);
				assertEquals(Complexidade.SIMPLES, pontoDeFuncaoTransacional.complexidadeFuncional());
			}
		}
	}

	@Test
	public void testComplexidadeFuncionalSaidaSimples2() {
		for (int i = 0; i <= 1; i++) {
			for (int j = 6; j <= 19; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j,
						TipoFuncao.SAIDA);
				assertEquals(Complexidade.SIMPLES, pontoDeFuncaoTransacional.complexidadeFuncional());
			}
		}
	}

	@Test
	public void testComplexidadeFuncionalSaidaSimples3() {
		for (int i = 2; i <= 3; i++) {
			for (int j = 1; j <= 5; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j,
						TipoFuncao.SAIDA);
				assertEquals(Complexidade.SIMPLES, pontoDeFuncaoTransacional.complexidadeFuncional());
			}
		}
	}
	
	@Test
	public void testComplexidadeFuncionalSaidaMedio1() {
		for (int i = 0; i <= 1; i++) {
			for (int j = 20; j <= 1000; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j, TipoFuncao.SAIDA);
				assertEquals(Complexidade.MEDIO,
						pontoDeFuncaoTransacional.complexidadeFuncional());
			}
		}
	}

	@Test
	public void testComplexidadeFuncionalSaidaMedio2() {
		for (int i = 2; i <= 3; i++) {
			for (int j = 6; j <= 19; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j, TipoFuncao.SAIDA);
				assertEquals(Complexidade.MEDIO,
						pontoDeFuncaoTransacional.complexidadeFuncional());
			}
		}
	}

	@Test
	public void testComplexidadeFuncionalSaidaMedio3() {
		for (int i = 4; i <= 1000; i++) {
			for (int j = 1; j <= 5; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j, TipoFuncao.SAIDA);
				assertEquals(Complexidade.MEDIO,
						pontoDeFuncaoTransacional.complexidadeFuncional());
			}
		}
	}
	
	@Test
	public void testComplexidadeFuncionalSaidaComplexo1() {
		for (int i = 2; i <= 3; i++) {
			for (int j = 20; j <= 1000; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j, TipoFuncao.SAIDA);
				assertEquals(Complexidade.COMPLEXO,
						pontoDeFuncaoTransacional.complexidadeFuncional());
			}
		}
	}

	@Test
	public void testComplexidadeFuncionalSaidaComplexo2() {
		for (int i = 4; i <= 1000; i++) {
			for (int j = 6; j <= 19; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j, TipoFuncao.SAIDA);
				assertEquals(Complexidade.COMPLEXO,
						pontoDeFuncaoTransacional.complexidadeFuncional());
			}
		}
	}

	@Test
	public void testComplexidadeFuncionalSaidaComplexo3() {
		for (int i = 4; i <= 1000; i++) {
			for (int j = 20; j <= 1000; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j, TipoFuncao.SAIDA);
				assertEquals(Complexidade.COMPLEXO,
						pontoDeFuncaoTransacional.complexidadeFuncional());
			}
		}
	}
	
	@Test
	public void testComplexidadeFuncionalConsultaSimples1() {
		for (int i = 0; i <= 1; i++) {
			for (int j = 1; j <= 5; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j,
						TipoFuncao.CONSULTA);
				assertEquals(Complexidade.SIMPLES, pontoDeFuncaoTransacional.complexidadeFuncional());
			}
		}
	}

	@Test
	public void testComplexidadeFuncionalConsultaSimples2() {
		for (int i = 0; i <= 1; i++) {
			for (int j = 6; j <= 19; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j,
						TipoFuncao.CONSULTA);
				assertEquals(Complexidade.SIMPLES, pontoDeFuncaoTransacional.complexidadeFuncional());
			}
		}
	}

	@Test
	public void testComplexidadeFuncionalConsultaSimples3() {
		for (int i = 2; i <= 3; i++) {
			for (int j = 1; j <= 5; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j,
						TipoFuncao.CONSULTA);
				assertEquals(Complexidade.SIMPLES, pontoDeFuncaoTransacional.complexidadeFuncional());
			}
		}
	}
	
	@Test
	public void testComplexidadeFuncionalConsultaMedio1() {
		for (int i = 0; i <= 1; i++) {
			for (int j = 20; j <= 1000; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j, TipoFuncao.CONSULTA);
				assertEquals(Complexidade.MEDIO,
						pontoDeFuncaoTransacional.complexidadeFuncional());
			}
		}
	}

	@Test
	public void testComplexidadeFuncionalConsultaMedio2() {
		for (int i = 2; i <= 3; i++) {
			for (int j = 6; j <= 19; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j, TipoFuncao.CONSULTA);
				assertEquals(Complexidade.MEDIO,
						pontoDeFuncaoTransacional.complexidadeFuncional());
			}
		}
	}

	@Test
	public void testComplexidadeFuncionalConsultaMedio3() {
		for (int i = 4; i <= 1000; i++) {
			for (int j = 1; j <= 5; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j, TipoFuncao.CONSULTA);
				assertEquals(Complexidade.MEDIO,
						pontoDeFuncaoTransacional.complexidadeFuncional());
			}
		}
	}
	
	@Test
	public void testComplexidadeFuncionalConsultaComplexo1() {
		for (int i = 2; i <= 3; i++) {
			for (int j = 20; j <= 1000; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j, TipoFuncao.CONSULTA);
				assertEquals(Complexidade.COMPLEXO,
						pontoDeFuncaoTransacional.complexidadeFuncional());
			}
		}
	}

	@Test
	public void testComplexidadeFuncionalConsultaComplexo2() {
		for (int i = 4; i <= 1000; i++) {
			for (int j = 6; j <= 19; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j, TipoFuncao.CONSULTA);
				assertEquals(Complexidade.COMPLEXO,
						pontoDeFuncaoTransacional.complexidadeFuncional());
			}
		}
	}

	@Test
	public void testComplexidadeFuncionalConsultaComplexo3() {
		for (int i = 4; i <= 1000; i++) {
			for (int j = 20; j <= 1000; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j, TipoFuncao.CONSULTA);
				assertEquals(Complexidade.COMPLEXO,
						pontoDeFuncaoTransacional.complexidadeFuncional());
			}
		}
	}

	@Test
	public void testComplexidadeFuncionalDeEntradaExternaSimples1() {
		for (int i = 0; i <= 1; i++) {
			for (int j = 1; j <= 4; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j);
				assertEquals(Complexidade.SIMPLES, pontoDeFuncaoTransacional.complexidadeFuncionalDeEntradaExterna());
			}
		}
	}

	@Test
	public void testComplexidadeFuncionalDeEntradaExternaSimples2() {
		for (int i = 0; i <= 1; i++) {
			for (int j = 5; j <= 15; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j);
				assertEquals(Complexidade.SIMPLES, pontoDeFuncaoTransacional.complexidadeFuncionalDeEntradaExterna());
			}
		}
	}

	@Test
	public void testComplexidadeFuncionalDeEntradaExternaSimples3() {
		for (int i = 1; i <= 4; i++) {
			PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(2, i);
			assertEquals(Complexidade.SIMPLES, pontoDeFuncaoTransacional.complexidadeFuncionalDeEntradaExterna());
		}
	}

	@Test
	public void testComplexidadeFuncionalDeEntradaExternaMedio1() {
		for (int i = 0; i <= 1; i++) {
			for (int j = 16; j <= 1000; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j);
				assertEquals(Complexidade.MEDIO, pontoDeFuncaoTransacional.complexidadeFuncionalDeEntradaExterna());
			}
		}
	}

	@Test
	public void testComplexidadeFuncionalDeEntradaExternaMedio2() {
		for (int j = 5; j <= 15; j++) {
			PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(2, j);
			assertEquals(Complexidade.MEDIO, pontoDeFuncaoTransacional.complexidadeFuncionalDeEntradaExterna());
		}
	}

	@Test
	public void testComplexidadeFuncionalDeEntradaExternaMedio3() {
		for (int i = 3; i <= 1000; i++) {
			for (int j = 1; j <= 4; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j);
				assertEquals(Complexidade.MEDIO, pontoDeFuncaoTransacional.complexidadeFuncionalDeEntradaExterna());
			}
		}
	}

	@Test
	public void testComplexidadeFuncionalDeEntradaExternaComplexo1() {
		for (int i = 16; i <= 1000; i++) {
			PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(2, i);
			assertEquals(Complexidade.COMPLEXO, pontoDeFuncaoTransacional.complexidadeFuncionalDeEntradaExterna());
		}
	}

	@Test
	public void testComplexidadeFuncionalDeEntradaExternaComplexo2() {
		for (int i = 3; i <= 1000; i++) {
			for (int j = 5; j < 15; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j);
				assertEquals(Complexidade.COMPLEXO, pontoDeFuncaoTransacional.complexidadeFuncionalDeEntradaExterna());
			}
		}
	}

	@Test
	public void testComplexidadeFuncionalDeEntradaExternaComplexo3() {
		for (int i = 3; i <= 1000; i++) {
			for (int j = 16; j <= 1000; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j);
				assertEquals(Complexidade.COMPLEXO, pontoDeFuncaoTransacional.complexidadeFuncionalDeEntradaExterna());
			}
		}
	}

	@Test
	public void testComplexidadeFuncionalDeSaidasConsultasExternasSimples1() {
		for (int i = 0; i <= 1; i++) {
			for (int j = 1; j <= 5; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j);
				assertEquals(Complexidade.SIMPLES,
						pontoDeFuncaoTransacional.complexidadeFuncionalDeSaidasConsultasExternas());
			}
		}
	}

	@Test
	public void testComplexidadeFuncionalDeSaidasConsultasExternasSimples2() {
		for (int i = 0; i <= 1; i++) {
			for (int j = 6; j <= 19; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j);
				assertEquals(Complexidade.SIMPLES,
						pontoDeFuncaoTransacional.complexidadeFuncionalDeSaidasConsultasExternas());
			}
		}
	}

	@Test
	public void testComplexidadeFuncionalDeSaidasConsultasExternasSimples3() {
		for (int i = 2; i <= 3; i++) {
			for (int j = 1; j <= 5; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j);
				assertEquals(Complexidade.SIMPLES,
						pontoDeFuncaoTransacional.complexidadeFuncionalDeSaidasConsultasExternas());
			}
		}
	}

	@Test
	public void testComplexidadeFuncionalDeSaidasConsultasExternasMedio1() {
		for (int i = 0; i <= 1; i++) {
			for (int j = 20; j <= 1000; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j);
				assertEquals(Complexidade.MEDIO,
						pontoDeFuncaoTransacional.complexidadeFuncionalDeSaidasConsultasExternas());
			}
		}
	}

	@Test
	public void testComplexidadeFuncionalDeSaidasConsultasExternasMedio2() {
		for (int i = 2; i <= 3; i++) {
			for (int j = 6; j <= 19; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j);
				assertEquals(Complexidade.MEDIO,
						pontoDeFuncaoTransacional.complexidadeFuncionalDeSaidasConsultasExternas());
			}
		}
	}

	@Test
	public void testComplexidadeFuncionalDeSaidasConsultasExternasMedio3() {
		for (int i = 4; i <= 1000; i++) {
			for (int j = 1; j <= 5; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j);
				assertEquals(Complexidade.MEDIO,
						pontoDeFuncaoTransacional.complexidadeFuncionalDeSaidasConsultasExternas());
			}
		}
	}

	@Test
	public void testComplexidadeFuncionalDeSaidasConsultasExternasComplexo1() {
		for (int i = 2; i <= 3; i++) {
			for (int j = 20; j <= 1000; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j);
				assertEquals(Complexidade.COMPLEXO,
						pontoDeFuncaoTransacional.complexidadeFuncionalDeSaidasConsultasExternas());
			}
		}
	}

	@Test
	public void testComplexidadeFuncionalDeSaidasConsultasExternasComplexo2() {
		for (int i = 4; i <= 1000; i++) {
			for (int j = 6; j <= 19; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j);
				assertEquals(Complexidade.COMPLEXO,
						pontoDeFuncaoTransacional.complexidadeFuncionalDeSaidasConsultasExternas());
			}
		}
	}

	@Test
	public void testComplexidadeFuncionalDeSaidasConsultasExternasComplexo3() {
		for (int i = 4; i <= 1000; i++) {
			for (int j = 20; j <= 1000; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j);
				assertEquals(Complexidade.COMPLEXO,
						pontoDeFuncaoTransacional.complexidadeFuncionalDeSaidasConsultasExternas());
			}
		}
	}

	@Test
	public void testDefinePontoDeFuncaoDeEntradasExternasSimples1() {
		for (int i = 0; i <= 1; i++) {
			for (int j = 1; j <= 4; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j);
				assertEquals(3, pontoDeFuncaoTransacional.definePontoDeFuncaoDeEntradasExternas());
			}
		}
	}

	@Test
	public void testDefinePontoDeFuncaoDeEntradasExternasSimples2() {
		for (int i = 0; i <= 1; i++) {
			for (int j = 5; j <= 15; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j);
				assertEquals(3, pontoDeFuncaoTransacional.definePontoDeFuncaoDeEntradasExternas());
			}
		}
	}

	@Test
	public void testDefinePontoDeFuncaoDeEntradasExternasSimples3() {
		for (int i = 1; i <= 4; i++) {
			PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(2, i);
			assertEquals(3, pontoDeFuncaoTransacional.definePontoDeFuncaoDeEntradasExternas());
		}
	}

	@Test
	public void testDefinePontoDeFuncaoDeEntradasExternasMedio1() {
		for (int i = 0; i <= 1; i++) {
			for (int j = 16; j <= 1000; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j);
				assertEquals(4, pontoDeFuncaoTransacional.definePontoDeFuncaoDeEntradasExternas());
			}
		}
	}

	@Test
	public void testDefinePontoDeFuncaoDeEntradasExternasMedio2() {
		for (int j = 5; j <= 15; j++) {
			PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(2, j);
			assertEquals(4, pontoDeFuncaoTransacional.definePontoDeFuncaoDeEntradasExternas());
		}
	}

	@Test
	public void testDefinePontoDeFuncaoDeEntradasExternasMedio3() {
		for (int i = 3; i <= 1000; i++) {
			for (int j = 1; j <= 4; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j);
				assertEquals(4, pontoDeFuncaoTransacional.definePontoDeFuncaoDeEntradasExternas());
			}
		}
	}

	@Test
	public void testDefinePontoDeFuncaoDeEntradasExternasComplexo1() {
		for (int i = 16; i <= 1000; i++) {
			PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(2, i);
			assertEquals(6, pontoDeFuncaoTransacional.definePontoDeFuncaoDeEntradasExternas());
		}
	}

	@Test
	public void testDefinePontoDeFuncaoDeEntradasExternasComplexo2() {
		for (int i = 3; i <= 1000; i++) {
			for (int j = 5; j < 15; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j);
				assertEquals(6, pontoDeFuncaoTransacional.definePontoDeFuncaoDeEntradasExternas());
			}
		}
	}

	@Test
	public void testDefinePontoDeFuncaoDeEntradasExternasComplexo3() {
		for (int i = 3; i <= 1000; i++) {
			for (int j = 16; j <= 1000; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j);
				assertEquals(6, pontoDeFuncaoTransacional.definePontoDeFuncaoDeEntradasExternas());
			}
		}
	}

	@Test
	public void testDefinePontoDeFuncaoDeSaidasExternasSimples1() {
		for (int i = 0; i <= 1; i++) {
			for (int j = 1; j <= 5; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j);
				assertEquals(4, pontoDeFuncaoTransacional.definePontoDeFuncaoDeSaidasExternas());
			}
		}
	}

	@Test
	public void testDefinePontoDeFuncaoDeSaidasExternasSimples2() {
		for (int i = 0; i <= 1; i++) {
			for (int j = 6; j <= 19; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j);
				assertEquals(4, pontoDeFuncaoTransacional.definePontoDeFuncaoDeSaidasExternas());
			}
		}
	}

	@Test
	public void testDefinePontoDeFuncaoDeSaidasExternasSimples3() {
		for (int i = 2; i <= 3; i++) {
			for (int j = 1; j <= 5; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j);
				assertEquals(4, pontoDeFuncaoTransacional.definePontoDeFuncaoDeSaidasExternas());
			}
		}
	}

	@Test
	public void testDefinePontoDeFuncaoDeSaidasExternasMedio1() {
		for (int i = 0; i <= 1; i++) {
			for (int j = 20; j <= 1000; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j);
				assertEquals(5, pontoDeFuncaoTransacional.definePontoDeFuncaoDeSaidasExternas());
			}
		}
	}

	@Test
	public void testDefinePontoDeFuncaoDeSaidasExternasMedio2() {
		for (int i = 2; i <= 3; i++) {
			for (int j = 6; j <= 19; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j);
				assertEquals(5, pontoDeFuncaoTransacional.definePontoDeFuncaoDeSaidasExternas());
			}
		}
	}

	@Test
	public void testDefinePontoDeFuncaoDeSaidasExternasMedio3() {
		for (int i = 4; i <= 1000; i++) {
			for (int j = 1; j <= 5; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j);
				assertEquals(5, pontoDeFuncaoTransacional.definePontoDeFuncaoDeSaidasExternas());
			}
		}
	}

	@Test
	public void testDefinePontoDeFuncaoDeSaidasExternasComplexo1() {
		for (int i = 2; i <= 3; i++) {
			for (int j = 20; j <= 1000; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j);
				assertEquals(7, pontoDeFuncaoTransacional.definePontoDeFuncaoDeSaidasExternas());
			}
		}
	}

	@Test
	public void testDefinePontoDeFuncaoDeSaidasExternasComplexo2() {
		for (int i = 4; i <= 1000; i++) {
			for (int j = 6; j <= 19; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j);
				assertEquals(7, pontoDeFuncaoTransacional.definePontoDeFuncaoDeSaidasExternas());
			}
		}
	}

	@Test
	public void testDefinePontoDeFuncaoDeSaidasExternasComplexo3() {
		for (int i = 4; i <= 1000; i++) {
			for (int j = 20; j <= 1000; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j);
				assertEquals(7, pontoDeFuncaoTransacional.definePontoDeFuncaoDeSaidasExternas());
			}
		}
	}

	@Test
	public void testDefinePontoDeFuncaoDeConsultasExternasSimples1() {
		for (int i = 0; i <= 1; i++) {
			for (int j = 1; j <= 5; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j);
				assertEquals(3, pontoDeFuncaoTransacional.definePontoDeFuncaoDeConsultasExternas());
			}
		}
	}

	@Test
	public void testDefinePontoDeFuncaoDeConsultasExternasSimples2() {
		for (int i = 0; i <= 1; i++) {
			for (int j = 6; j <= 19; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j);
				assertEquals(3, pontoDeFuncaoTransacional.definePontoDeFuncaoDeConsultasExternas());
			}
		}
	}

	@Test
	public void testDefinePontoDeFuncaoDeConsultasExternasSimples3() {
		for (int i = 2; i <= 3; i++) {
			for (int j = 1; j <= 5; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j);
				assertEquals(3, pontoDeFuncaoTransacional.definePontoDeFuncaoDeConsultasExternas());
			}
		}
	}

	@Test
	public void testDefinePontoDeFuncaoDeConsultasExternasMedio1() {
		for (int i = 0; i <= 1; i++) {
			for (int j = 20; j <= 1000; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j);
				assertEquals(4, pontoDeFuncaoTransacional.definePontoDeFuncaoDeConsultasExternas());
			}
		}
	}

	@Test
	public void testDefinePontoDeFuncaoDeConsultasExternasMedio2() {
		for (int i = 2; i <= 3; i++) {
			for (int j = 6; j <= 19; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j);
				assertEquals(4, pontoDeFuncaoTransacional.definePontoDeFuncaoDeConsultasExternas());
			}
		}
	}

	@Test
	public void testDefinePontoDeFuncaoDeConsultasExternasMedio3() {
		for (int i = 4; i <= 1000; i++) {
			for (int j = 1; j <= 5; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j);
				assertEquals(4, pontoDeFuncaoTransacional.definePontoDeFuncaoDeConsultasExternas());
			}
		}
	}

	@Test
	public void testDefinePontoDeFuncaoDeConsultasExternasComplexo1() {
		for (int i = 2; i <= 3; i++) {
			for (int j = 20; j <= 1000; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j);
				assertEquals(6, pontoDeFuncaoTransacional.definePontoDeFuncaoDeConsultasExternas());
			}
		}
	}

	@Test
	public void testDefinePontoDeFuncaoDeConsultasExternasComplexo2() {
		for (int i = 4; i <= 1000; i++) {
			for (int j = 6; j <= 19; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j);
				assertEquals(6, pontoDeFuncaoTransacional.definePontoDeFuncaoDeConsultasExternas());
			}
		}
	}

	@Test
	public void testDefinePontoDeFuncaoDeConsultasExternasComplexo3() {
		for (int i = 4; i <= 1000; i++) {
			for (int j = 20; j <= 1000; j++) {
				PontoDeFuncaoTransacional pontoDeFuncaoTransacional = new PontoDeFuncaoTransacional(i, j);
				assertEquals(6, pontoDeFuncaoTransacional.definePontoDeFuncaoDeConsultasExternas());
			}
		}
	}
}
