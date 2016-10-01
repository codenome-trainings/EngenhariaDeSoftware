package br.com.calculacusto.modelo.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.calculacusto.dao.LinguagemDeProgramacaoDao;
import br.com.calculacusto.modelo.LinguagemDeProgramacao;

public class TestaLinguagemDeProgramacao {

	LinguagemDeProgramacao linguagem;
	LinguagemDeProgramacaoDao linguagemDao;
	
	@Before
	public void setUp() throws Exception {
		linguagemDao = new LinguagemDeProgramacaoDao();
		linguagem = linguagemDao.buscaPorNome("asp");
	}

	@Test
	public void testBuscaPorNome() {		
		assertEquals("asp", linguagem.getNome());
	}
	
	@Test
	public void testBuscaPorMedia() {
		assertEquals(51, linguagem.getMedia(), 0.0001);
	}
	
	@Test
	public void testBuscaPorMediana() {
		assertEquals(54.0, linguagem.getMediana(), 0.0001);
	}
	
	@Test
	public void testBuscaPorMenor() {
		assertEquals(15, linguagem.getMenor(), 0.0001);
	}

	@Test
	public void testBuscaPorMaior() {
		assertEquals(69, linguagem.getMaior(), 0.0001);
	}

}
