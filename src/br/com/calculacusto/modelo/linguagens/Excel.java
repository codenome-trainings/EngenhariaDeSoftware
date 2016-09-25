package br.com.calculacusto.modelo.linguagens;

public class Excel implements LinguagensDeProgramacao{

	@Override
	public String getNome() {
		return "excel";
	}

	@Override
	public double getMedia() {
		return 209;
	}

	@Override
	public double getMediana() {
		return 191;
	}

	@Override
	public double getMenor() {
		return 131;
	}

	@Override
	public double getMaior() {
		return 315;
	}

}
