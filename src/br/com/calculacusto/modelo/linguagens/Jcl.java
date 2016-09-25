package br.com.calculacusto.modelo.linguagens;

public class Jcl implements LinguagensDeProgramacao {

	@Override
	public String getNome() {
		return "jcl";
	}

	@Override
	public double getMedia() {
		return 62;
	}

	@Override
	public double getMediana() {
		return 48;
	}

	@Override
	public double getMenor() {
		return 25;
	}

	@Override
	public double getMaior() {
		return 221;
	}

}
