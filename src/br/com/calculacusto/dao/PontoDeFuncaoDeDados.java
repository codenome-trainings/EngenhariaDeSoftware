package br.com.calculacusto.dao;

import br.com.calculacusto.modelo.Complexidade;
import br.com.calculacusto.modelo.TipoDado;

public class PontoDeFuncaoDeDados {
	
	private String nomeDaClasse;
	private int numeroDeRegistrosLogicos;
	private int numeroDeItensDeDadosReferenciados;
	private TipoDado tipoDado;
	
	public Complexidade complexidadeFuncional() {
		//Fazer Calculo de complexidade
		return null;
	}
	
	public int valorDoPontoDeFuncao() {
		return 0;
	}

	public String getNomeDaClasse() {
		return nomeDaClasse;
	}

	public void setNomeDaClasse(String nomeDaClasse) {
		this.nomeDaClasse = nomeDaClasse;
	}

	public int getNumeroDeRegistrosLogicos() {
		return numeroDeRegistrosLogicos;
	}

	public void setNumeroDeRegistrosLogicos(int numeroDeRegistrosLogicos) {
		this.numeroDeRegistrosLogicos = numeroDeRegistrosLogicos;
	}

	public int getNumeroDeItensDeDadosReferenciados() {
		return numeroDeItensDeDadosReferenciados;
	}

	public void setNumeroDeItensDeDadosReferenciados(int numeroDeItensDeDadosReferenciados) {
		this.numeroDeItensDeDadosReferenciados = numeroDeItensDeDadosReferenciados;
	}

	public TipoDado getTipoDado() {
		return tipoDado;
	}

	public void setTipoDado(TipoDado tipoDado) {
		this.tipoDado = tipoDado;
	}

}
