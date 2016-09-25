package br.com.calculacusto.modelo.linguagens;

public class Lotusnotes implements LinguagensDeProgramacao {

	@Override
	public String getNome() {
		return "lotus notes";
	}

	@Override
	public double getMedia() {
		return 23;
	}

	@Override
	public double getMediana() {
		return 21;
	}

	@Override
	public double getMenor() {
		return 19;
	}

	@Override
	public double getMaior() {
		return 40;
	}

}
