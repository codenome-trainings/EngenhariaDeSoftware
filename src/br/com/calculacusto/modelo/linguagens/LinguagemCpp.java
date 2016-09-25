package br.com.calculacusto.modelo.linguagens;

public class LinguagemCpp implements LinguagensDeProgramacao {

	@Override
	public String getNome() {
		return "cpp";
	}

	@Override
	public double getMedia() {
		return 50;
	}

	@Override
	public double getMediana() {
		return 53;
	}

	@Override
	public double getMenor() {
		return 25;
	}

	@Override
	public double getMaior() {
		return 320;
	}

}
