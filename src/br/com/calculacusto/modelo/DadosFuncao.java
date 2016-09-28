package br.com.calculacusto.modelo;

public class DadosFuncao {

	private String nome;
	private int registro;
	private int itens;
	private int pontoDeFuncao;
	
	private Dados dados;

	public DadosFuncao(String nome, int registro, int itens) {
		this.nome = nome;
		this.registro = registro;
		this.itens = itens;
	}
	
	public DadosFuncao() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getRegistro() {
		return registro;
	}

	public void setRegistro(int registro) {
		this.registro = registro;
	}

	public int getItens() {
		return itens;
	}

	public void setItens(int itens) {
		this.itens = itens;
	}

	public int getPontoDeFuncao() {
		return pontoDeFuncao;
	}

	public void setPontoDeFuncao(int pontoDeFuncao) {
		this.pontoDeFuncao = pontoDeFuncao;
	}
	
	public Dados getDados() {
		return dados;
	}

	public void setDados(Dados dados) {
		this.dados = dados;
	}


}
