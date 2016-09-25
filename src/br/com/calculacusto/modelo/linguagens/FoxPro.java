package br.com.calculacusto.modelo.linguagens;

public class FoxPro implements LinguagensDeProgramacao{

	@Override
	public String getNome() {
		return "FoxPro";
	}

	@Override
	public double getMedia() {
		return 36;
	}

	@Override
	public double getMediana() {
		return 35;
	}

	@Override
	public double getMenor() {
		return 34;
	}

	@Override
	public double getMaior() {
		return 38;
	}

}
