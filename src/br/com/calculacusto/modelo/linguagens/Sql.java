package br.com.calculacusto.modelo.linguagens;

public class Sql implements LinguagensDeProgramacao{

	@Override
	public String getNome() {
		return "sql";
	}

	@Override
	public double getMedia() {
		return 21;
	}

	@Override
	public double getMediana() {
		return 21;
	}

	@Override
	public double getMenor() {
		return 13;
	}

	@Override
	public double getMaior() {
		return 37;
	}

}
