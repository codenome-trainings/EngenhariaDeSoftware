package br.com.calculacusto.modelo;

public class LinguagemDeProgramacao {
	
	private String nome;
	private double menor;
	private double media;
	private double maior;
	private double mediana;

	public LinguagemDeProgramacao(String nome) {
		this.nome = nome.toLowerCase();
	}

	public void escolheLinguagem(String tipoDoProgramador) {

		tipoDoProgramador = tipoDoProgramador.toUpperCase();
		
		switch(this.nome) {
			case "sap":
				if (tipoDoProgramador.equals("MEDIA")) {
					this.media = 28;
				} else if (tipoDoProgramador.equals("MEDIANA")) {
					this.mediana = 18;
				} else if (tipoDoProgramador.equals("MENOR")) {
					this.menor = 16;
				} else if (tipoDoProgramador.equals("MAIOR")) {
					this.maior = 60;
				}
			case "aps":
				if (tipoDoProgramador.equals("MEDIA")) {
					this.media = 51;
				} else if (tipoDoProgramador.equals("MEDIANA")) {
					this.mediana = 54;
				} else if (tipoDoProgramador.equals("MENOR")) {
					this.menor = 15;
				} else if (tipoDoProgramador.equals("MAIOR")) {
					this.maior = 69;
				}
			case "assembler":
				if (tipoDoProgramador.equals("MEDIA")) {
					this.media = 119;
				} else if (tipoDoProgramador.equals("MEDIANA")) {
					this.mediana = 98;
				} else if (tipoDoProgramador.equals("MENOR")) {
					this.menor = 25;
				} else if (tipoDoProgramador.equals("MAIOR")) {
					this.maior = 320;
				}
			case "brio":
				if (tipoDoProgramador.equals("MEDIA")) {
					this.media = 14;
				} else if (tipoDoProgramador.equals("MEDIANA")) {
					this.mediana = 14;
				} else if (tipoDoProgramador.equals("MENOR")) {
					this.menor = 13;
				} else if (tipoDoProgramador.equals("MAIOR")) {
					this.maior = 16;
				}
			case "c":
				if (tipoDoProgramador.equals("MEDIA")) {
					this.media = 97;
				} else if (tipoDoProgramador.equals("MEDIANA")) {
					this.mediana = 99;
				} else if (tipoDoProgramador.equals("MENOR")) {
					this.menor = 39;
				} else if (tipoDoProgramador.equals("MAIOR")) {
					this.maior = 33;
				}
			case "c++":
				if (tipoDoProgramador.equals("MEDIA")) {
					this.media = 50;
				} else if (tipoDoProgramador.equals("MEDIANA")) {
					this.mediana = 53;
				} else if (tipoDoProgramador.equals("MENOR")) {
					this.menor = 25;
				} else if (tipoDoProgramador.equals("MAIOR")) {
					this.maior = 80;
				}
		}
	}
	
}
