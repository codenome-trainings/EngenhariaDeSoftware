package br.com.calculacusto.modelo.linguagens;

public class LinguaguemPL implements LinguagensDeProgramacao{

	@Override
	public String getNome() {
		return "pl";
	}

	@Override
	public double getMedia() {
		return 64;
	}

	@Override
	public double getMediana() {
		return 80;
	}

	@Override
	public double getMenor() {
		return 16;
	}

	@Override
	public double getMaior() {
		return 80;
	}

}
