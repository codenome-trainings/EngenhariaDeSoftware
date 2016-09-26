package br.com.calculacusto.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.calculacusto.modelo.LinguagemDeProgramacao;

public class LinguagemDeProgramacaoDao {
	
	private static List<LinguagemDeProgramacao> linguagensDeProgramacao = carregaLista();
	
	private static List<LinguagemDeProgramacao> carregaLista() {
		List<LinguagemDeProgramacao> linguagens = new ArrayList<>();
		linguagens.add(new LinguagemDeProgramacao("sap", 28, 18, 16, 60));
		linguagens.add(new LinguagemDeProgramacao("asp", 51, 54, 15, 69));
		return linguagens;
	}
	
	public LinguagemDeProgramacao buscaPorNome(String nome) {
		for (LinguagemDeProgramacao linguagemDeProgramacao : linguagensDeProgramacao) {
			if (linguagemDeProgramacao.getNome().equals(nome)) {
				return linguagemDeProgramacao;
			}
		}
		return null;
	}
	
	public void adiciona(LinguagemDeProgramacao linguagemDeProgramacao) {
		linguagensDeProgramacao.add(linguagemDeProgramacao);
	}
	
}
