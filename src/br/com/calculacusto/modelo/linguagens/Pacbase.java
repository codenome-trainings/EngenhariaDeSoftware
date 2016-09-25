package br.com.calculacusto.modelo.linguagens;

public class Pacbase implements LinguagensDeProgramacao {

	@Override
	public String getNome() {
		return "pacbase";
	}

	@Override
	public double getMedia() {
		return 35;
	}

	@Override
	public double getMediana() {
		return 32;
	}

	@Override
	public double getMenor() {
		return 22;
	}

	@Override
	public double getMaior() {
		return 60;
	}

}
