package br.com.calculacusto.modelo.main;

import br.com.calculacusto.dao.LinguagemDeProgramacaoDao;
import br.com.calculacusto.modelo.LinguagemDeProgramacao;

public class Main {

	public static void main(String[] args) {

		LinguagemDeProgramacaoDao linguagemDao = new LinguagemDeProgramacaoDao();
		
		LinguagemDeProgramacao linguagem = linguagemDao.buscaPorNome("asp");
		
		System.out.println(linguagem.getMedia());
		
	}

}
