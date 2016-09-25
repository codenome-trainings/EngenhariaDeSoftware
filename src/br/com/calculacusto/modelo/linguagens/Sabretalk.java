package br.com.calculacusto.modelo.linguagens;

public class Sabretalk implements LinguagensDeProgramacao{

	@Override
	public String getNome() {
		return "sabretalk";
	}

	@Override
	public double getMedia() {
		return 70;
	}

	@Override
	public double getMediana() {
		return 66;
	}

	@Override
	public double getMenor() {
		return 45;
	}

	@Override
	public double getMaior() {
		return 109;
	}

}
