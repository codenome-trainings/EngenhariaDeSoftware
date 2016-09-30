package br.com.calculacusto.dao;

import java.util.ArrayList;
import java.util.List;

public class PontoDeFuncaoDeDadosDao {
	
	private static List<PontoDeFuncaoDeDados> pontosDeFuncoesDeDados = new ArrayList<>();
	
	public void adiciona(PontoDeFuncaoDeDados pontoDeFuncaoDeDados) {
		pontosDeFuncoesDeDados.add(pontoDeFuncaoDeDados);
	}
	
	public List<PontoDeFuncaoDeDados> listaTodos() {
		return pontosDeFuncoesDeDados;
	}
	
}
