package br.com.calculacusto.modelo.linguagens;

public class LinguagemC implements LinguagensDeProgramacao {

	@Override
	public String getNome() {
		return "c";
	}

	@Override
	public double getMedia() {
		return 97;
	}

	@Override
	public double getMediana() {
		return 99;
	}

	@Override
	public double getMenor() {
		return 39;
	}

	@Override
	public double getMaior() {
		return 333;
	}

}
