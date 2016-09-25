package br.com.calculacusto.modelo.linguagens;

public class Datastage implements LinguagensDeProgramacao {

	@Override
	public String getNome() {
		return "Datastage";
	}

	@Override
	public double getMedia() {
		return 71;
	}

	@Override
	public double getMediana() {
		return 65;
	}

	@Override
	public double getMenor() {
		return 31;
	}

	@Override
	public double getMaior() {
		return 157;
	}

}
