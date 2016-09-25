package br.com.calculacusto.modelo.linguagens;

public class Vbnet implements LinguagensDeProgramacao {

	@Override
	public String getNome() {
		return "vebnet";
	}

	@Override
	public double getMedia() {
		return 52;
	}

	@Override
	public double getMediana() {
		return 60;
	}

	@Override
	public double getMenor() {
		return 26;
	}

	@Override
	public double getMaior() {
		return 60;
	}

}
