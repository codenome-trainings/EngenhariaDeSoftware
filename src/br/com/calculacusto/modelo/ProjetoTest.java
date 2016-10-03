package br.com.calculacusto.modelo;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ProjetoTest {
	
	Projeto projeto;
	PontoDeFuncaoNaoAjustado pontoDeFuncaoNaoAjustado;
	
	@Before
	public void setUp() throws Exception {		
		projeto = new Projeto("Estimativa de custo", "Java", MedidaDaLinguagem.MEDIA, 42.0);
		
		//Analisando classes
		projeto.getPontoDeFuncaoNaoAjustado().adicionaPontoDeFuncaoDeDados(new PontoDeFuncaoDeDados("Projeto", 11, 41, TipoDado.INTERNO));
		projeto.getPontoDeFuncaoNaoAjustado().adicionaPontoDeFuncaoDeDados(new PontoDeFuncaoDeDados("AvalicaoNit", 2, 2, TipoDado.INTERNO));
		projeto.getPontoDeFuncaoNaoAjustado().adicionaPontoDeFuncaoDeDados(new PontoDeFuncaoDeDados("Nit", 1, 1, TipoDado.INTERNO));
		projeto.getPontoDeFuncaoNaoAjustado().adicionaPontoDeFuncaoDeDados(new PontoDeFuncaoDeDados("LinguagemDeProgramacao", 1, 5, TipoDado.INTERNO));
		projeto.getPontoDeFuncaoNaoAjustado().adicionaPontoDeFuncaoDeDados(new PontoDeFuncaoDeDados("PontoDeFuncaoNaoAjustado", 3, 13, TipoDado.INTERNO));
		projeto.getPontoDeFuncaoNaoAjustado().adicionaPontoDeFuncaoDeDados(new PontoDeFuncaoDeDados("PontoDeFuncaoDeDados", 3, 11, TipoDado.INTERNO));
		projeto.getPontoDeFuncaoNaoAjustado().adicionaPontoDeFuncaoDeDados(new PontoDeFuncaoDeDados("PontoDeFuncaoTransacional", 3, 12, TipoDado.INTERNO));
		projeto.getPontoDeFuncaoNaoAjustado().adicionaPontoDeFuncaoDeDados(new PontoDeFuncaoDeDados("MedidaDaLinguagem", 1, 4, TipoDado.INTERNO));
		projeto.getPontoDeFuncaoNaoAjustado().adicionaPontoDeFuncaoDeDados(new PontoDeFuncaoDeDados("TipoDado", 1, 2, TipoDado.INTERNO));
		projeto.getPontoDeFuncaoNaoAjustado().adicionaPontoDeFuncaoDeDados(new PontoDeFuncaoDeDados("TipoFuncao", 1, 3, TipoDado.INTERNO));
		projeto.getPontoDeFuncaoNaoAjustado().adicionaPontoDeFuncaoDeDados(new PontoDeFuncaoDeDados("Complexidade", 1, 3, TipoDado.INTERNO));
		
		//Analisando Casos
		projeto.getPontoDeFuncaoNaoAjustado().adicionaPontoDeFuncaoTransacional(new PontoDeFuncaoTransacional("ConfiguraProjeto", 2, 13, TipoFuncao.ENTRADA));
		projeto.getPontoDeFuncaoNaoAjustado().adicionaPontoDeFuncaoTransacional(new PontoDeFuncaoTransacional("AvaliaNit", 2, 2, TipoFuncao.ENTRADA));
		projeto.getPontoDeFuncaoNaoAjustado().adicionaPontoDeFuncaoTransacional(new PontoDeFuncaoTransacional("AdicionaFuncaoDeDados", 4, 12, TipoFuncao.ENTRADA));
		projeto.getPontoDeFuncaoNaoAjustado().adicionaPontoDeFuncaoTransacional(new PontoDeFuncaoTransacional("AdicionaFuncoesTransacionais", 4, 3, TipoFuncao.ENTRADA));
		projeto.getPontoDeFuncaoNaoAjustado().adicionaPontoDeFuncaoTransacional(new PontoDeFuncaoTransacional("MostraRelatorio", 11, 41, TipoFuncao.SAIDA));
		
		
	}
	
	// Não é necessário alguns Getters and Setters como nome,
	// para testes em muitas das vezes. Mas coloquei pois seu uso na interface será validado desde aqui.
	@Test
	public void testGetNome() {
		assertEquals("Estimativa de custo", projeto.getNome());
	}
	
	@Test
	public void testGetMedidaDaLinguagem() {
		assertEquals(MedidaDaLinguagem.MEDIA, projeto.getMedidaDaLinguagem());
	}
	
	@Test
	public void testGetNomeDaLinguagem() {
		assertEquals("java", projeto.getNomeDaLinguagem());
	}
	
	@Test
	public void testGetNit() {
		assertEquals(42.0, projeto.getNit(), 0.0001);
	}
	
	@Test
	public void testGetFatorDeAjuste() {
		assertEquals(1.07, projeto.getFatorDeAjuste(), 0.0001);
	}
	
	@Test
	public void testPontoDeFuncaoNaoAjustado() {
		//Ponto de Função Bruta
		assertEquals(109, projeto.getPontoDeFuncaoNaoAjustado().valor());
	}
	
	@Test
	public void testPontoDeFuncao() {
		assertEquals(116.63, projeto.getPontoDeFuncao(), 0.0001);
	}
	
	@Test
	public void testValorDaLinguagem() {
		assertEquals(53, projeto.valorDaLinguagem(), 0.0001);
	}
	
	//Teste do número de linhas
	@Test
	public void testKaloc() {
		assertEquals(6.18139, projeto.kaloc(), 0.0001);
	}
	
	@Test
	public void testGetEsforco() {
		assertEquals(16.2499, projeto.getEsforco(), 0.0001);
	}
	
	//Em Semanas
	@Test
	public void testGetTempo() {
		assertEquals(17.8323, projeto.getTempo(), 0.0001);
	}
	
	@Test
	public void testGetPessoas() {
		assertEquals(0.9112, projeto.getPessoa(), 0.0001);
	}

}
