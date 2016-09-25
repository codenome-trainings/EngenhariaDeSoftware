package br.com.calculacusto.modelo.linguagens;

public class Csharp implements LinguagensDeProgramacao {

	@Override
	public String getNome() {
		return "csharp";
	}

	@Override
	public double getMedia() {
		return 54;
	}

	@Override
	public double getMediana() {
		return 59;
	}

	@Override
	public double getMenor() {
		return 29;
	}

	@Override
	public double getMaior() {
		return 70;
	}

}
