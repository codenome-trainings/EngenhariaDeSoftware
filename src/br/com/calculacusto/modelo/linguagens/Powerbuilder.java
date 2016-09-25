package br.com.calculacusto.modelo.linguagens;

public class Powerbuilder implements LinguagensDeProgramacao {

	@Override
	public String getNome() {
		return "Powerbuilder";
	}

	@Override
	public double getMedia() {
		return 26;
	}

	@Override
	public double getMediana() {
		return 28;
	}

	@Override
	public double getMenor() {
		return 7;
	}

	@Override
	public double getMaior() {
		return 40;
	}

}
