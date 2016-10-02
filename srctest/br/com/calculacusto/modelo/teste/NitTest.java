package br.com.calculacusto.modelo.teste;

import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import br.com.calculacusto.dao.NitDao;
import br.com.calculacusto.modelo.Nit;

public class NitTest {
	
	NitDao nits;
	
	@Before
	public void setUp() throws Exception {
		nits = new NitDao();
	}

	@Test
	public void testNitString() {
		Nit nit = nits.buscaPorNome("Comunicação de Dados");
		
	}

	@Test
	public void testNit() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetNome() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetNome() {
		fail("Not yet implemented");
	}

}
