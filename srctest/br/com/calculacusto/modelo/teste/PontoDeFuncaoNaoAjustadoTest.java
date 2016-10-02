package br.com.calculacusto.modelo.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.calculacusto.modelo.PontoDeFuncaoDeDados;
import br.com.calculacusto.modelo.PontoDeFuncaoNaoAjustado;
import br.com.calculacusto.modelo.PontoDeFuncaoTransacional;
import br.com.calculacusto.modelo.TipoDado;
import br.com.calculacusto.modelo.TipoFuncao;

public class PontoDeFuncaoNaoAjustadoTest {

	
	PontoDeFuncaoNaoAjustado pontoDeFuncaoNaoAjustado;
	@Before
	public void setUp() throws Exception {		
		pontoDeFuncaoNaoAjustado = new PontoDeFuncaoNaoAjustado();
	}

	@Test
	public void testValorFuncaoDeDadosInterno() {	
		pontoDeFuncaoNaoAjustado.getPontosDeFuncoesDeDados().add(new PontoDeFuncaoDeDados("Soma", 1, 15, TipoDado.INTERNO));
		pontoDeFuncaoNaoAjustado.getPontosDeFuncoesDeDados().add(new PontoDeFuncaoDeDados("Multiplicacao", 3, 30, TipoDado.INTERNO));
		pontoDeFuncaoNaoAjustado.getPontosDeFuncoesDeDados().add(new PontoDeFuncaoDeDados("Divisao", 6, 55, TipoDado.INTERNO));
		assertEquals(32, pontoDeFuncaoNaoAjustado.valor());
	}
	
	@Test
	public void testValorFuncaoDeDadosExterno() {
		pontoDeFuncaoNaoAjustado.getPontosDeFuncoesDeDados().add(new PontoDeFuncaoDeDados("Soma", 1, 15, TipoDado.EXTERNO));
		pontoDeFuncaoNaoAjustado.getPontosDeFuncoesDeDados().add(new PontoDeFuncaoDeDados("Multiplicacao", 3, 30, TipoDado.EXTERNO));
		pontoDeFuncaoNaoAjustado.getPontosDeFuncoesDeDados().add(new PontoDeFuncaoDeDados("Divisao", 6, 55, TipoDado.EXTERNO));
		assertEquals(22, pontoDeFuncaoNaoAjustado.valor());
	}
	
	@Test
	public void testValorFuncaoTransacionalDeEntradas() {
		pontoDeFuncaoNaoAjustado.getPontosDeFuncoesTransacionais().add(new PontoDeFuncaoTransacional("MostraTela", 0, 15, TipoFuncao.ENTRADA));
		pontoDeFuncaoNaoAjustado.getPontosDeFuncoesTransacionais().add(new PontoDeFuncaoTransacional("DesligaTela", 0, 20, TipoFuncao.ENTRADA));
		pontoDeFuncaoNaoAjustado.getPontosDeFuncoesTransacionais().add(new PontoDeFuncaoTransacional("Mode", 4, 20, TipoFuncao.ENTRADA));
		assertEquals(13, pontoDeFuncaoNaoAjustado.valor());
	}
	
	@Test
	public void testValorFuncaoTransacionalDeSaidas() {
		pontoDeFuncaoNaoAjustado.getPontosDeFuncoesTransacionais().add(new PontoDeFuncaoTransacional("MostraTela", 0, 15, TipoFuncao.SAIDA));
		pontoDeFuncaoNaoAjustado.getPontosDeFuncoesTransacionais().add(new PontoDeFuncaoTransacional("DesligaTela", 0, 20, TipoFuncao.SAIDA));
		pontoDeFuncaoNaoAjustado.getPontosDeFuncoesTransacionais().add(new PontoDeFuncaoTransacional("Mode", 4, 20, TipoFuncao.SAIDA));
		assertEquals(16, pontoDeFuncaoNaoAjustado.valor());
	}
	
