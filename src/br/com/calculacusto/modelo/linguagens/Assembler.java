package br.com.calculacusto.modelo.linguagens;

public class Assembler implements LinguagensDeProgramacao{

	@Override
	public String getNome() {
		return "assembler";
	}

	@Override
	public double getMedia() {
		return 119;
	}


	@Override
	public double getMediana() {
		return 98;
	}

	@Override
	public double getMenor() {
		return 25;
	}

	@Override
	public double getMaior() {
		return 320;
	}

}
