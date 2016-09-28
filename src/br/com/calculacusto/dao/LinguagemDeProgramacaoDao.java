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
		linguagens.add(new LinguagemDeProgramacao("assembler", 110, 98, 25, 320));
		linguagens.add(new LinguagemDeProgramacao("brio", 14, 14, 13, 16));
		linguagens.add(new LinguagemDeProgramacao("c", 97, 99, 39, 333));
		linguagens.add(new LinguagemDeProgramacao("cpp", 50, 53, 25, 80));
		linguagens.add(new LinguagemDeProgramacao("csharp", 54, 59, 29, 70));
		linguagens.add(new LinguagemDeProgramacao("cobol", 61, 55, 23, 297));
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
