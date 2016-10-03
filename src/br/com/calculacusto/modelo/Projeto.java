package br.com.calculacusto.modelo;

import java.util.ArrayList;
import java.util.List;

import br.com.calculacusto.dao.AvaliacaoNitDao;
import br.com.calculacusto.dao.LinguagemDeProgramacaoDao;

public class Projeto {

	private String nome;
	private String nomeDaLinguagem;
	private MedidaDaLinguagem medidaDaLinguagem;
	private double nit;
	private double fatorDeAjuste;
	private double pontoDeFuncao;
	private double esforco;
	private double tempo;
	private double pessoa;

	private PontoDeFuncaoNaoAjustado pontoDeFuncaoNaoAjustado = new PontoDeFuncaoNaoAjustado();	
	private AvaliacaoNit avaliacaoNit = new AvaliacaoNit();
	private LinguagemDeProgramacao linguagemDeProgramacao;

	public Projeto(String nome, String nomeDaLinguagem, MedidaDaLinguagem medidaDaLinguagem, double nit) {
		this.nome = nome;
		this.nomeDaLinguagem = nomeDaLinguagem.toLowerCase();
		this.medidaDaLinguagem = medidaDaLinguagem;
		this.nit = nit;
		this.pontoDeFuncaoNaoAjustado = pontoDeFuncaoNaoAjustado;
	}

	public Projeto() {

	}

	public double kaloc() {
		return (getPontoDeFuncao() * valorDaLinguagem()) / 1000;
	}

	public double valorDaLinguagem() {

		LinguagemDeProgramacaoDao linguagemDeProgramacaoDao = new LinguagemDeProgramacaoDao();

		if (this.medidaDaLinguagem == MedidaDaLinguagem.MEDIA) {
			return linguagemDeProgramacaoDao.buscaPorNome(this.nomeDaLinguagem).getMedia();
		}

		if (this.medidaDaLinguagem == MedidaDaLinguagem.MEDIANA) {
			return linguagemDeProgramacaoDao.buscaPorNome(this.nomeDaLinguagem).getMediana();
		}

		if (this.medidaDaLinguagem == MedidaDaLinguagem.MENOR) {
			return linguagemDeProgramacaoDao.buscaPorNome(this.nomeDaLinguagem).getMenor();
		}

		if (this.medidaDaLinguagem == MedidaDaLinguagem.MAIOR) {
			return linguagemDeProgramacaoDao.buscaPorNome(this.nomeDaLinguagem).getMaior();
		}

		return 0;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeDaLinguagem() {
		return nomeDaLinguagem;
	}

	public void setNomeDaLinguagem(String nomeDaLinguagem) {
		this.nomeDaLinguagem = nomeDaLinguagem;
	}

	public MedidaDaLinguagem getMedidaDaLinguagem() {
		return medidaDaLinguagem;
	}

	public void setMedidaDaLinguagem(MedidaDaLinguagem medidaDaLinguagem) {
		this.medidaDaLinguagem = medidaDaLinguagem;
	}

	public double getNit() {
		return nit;
	}

	public void setNit(double nit) {
		this.nit = nit;
	}

	public double getFatorDeAjuste() {
		return (this.nit * 0.01) + 0.65;
	}

	public void setFatorDeAjuste(double fatorDeAjuste) {
		this.fatorDeAjuste = fatorDeAjuste;
	}

	public PontoDeFuncaoNaoAjustado getPontoDeFuncaoNaoAjustado() {
		return pontoDeFuncaoNaoAjustado;
	}

	public void setPontoDeFuncaoNaoAjustado(PontoDeFuncaoNaoAjustado pontoDeFuncaoNaoAjustado) {
		this.pontoDeFuncaoNaoAjustado = pontoDeFuncaoNaoAjustado;
	}

	public double getPontoDeFuncao() {
		return getFatorDeAjuste() * getPontoDeFuncaoNaoAjustado().valor();
	}

	public void setPontoDeFuncao(double pontoDeFuncao) {
		this.pontoDeFuncao = pontoDeFuncao;
	}

	public double getEsforco() {
		return Cocomo.AB * Math.pow(kaloc(), Cocomo.BB);
	}

	public double getTempo() {
		return kaloc() * Math.pow(getEsforco(), Cocomo.DB);
	}

	public double getPessoa() {
		return getEsforco() / getTempo();
	}

}
