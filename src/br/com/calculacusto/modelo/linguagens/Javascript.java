package br.com.calculacusto.modelo.linguagens;

public class Javascript implements LinguagensDeProgramacao {

	@Override
	public String getNome() {
		return "JavaScript";
	}

	@Override
	public double getMedia() {
		return 47;
	}

	@Override
	public double getMediana() {
		return 53;
	}

	@Override
	public double getMenor() {
		return 31;
	}

	@Override
	public double getMaior() {
		return 63;
	}

}
