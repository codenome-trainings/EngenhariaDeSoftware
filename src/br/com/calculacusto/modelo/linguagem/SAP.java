package br.com.calculacusto.modelo.linguagem;

public class SAP implements LinguagemDeProgramacao {

	@Override
	public String getNome() {
		return "sap";
	}

	@Override
	public double getMenor() {
		return 16;
	}

	@Override
	public double getMedia() {
		return 28;
	}

	@Override
	public double getMaior() {
		return 60;
	}

	@Override
	public double getMediana() {
		return 18;
	}

}
