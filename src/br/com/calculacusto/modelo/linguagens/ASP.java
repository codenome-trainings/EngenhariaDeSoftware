package br.com.calculacusto.modelo.linguagens;

public class ASP implements LinguagensDeProgramacao {

	@Override
	public String getNome() {
		return "asp";
	}

	@Override
	public double getMedia() {
		return 51;
	}

	@Override
	public double getMediana() {
		return 54;
	}

	@Override
	public double getMenor() {
		return 15;
	}

	@Override
	public double getMaior() {
		return 69;
	}

}
