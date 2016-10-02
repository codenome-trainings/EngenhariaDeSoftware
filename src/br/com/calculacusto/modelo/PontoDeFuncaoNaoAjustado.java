package br.com.calculacusto.modelo;

import java.util.ArrayList;
import java.util.List;

public class PontoDeFuncaoNaoAjustado {
	
	private List<PontoDeFuncaoDeDados> pontosDeFuncoesDeDados = new ArrayList<>();
	private List<PontoDeFuncaoTransacional> pontosDeFuncoesTransacionais = new ArrayList<>();
	
	/*
	 * A função valor me retorna o total dos 2 pontos de Função
	 * SERIA O PFB
	 */
	public int valor() {
		
		int totalPontoDeFuncao = 0;
		
		for (PontoDeFuncaoDeDados pontoDeFuncaoDeDados : pontosDeFuncoesDeDados) {
			totalPontoDeFuncao += pontoDeFuncaoDeDados.valorDoPontoDeFuncao();
		}
		
		for (PontoDeFuncaoTransacional pontoDeFuncaoTransacional : getPontosDeFuncoesTransacionais()) {
			totalPontoDeFuncao += pontoDeFuncaoTransacional.valorDoPontoDeFuncao();
		}
		
		return totalPontoDeFuncao;
	}

	public List<PontoDeFuncaoDeDados> getPontosDeFuncoesDeDados() {
		return pontosDeFuncoesDeDados;
	}

	public void setPontosDeFuncoesDeDados(List<PontoDeFuncaoDeDados> pontosDeFuncoesDeDados) {
		this.pontosDeFuncoesDeDados = pontosDeFuncoesDeDados;
	}

	public List<PontoDeFuncaoTransacional> getPontosDeFuncoesTransacionais() {
		return pontosDeFuncoesTransacionais;
	}

	public void setPontosDeFuncoesTransacionais(List<PontoDeFuncaoTransacional> pontosDeFuncoesTransacionais) {
		this.pontosDeFuncoesTransacionais = pontosDeFuncoesTransacionais;
	}
	
	
}
