package br.com.calculacusto.modelo.linguagens;

public class Visualbasec implements LinguagensDeProgramacao{

	@Override
	public String getNome() {
		return "visual basic";
	}

	@Override
	public double getMedia() {
		return 42;
	}

	@Override
	public double getMediana() {
		return 44;
	}

	@Override
	public double getMenor() {
		return 20;
	}

	@Override
	public double getMaior() {
		return 60;
	}

}
