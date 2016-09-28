package br.com.calculacusto.modelo;

import java.util.ArrayList;
import java.util.List;

public class Projeto {

	private String nome;
	private double pontoDeFuncao;
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
	
	/*
	 * Cosntantes essenciais para o cocomo
	 */
	private final double AB = 2.4;
	private final double BB = 1.05;
	private final double DB = 0.38;
	
	/*
	 * Impostos para calculo de venda
	 */
	private final double IMPOSTO = 45;
	private final double SEGURANCA = 20;
	
	private LinguagemDeProgramacao linguagemDeProgramacao;
	private List<AvaliacaoNit> avaliacoesNit = new ArrayList<>();
	
	//Preciso ainda implementar a busca da soma dos valores pf1 e pf2
	public double calculaPontoDeFuncaoBruta() {
		double pf1 = 0, pf2 = 0;
		return pf1 + pf2;
	}
	
	public double kaloc() {
		return getPontoDeFuncao() * this.linguagemDeProgramacao.getMediana(); //Por exemplo!!!
	}
	
	public double calculaHoraHomem() {
		return (this.hh * (getTempo() * 8));
	}
	
	public double calculaImpostoSobreHoraHomem() {
		return (calculaHoraHomem() / 100) * this.IMPOSTO;
	}
	
	public double calculaSegurancaSobreImposto() {
		return (calculaHoraHomem() / 100) * this.SEGURANCA;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPontoDeFuncao() {
		return calculaPontoDeFuncaoBruta() * getFatorDeAjuste();
	}

	public void setPontoDeFuncao(int pontoDeFuncao) {
		this.pontoDeFuncao = pontoDeFuncao;
	}

	public double getFatorDeAjuste() {
		return ((getNit() * 0.01) + 0.65);
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
		return this.AB * Math.pow(kaloc(), this.BB);
	}

	public double getTempo() {
		return kaloc() * Math.pow(getEsforco(), this.DB);
	}

	public double getPessoa() {
		return getEsforco() / getTempo();
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
		return calculaHoraHomem() + calculaImpostoSobreHoraHomem() + this.calculaSegurancaSobreImposto();
	}

	public void setValorDeVenda(double valorDeVenda) {
		this.valorDeVenda = valorDeVenda;
	}

	public double getLucro() {
		return (getValorDeVenda() - calculaHoraHomem());
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
