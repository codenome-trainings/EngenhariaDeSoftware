package br.com.calculacusto.modelo.linguagens;

public class Net implements LinguagensDeProgramacao{

	@Override
	public String getNome() {
		return "net";
	}

	@Override
	public double getMedia() {
		return 57;
	}

	@Override
	public double getMediana() {
		return 60;
	}

	@Override
	public double getMenor() {
		return 53;
	}

	@Override
	public double getMaior() {
		return 60;
	}

}
