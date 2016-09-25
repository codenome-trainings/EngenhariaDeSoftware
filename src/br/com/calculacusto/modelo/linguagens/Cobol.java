package br.com.calculacusto.modelo.linguagens;

public class Cobol implements LinguagensDeProgramacao {

	@Override
	public String getNome() {
		return "cobol";
	}

	@Override
	public double getMedia() {
		return 61;
	}

	@Override
	public double getMediana() {
		return 55;
	}

	@Override
	public double getMenor() {
		return 23;
	}

	@Override
	public double getMaior() {
		return 279;
	}

}
