package br.com.calculacusto.modelo.linguagens;

public class Perl implements LinguagensDeProgramacao{

	@Override
	public String getNome() {
		return "Perl";
	}

	@Override
	public double getMedia() {
		return 24;
	}

	@Override
	public double getMediana() {
		return 15;
	}

	@Override
	public double getMenor() {
		return 15;
	}

	@Override
	public double getMaior() {
		return 60;
	}

}
