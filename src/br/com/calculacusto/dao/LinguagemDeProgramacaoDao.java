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
		linguagens.add(new LinguagemDeProgramacao("cognos impromptu scripts", 47, 42, 30, 100));
		linguagens.add(new LinguagemDeProgramacao("cross system products", 20, 18, 10, 38));
		linguagens.add(new LinguagemDeProgramacao("coll gen ief", 32, 24, 10, 82));
		linguagens.add(new LinguagemDeProgramacao("datastage", 71, 65, 31, 157));
		linguagens.add(new LinguagemDeProgramacao("excel", 209, 191, 131, 315));
		linguagens.add(new LinguagemDeProgramacao("focus", 43, 45, 45, 45));
		linguagens.add(new LinguagemDeProgramacao("foxpro", 36, 35, 34, 38));
		linguagens.add(new LinguagemDeProgramacao("html", 34, 40, 14, 48));
		linguagens.add(new LinguagemDeProgramacao("j2ee", 46, 49, 15, 67));
		linguagens.add(new LinguagemDeProgramacao("java", 53, 53, 14, 134));
		linguagens.add(new LinguagemDeProgramacao("javascript", 47, 53, 31, 63));
		linguagens.add(new LinguagemDeProgramacao("jcl", 62, 48, 25, 221));
		linguagens.add(new LinguagemDeProgramacao("lincii", 29, 30, 22, 38));
		linguagens.add(new LinguagemDeProgramacao("lotusnotes", 23, 21, 19, 40));
		linguagens.add(new LinguagemDeProgramacao("natural", 40, 34, 34, 53));
		linguagens.add(new LinguagemDeProgramacao("net", 57, 60, 53, 60));
		linguagens.add(new LinguagemDeProgramacao("oracle", 37, 40, 17, 60));
		linguagens.add(new LinguagemDeProgramacao("pacbase", 35, 32, 22, 60));
		linguagens.add(new LinguagemDeProgramacao("perl", 24, 15, 15, 60));
		linguagens.add(new LinguagemDeProgramacao("pl1", 64, 80, 16, 80));
		linguagens.add(new LinguagemDeProgramacao("plsql", 37, 35, 13, 60));
		linguagens.add(new LinguagemDeProgramacao("powerbuilder", 26, 28, 7, 40));
		linguagens.add(new LinguagemDeProgramacao("rexx", 77, 80, 50, 80));
		linguagens.add(new LinguagemDeProgramacao("sabretalk", 70, 66, 45, 109));
		linguagens.add(new LinguagemDeProgramacao("sas", 38, 37, 22, 55));
		linguagens.add(new LinguagemDeProgramacao("siebel", 59, 60, 51, 60));
		linguagens.add(new LinguagemDeProgramacao("slogan", 75, 75, 74, 75));
		linguagens.add(new LinguagemDeProgramacao("sql", 21, 21, 13, 37));
		linguagens.add(new LinguagemDeProgramacao("vbnet", 52, 60, 26, 60));
		linguagens.add(new LinguagemDeProgramacao("visualbasic", 42, 44, 20, 60));
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
