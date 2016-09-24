package br.com.calculacusto.modelo;

import java.util.Vector;

public class AvaliacaoNit {
	
	private int nota;
	private Vector<Integer> notas = new Vector<>();
	
	public void adicionaNota (int nota) {
        notas.add(nota);
	}

	public void calculaNit() {
        for (Integer valor : notas) {
            this.nota += valor;
        }
    }
	
}
