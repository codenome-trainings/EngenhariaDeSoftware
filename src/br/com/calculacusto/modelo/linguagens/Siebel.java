package br.com.calculacusto.modelo.linguagens;

public class Siebel implements LinguagensDeProgramacao{

	@Override
	public String getNome() {
		return "siebel";
	}

	@Override
	public double getMedia() {
		return 59;
	}

	@Override
	public double getMediana() {
		return 60;
	}

	@Override
	public double getMenor() {
		return 51;
	}

	@Override
	public double getMaior() {
		return 60;
	}

}
