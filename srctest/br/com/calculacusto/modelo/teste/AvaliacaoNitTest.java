package br.com.calculacusto.modelo.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.calculacusto.dao.AvaliacaoNitDao;
import br.com.calculacusto.dao.NitDao;
import br.com.calculacusto.modelo.AvaliacaoNit;
import br.com.calculacusto.modelo.Nit;

public class AvaliacaoNitTest {

	AvaliacaoNitDao avaliacaoNitDao;
	AvaliacaoNit avaliacaoNit;

	@Before
	public void setUp() throws Exception {
		avaliacaoNitDao = new AvaliacaoNitDao();
		avaliacaoNit = new AvaliacaoNit();
	}
	/*
	 * 
	 * Usei esta avaliador para simular as notas aleatorias em loops crescentes de 1 - 5;
	 * 
	 */
	@Test
	public void testAvaliacaoNitInt() {
		
		
		
		for (int i = 0; i < 5; i++) {
			avaliacaoNitDao.adiciona(new AvaliacaoNit(i));
		}
		for (int i = 0; i < 5; i++) {
			avaliacaoNitDao.adiciona(new AvaliacaoNit(i));
		}
		for (int i = 0; i < 4; i++) {
			avaliacaoNitDao.adiciona(new AvaliacaoNit(i));
		}
		assertEquals(26.0, avaliacaoNitDao.somaNota(), 0.0001);
	}
	
}
