package br.com.calculacusto.modelo.linguagens;

public class Rexx implements LinguagensDeProgramacao{

	@Override
	public String getNome() {
		return "rexx";
	}

	@Override
	public double getMedia() {
		return 77;
	}

	@Override
	public double getMediana() {
		return 80;
	}

	@Override
	public double getMenor() {
		return 50;
	}

	@Override
	public double getMaior() {
		return 80;
	}

}
