package br.com.calculacusto.modelo;

import java.util.ArrayList;
import java.util.List;

import br.com.calculacusto.dao.LinguagemDeProgramacaoDao;

public class Projeto {

	private String nome;
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
	
	
	private PontoDeFuncaoNaoAjustado pontoDeFuncaoNaoAjustado = new PontoDeFuncaoNaoAjustado();
	
	
	/*
	 * Tive que pegar essas duas variáveis para tratar o QSM
	 */
	private String nomeDaLinguagem;
	private String medida;
	

	/*
	 * Impostos para calculo de venda
	 */
	private final double IMPOSTO = 45;
	private final double SEGURANCA = 20;
	
	private LinguagemDeProgramacao linguagemDeProgramacao;
	private List<AvaliacaoNit> avaliacoesNit = new ArrayList<>();
	
	//Preciso ainda implementar a busca da soma dos valores pf1 e pf2
	public double calculaPontoDeFuncaoBruta() {
		return this.dadosFuncao.getDados().totalPontoDeFuncaoPF1() + this.dadosFuncao.getFuncao().totalPontoDeFuncaoPF2();
	}
	
	public double kaloc() throws Exception {
		
		double valorDaMedida = 0;
		this.nomeDaLinguagem = this.nomeDaLinguagem.toLowerCase();
		
		LinguagemDeProgramacaoDao linguagemDao = new LinguagemDeProgramacaoDao();
		this.linguagemDeProgramacao = linguagemDao.buscaPorNome(nomeDaLinguagem);
		
		if(this.medida.equals("media")) {
			valorDaMedida = this.linguagemDeProgramacao.getMedia();
		} else if(this.medida.equals("mediana")) {
			valorDaMedida =  this.linguagemDeProgramacao.getMediana();
		} else if(this.medida.equals("menor")) {
			valorDaMedida =  this.linguagemDeProgramacao.getMenor();
		} else if(this.medida.equals("maior")) {
			valorDaMedida =  this.linguagemDeProgramacao.getMaior();
		} else {
			throw new Exception("Tipo de medida par calculo do KLOC inesperado!");
		}
		
		return getPontoDeFuncao() * valorDaMedida;
	}
	
	public double calculaHoraHomem() throws Exception {
		return (this.hh * (getTempo() * 8));
	}
	
	public double calculaImpostoSobreHoraHomem() throws Exception {
		return (calculaHoraHomem() / 100) * this.IMPOSTO;
	}
	
	public double calculaSegurancaSobreImposto() throws Exception {
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

	public double getEsforco() throws Exception {
		return Cocomo.AB * Math.pow(kaloc(), Cocomo.BB);
	}

	public double getTempo() throws Exception {
		return kaloc() * Math.pow(getEsforco(), Cocomo.DB);
	}

	public double getPessoa() throws Exception {
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

	public double getValorDeVenda() throws Exception {
		return calculaHoraHomem() + calculaImpostoSobreHoraHomem() + this.calculaSegurancaSobreImposto();
	}

	public void setValorDeVenda(double valorDeVenda) {
		this.valorDeVenda = valorDeVenda;
	}

	public double getLucro() throws Exception {
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
	
	public String getNomeDaLinguagem() {
		return nomeDaLinguagem;
	}
	
	public void setNomeDaLinguagem(String nomeDaLinguagem) {
		this.nomeDaLinguagem = nomeDaLinguagem;
	}
	
	public String getMedida() {
		return medida;
	}
	
	public void setMedida(String medida) {
		this.medida = medida;
	}

	public PontoDeFuncaoNaoAjustado getPontoDeFuncaoNaoAjustado() {
		return pontoDeFuncaoNaoAjustado;
	}

	public void setPontoDeFuncaoNaoAjustado(PontoDeFuncaoNaoAjustado pontoDeFuncaoNaoAjustado) {
		this.pontoDeFuncaoNaoAjustado = pontoDeFuncaoNaoAjustado;
	}
	

}
