package br.com.calculacusto.modelo;

public class LinguagemDeProgramacao {

	private String nome;
	private double media;
	private double mediana;
	private double menor;
	private double maior;

	public LinguagemDeProgramacao(String nome, double media, double mediana, double menor, double maior) {
		this.nome = nome;
		this.media = media;
		this.mediana = mediana;
		this.menor = menor;
		this.maior = maior;
	}
	
	public LinguagemDeProgramacao() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	public double getMediana() {
		return mediana;
	}

	public void setMediana(double mediana) {
		this.mediana = mediana;
	}

	public double getMenor() {
		return menor;
	}

	public void setMenor(double menor) {
		this.menor = menor;
	}

	public double getMaior() {
		return maior;
	}

	public void setMaior(double maior) {
		this.maior = maior;
	}

}
