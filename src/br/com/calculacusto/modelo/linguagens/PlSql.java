package br.com.calculacusto.modelo.linguagens;

public class PlSql implements LinguagensDeProgramacao{

	@Override
	public String getNome() {
		return "pl sql";
	}

	@Override
	public double getMedia() {
		return 37;
	}

	@Override
	public double getMediana() {
		return 35;
	}

	@Override
	public double getMenor() {
		return 13;
	}

	@Override
	public double getMaior() {
		return 60;
	}

}
