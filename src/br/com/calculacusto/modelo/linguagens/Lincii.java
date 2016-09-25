package br.com.calculacusto.modelo.linguagens;

public class Lincii implements LinguagensDeProgramacao{

	@Override
	public String getNome() {
		return "lincii";
	}

	@Override
	public double getMedia() {
		return 23;
	}

	@Override
	public double getMediana() {
		return 30;
	}

	@Override
	public double getMenor() {
		return 22;
	}

	@Override
	public double getMaior() {
		return 38;
	}

}
