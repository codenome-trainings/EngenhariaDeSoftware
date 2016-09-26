package br.com.calculacusto.modelo;

import java.util.ArrayList;
import java.util.List;

public class Projeto {

	private String nome;
	private int pontoDeFuncao;
	private double fatorDeAjuste;
	private int nit;
	private double qsm;
	private double esforco;
	private double tempo;
	private double pessoa;
	private double hh;
	private double custo;
	private double valorDeVenda;
	private double lucro;
	
	private LinguagemDeProgramacao linguagemDeProgramacao;
	private List<AvaliacaoNit> avaliacoesNit = new ArrayList<>();
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPontoDeFuncao() {
		return pontoDeFuncao;
	}

	public void setPontoDeFuncao(int pontoDeFuncao) {
		this.pontoDeFuncao = pontoDeFuncao;
	}

	public double getFatorDeAjuste() {
		return fatorDeAjuste;
	}

	public void setFatorDeAjuste(double fatorDeAjuste) {
		this.fatorDeAjuste = fatorDeAjuste;
	}

	public int getNit() {
		return nit;
	}

	public void setNit(int nit) {
		this.nit = nit;
	}

	public double getQsm() {
		return qsm;
	}

	public void setQsm(double qsm) {
		this.qsm = qsm;
	}

	public double getEsforco() {
		return esforco;
	}

	public void setEsforco(double esforco) {
		this.esforco = esforco;
	}

	public double getTempo() {
		return tempo;
	}

	public void setTempo(double tempo) {
		this.tempo = tempo;
	}

	public double getPessoa() {
		return pessoa;
	}

	public void setPessoa(double pessoa) {
		this.pessoa = pessoa;
	}

	public double getHh() {
		return hh;
	}

	public void setHh(double hh) {
		this.hh = hh;
	}

	public double getCusto() {
		return custo;
	}

	public void setCusto(double custo) {
		this.custo = custo;
	}

	public double getValorDeVenda() {
		return valorDeVenda;
	}

	public void setValorDeVenda(double valorDeVenda) {
		this.valorDeVenda = valorDeVenda;
	}

	public double getLucro() {
		return lucro;
	}

	public void setLucro(double lucro) {
		this.lucro = lucro;
	}

	public LinguagemDeProgramacao getLinguagemDeProgramacao() {
		return linguagemDeProgramacao;
	}

	public void setLinguagemDeProgramacao(LinguagemDeProgramacao linguagemDeProgramacao) {
		this.linguagemDeProgramacao = linguagemDeProgramacao;
	}
	

}
