package br.com.calculacusto.modelo.linguagens;

public class Focus implements LinguagensDeProgramacao{

	@Override
	public String getNome() {
		return "focus";
	}

	@Override
	public double getMedia() {
		return 43;
	}

	@Override
	public double getMediana() {
		return 45;
	}

	@Override
	public double getMenor() {
		return 45;
	}

	@Override
	public double getMaior() {
		return 45;
	}

}
