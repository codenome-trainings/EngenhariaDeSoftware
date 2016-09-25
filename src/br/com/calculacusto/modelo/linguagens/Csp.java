package br.com.calculacusto.modelo.linguagens;

public class Csp implements LinguagensDeProgramacao{

	@Override
	public String getNome() {
		return "csp";
	}

	@Override
	public double getMedia() {
		return 20;
	}

	@Override
	public double getMediana() {
		return 18;
	}

	@Override
	public double getMenor() {
		return 10;
	}

	@Override
	public double getMaior() {
		return 38;
	}

}
