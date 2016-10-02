package br.com.calculacusto.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.calculacusto.modelo.AvaliacaoNit;
import br.com.calculacusto.modelo.Nit;

public class AvaliacaoNitDao {
	
	private static List<AvaliacaoNit> avaliacoesNit = new ArrayList<>();
	
	public void adiciona(AvaliacaoNit avaliacaoNit) {
		avaliacoesNit.add(avaliacaoNit);
	}
	
	public double somaNota() {
		double total = 0;
		for (AvaliacaoNit nota : avaliacoesNit) {
			total += nota.getNota();
		}
		return total;
	}
	
}