	@Test
	public void testValorFuncaoTransacionalDeConsultas() {
		pontoDeFuncaoNaoAjustado.getPontosDeFuncoesTransacionais().add(new PontoDeFuncaoTransacional("MostraTela", 0, 15, TipoFuncao.CONSULTA));
		pontoDeFuncaoNaoAjustado.getPontosDeFuncoesTransacionais().add(new PontoDeFuncaoTransacional("DesligaTela", 0, 20, TipoFuncao.CONSULTA));
		pontoDeFuncaoNaoAjustado.getPontosDeFuncoesTransacionais().add(new PontoDeFuncaoTransacional("Mode", 4, 20, TipoFuncao.CONSULTA));
		assertEquals(13, pontoDeFuncaoNaoAjustado.valor());
	}
	
	@Test
	public void testValor() {
		pontoDeFuncaoNaoAjustado.getPontosDeFuncoesDeDados().add(new PontoDeFuncaoDeDados("Soma", 1, 15, TipoDado.INTERNO));
		pontoDeFuncaoNaoAjustado.getPontosDeFuncoesDeDados().add(new PontoDeFuncaoDeDados("Multiplicacao", 3, 30, TipoDado.INTERNO));
		pontoDeFuncaoNaoAjustado.getPontosDeFuncoesDeDados().add(new PontoDeFuncaoDeDados("Divisao", 6, 55, TipoDado.INTERNO));
		pontoDeFuncaoNaoAjustado.getPontosDeFuncoesDeDados().add(new PontoDeFuncaoDeDados("Soma", 1, 15, TipoDado.EXTERNO));
		pontoDeFuncaoNaoAjustado.getPontosDeFuncoesDeDados().add(new PontoDeFuncaoDeDados("Multiplicacao", 3, 30, TipoDado.EXTERNO));
		pontoDeFuncaoNaoAjustado.getPontosDeFuncoesDeDados().add(new PontoDeFuncaoDeDados("Divisao", 6, 55, TipoDado.EXTERNO));
		pontoDeFuncaoNaoAjustado.getPontosDeFuncoesTransacionais().add(new PontoDeFuncaoTransacional("MostraTela", 0, 15, TipoFuncao.ENTRADA));
		pontoDeFuncaoNaoAjustado.getPontosDeFuncoesTransacionais().add(new PontoDeFuncaoTransacional("DesligaTela", 0, 20, TipoFuncao.ENTRADA));
		pontoDeFuncaoNaoAjustado.getPontosDeFuncoesTransacionais().add(new PontoDeFuncaoTransacional("Mode", 4, 20, TipoFuncao.ENTRADA));
		pontoDeFuncaoNaoAjustado.getPontosDeFuncoesTransacionais().add(new PontoDeFuncaoTransacional("MostraTela", 0, 15, TipoFuncao.SAIDA));
		pontoDeFuncaoNaoAjustado.getPontosDeFuncoesTransacionais().add(new PontoDeFuncaoTransacional("DesligaTela", 0, 20, TipoFuncao.SAIDA));
		pontoDeFuncaoNaoAjustado.getPontosDeFuncoesTransacionais().add(new PontoDeFuncaoTransacional("Mode", 4, 20, TipoFuncao.SAIDA));
		pontoDeFuncaoNaoAjustado.getPontosDeFuncoesTransacionais().add(new PontoDeFuncaoTransacional("MostraTela", 0, 15, TipoFuncao.CONSULTA));
		pontoDeFuncaoNaoAjustado.getPontosDeFuncoesTransacionais().add(new PontoDeFuncaoTransacional("DesligaTela", 0, 20, TipoFuncao.CONSULTA));
		pontoDeFuncaoNaoAjustado.getPontosDeFuncoesTransacionais().add(new PontoDeFuncaoTransacional("Mode", 4, 20, TipoFuncao.CONSULTA));
		assertEquals(96, pontoDeFuncaoNaoAjustado.valor());
	}
	
}
