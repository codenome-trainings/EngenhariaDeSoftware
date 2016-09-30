package br.com.calculacusto.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.calculacusto.modelo.PontoDeFuncaoTransacional;

public class PontoDeFuncaoTransacionalDao {
	
private static List<PontoDeFuncaoTransacional> pontosDeFuncoesTransacionais = new ArrayList<>();
	
	public void adiciona(PontoDeFuncaoTransacional pontoDeFuncaoTransacional) {
		pontosDeFuncoesTransacionais.add(pontoDeFuncaoTransacional);
	}
	
	public List<PontoDeFuncaoTransacional> listaTodos() {
		return pontosDeFuncoesTransacionais;
	}
	
}
