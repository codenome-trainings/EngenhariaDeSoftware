package br.com.calculacusto.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.calculacusto.modelo.DadosFuncao;

public class DadosFuncaoDao {
	
	private static List<DadosFuncao> dadosFuncoes = new ArrayList<>();

	public void adicionaPF1(DadosFuncao dadosFuncao) {
		dadosFuncoes.add(dadosFuncao);
	}
	
	public List<DadosFuncao> getCarregaLista() {
		return this.dadosFuncoes;
	}
	
}
