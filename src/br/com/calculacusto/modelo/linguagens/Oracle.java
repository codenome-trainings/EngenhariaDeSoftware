package br.com.calculacusto.modelo.linguagens;

public class Oracle implements LinguagensDeProgramacao {

	@Override
	public String getNome() {
		return "oracle";
	}

	@Override
	public double getMedia() {
		return 37;
	}

	@Override
	public double getMediana() {
		return 40;
	}

	@Override
	public double getMenor() {
		return 17;
	}

	@Override
	public double getMaior() {
		return 60;
	}

}
