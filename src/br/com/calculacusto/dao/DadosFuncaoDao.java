package br.com.calculacusto.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.calculacusto.modelo.DadosFuncao;
import br.com.calculacusto.modelo.LinguagemDeProgramacao;

public class DadosFuncaoDao {
	
	private static List<DadosFuncao> dadosfuncoes = new ArrayList<>();

	public void adicionaPF1(DadosFuncao dadosFuncao) {
		dadosfuncoes.add(dadosFuncao);
	}
	
	public void carregaListaPF1() {
		for (DadosFuncao dadosFuncao : dadosfuncoes) {
			System.out.println("Nome da Classe: " + dadosFuncao.getNome());
			System.out.println("Classificação: " + dadosFuncao.getItens());
			System.out.println("Ponto de Função: " + dadosFuncao.getPontoDeFuncao());
		}
	}
	
}
