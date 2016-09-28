package br.com.calculacusto.modelo.main;

import br.com.calculacusto.dao.LinguagemDeProgramacaoDao;
import br.com.calculacusto.dao.NitDao;
import br.com.calculacusto.modelo.LinguagemDeProgramacao;
import br.com.calculacusto.modelo.Nit;

public class Main {

	public static void main(String[] args) {
		
		//Conexão simulada com o Banco de Dados
		LinguagemDeProgramacaoDao linguagemDao = new LinguagemDeProgramacaoDao();
		LinguagemDeProgramacao linguagem = linguagemDao.buscaPorNome("asp");
		
		
		System.out.println(linguagem.getMedia());
		
		
		NitDao nitDao = new NitDao();
		Nit nit = nitDao.buscaPorNome("Comunicação de Dados");
		
		System.out.println(nit.getNome());
		
	}

}
