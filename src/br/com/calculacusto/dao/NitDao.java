package br.com.calculacusto.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.calculacusto.modelo.Nit;

public class NitDao {
	
private static List<Nit> nits = carregaLista();
	
	private static List<Nit> carregaLista() {
		List<Nit> nits = new ArrayList<>();
		nits.add(new Nit("Comunicação de Dados"));
		nits.add(new Nit("Processamento de Dados Distribuído"));
		nits.add(new Nit("Utilização do Equipamento"));
		nits.add(new Nit("Volume de Transações"));
		nits.add(new Nit("Entrada de Dados On-line"));
		nits.add(new Nit("Eficiência do Usuário Final"));
		nits.add(new Nit("Atualização online"));
		nits.add(new Nit("Processamento Complexo"));
		nits.add(new Nit("Reusabilidade"));
		nits.add(new Nit("Facilidade de Implantação"));
		nits.add(new Nit("Facilidade Operacional"));
		nits.add(new Nit("Múltiplos Locais e Organizações do Usuário"));
		nits.add(new Nit("Facilidade de Mudanças"));
		
		return nits;
	}
	
	public Nit buscaPorNome(String nome) {
		for (Nit nit : nits) {
			if (nit.getNome().equals(nome)) {
				return nit;
			}
		}
		return null;
	}
	
	public void adiciona(Nit nit) {
		nits.add(nit);
	}
	
}
