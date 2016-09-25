package br.com.calculacusto.modelo.linguagens;

public class JIIee implements LinguagensDeProgramacao{

	@Override
	public String getNome() {
		return "j2ee";
	}

	@Override
	public double getMedia() {
		return 46;
	}

	@Override
	public double getMediana() {
		return 49;
	}

	@Override
	public double getMenor() {
		return 15;
	}

	@Override
	public double getMaior() {
		return 67;
	}

}
