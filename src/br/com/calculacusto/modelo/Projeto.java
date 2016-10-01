package br.com.calculacusto.modelo;

import java.util.ArrayList;
import java.util.List;

import br.com.calculacusto.dao.LinguagemDeProgramacaoDao;

public class Projeto {

	private String nome;
	private double fatorDeAjuste;
	private double pontoDeFuncao;
	private double esforco;
	private double tempo;
	private double pessoa;
	private double hh;
	private double custo;
	private double valorDeVenda;
	private double lucro;

	private MedidaDaLinguagem medidaDaLinguagem;
	private String nomeDaLinguagem;
	
	private PontoDeFuncaoNaoAjustado pontoDeFuncaoNaoAjustado = new PontoDeFuncaoNaoAjustado();
	private AvaliacaoNit avaliacaoNit = new AvaliacaoNit();
	private LinguagemDeProgramacao linguagemDeProgramacao;

	public double kloc() {
		return getPontoDeFuncao() * valorDaLinguagem();
	}
	
	public double valorDaLinguagem () {
		
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

	public double getFatorDeAjuste() {
		return ((avaliacaoNit.getNota() * 0.01) + 0.65);
	}

	public void setFatorDeAjuste(double fatorDeAjuste) {
		this.fatorDeAjuste = fatorDeAjuste;
	}

	public double getPontoDeFuncao() {
		return getFatorDeAjuste() * pontoDeFuncaoNaoAjustado.valor();
	}

	public void setPontoDeFuncao(double pontoDeFuncao) {
		this.pontoDeFuncao = pontoDeFuncao;
	}

	public AvaliacaoNit getAvaliacaoNit() {
		return avaliacaoNit;
	}

	public void setAvaliacaoNit(AvaliacaoNit avaliacaoNit) {
		this.avaliacaoNit = avaliacaoNit;
	}

	public double getEsforco() {
		return Cocomo.AB * Math.pow(kloc(), Cocomo.BB);
	}

	public void setEsforco(double esforco) {
		this.esforco = esforco;
	}

	public double getTempo() {
		return kloc() * Math.pow(getEsforco(), Cocomo.DB);
	}

	public void setTempo(double tempo) {
		this.tempo = tempo;
	}

	public double getPessoa() {
		return getEsforco() / getTempo();
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
		return ((getTempo() * 7) * 8) * getHh();
	}

	public void setCusto(double custo) {
		this.custo = custo;
	}
	
	public double calculaPorcentagem(double valor, double porcentagem) {
		return ((valor / 100) * porcentagem);
	}

	public double getValorDeVenda() {
		// Soma de 45% de valor de venda + 25% de segurança e valor da marca.
		return getCusto() + calculaPorcentagem(getCusto(), 45) + calculaPorcentagem(getCusto(), 25);
	}

	public void setValorDeVenda(double valorDeVenda) {
		this.valorDeVenda = valorDeVenda;
	}

	public double getLucro() {
		return getValorDeVenda() - getLucro();
	}

	public void setLucro(double lucro) {
		this.lucro = lucro;
	}

	public PontoDeFuncaoNaoAjustado getPontoDeFuncaoNaoAjustado() {
		return pontoDeFuncaoNaoAjustado;
	}

	public void setPontoDeFuncaoNaoAjustado(PontoDeFuncaoNaoAjustado pontoDeFuncaoNaoAjustado) {
		this.pontoDeFuncaoNaoAjustado = pontoDeFuncaoNaoAjustado;
	}

	public LinguagemDeProgramacao getLinguagemDeProgramacao() {
		return linguagemDeProgramacao;
	}

	public void setLinguagemDeProgramacao(LinguagemDeProgramacao linguagemDeProgramacao) {
		this.linguagemDeProgramacao = linguagemDeProgramacao;
	}

}
