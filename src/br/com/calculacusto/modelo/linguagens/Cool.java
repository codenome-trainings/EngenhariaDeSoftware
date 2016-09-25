package br.com.calculacusto.modelo.linguagens;

public class Cool implements LinguagensDeProgramacao{

	@Override
	public String getNome() {
		return "cool";
	}

	@Override
	public double getMedia() {
		return 32;
	}

	@Override
	public double getMediana() {
		return 24;
	}

	@Override
	public double getMenor() {
		return 10;
	}

	@Override
	public double getMaior() {
		return 82;
	}

}
