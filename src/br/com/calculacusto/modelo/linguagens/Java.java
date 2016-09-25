package br.com.calculacusto.modelo.linguagens;

public class Java implements LinguagensDeProgramacao{

	@Override
	public String getNome() {
		return "java";
	}

	@Override
	public double getMedia() {
		return 53;
	}

	@Override
	public double getMediana() {
		return 53;
	}

	@Override
	public double getMenor() {
		return 14;
	}

	@Override
	public double getMaior() {
		return 134;
	}

}
