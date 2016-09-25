package br.com.calculacusto.modelo.linguagens;

public class Slogan implements LinguagensDeProgramacao{

	@Override
	public String getNome() {
		return "slogan";
	}

	@Override
	public double getMedia() {
		return 75;
	}

	@Override
	public double getMediana() {
		return 75;
	}

	@Override
	public double getMenor() {
		return 74;
	}

	@Override
	public double getMaior() {
		return 75;
	}

}
