package br.com.calculacusto.modelo.linguagens;

public class Natural implements LinguagensDeProgramacao{

	@Override
	public String getNome() {
		return "Natural";
	}

	@Override
	public double getMedia() {
		return 40;
	}

	@Override
	public double getMediana() {
		return 34;
	}

	@Override
	public double getMenor() {
		return 34;
	}

	@Override
	public double getMaior() {
		return 53;
	}

}
