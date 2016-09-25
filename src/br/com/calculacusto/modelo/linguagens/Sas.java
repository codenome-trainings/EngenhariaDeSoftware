package br.com.calculacusto.modelo.linguagens;

public class Sas implements LinguagensDeProgramacao{

	@Override
	public String getNome() {
		return "sas";
	}

	@Override
	public double getMedia() {
		return 38;
	}

	@Override
	public double getMediana() {
		return 37;
	}

	@Override
	public double getMenor() {
		return 22;
	}

	@Override
	public double getMaior() {
		return 55;
	}

}
