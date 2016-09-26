package br.com.calculacusto.modelo;

public class AvaliacaoNit {

	private int nota;
	private Nit nit;
	private Projeto projeto;
	
	public AvaliacaoNit(int nota, Nit nit, Projeto projeto) {
		this.nota = nota;
		this.nit = nit;
		this.projeto = projeto;
	}

	public AvaliacaoNit() {
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public Nit getNit() {
		return nit;
	}

	public void setNit(Nit nit) {
		this.nit = nit;
	}

	public Projeto getProjeto() {
		return projeto;
	}

	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}

}
