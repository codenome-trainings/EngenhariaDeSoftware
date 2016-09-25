package br.com.calculacusto.modelo.linguagens;

public class Html implements LinguagensDeProgramacao{

	@Override
	public String getNome() {
		return "html";
	}

	@Override
	public double getMedia() {
		return 34;
	}

	@Override
	public double getMediana() {
		return 40;
	}

	@Override
	public double getMenor() {
		return 14;
	}

	@Override
	public double getMaior() {
		return 48;
	}

}
