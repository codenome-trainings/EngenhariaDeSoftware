package br.com.calculacusto.modelo.linguagens;

public class Brio implements LinguagensDeProgramacao {

	@Override
	public String getNome() {
		return "brio";
	}

	@Override
	public double getMedia() {
		return 14;
	}

	@Override
	public double getMediana() {
		return 14;
	}

	@Override
	public double getMenor() {
		return 13;
	}

	@Override
	public double getMaior() {
		return 16;
	}

}
