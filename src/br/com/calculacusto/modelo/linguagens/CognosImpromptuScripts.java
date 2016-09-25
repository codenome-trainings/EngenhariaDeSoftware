package br.com.calculacusto.modelo.linguagens;

public class CognosImpromptuScripts implements LinguagensDeProgramacao {

	@Override
	public String getNome() {	
		return "Cognos Impromptu Scripts";
	}

	@Override
	public double getMedia() {
		return 47;
	}

	@Override
	public double getMediana() {	 
		return 42;
	}

	@Override
	public double getMenor() {
		return 30;
	}

	@Override
	public double getMaior() {
		return 100;
	}

}
