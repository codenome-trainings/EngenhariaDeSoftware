package br.com.calculacusto.modelo.linguagens;

public class SAP implements LinguagensDeProgramacao {

	@Override
	public String getNome() {
		return "sap";
	}

	@Override
	public double getMedia() {
		return 28;
	}

	@Override
	public double getMediana() {
		return 18;
	}

	@Override
	public double getMenor() {
		return 16;
	}

	@Override
	public double getMaior() {
		return 60;
	}

}
