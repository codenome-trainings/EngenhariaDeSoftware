package br.com.calculacusto.modelo;

public class PontoDeFuncaoDeDados {

	private String nomeDaClasse;
	private int numeroDeRegistrosLogicos;
	private int numeroDeItensDeDadosReferenciados;
	private TipoDado tipoDado;

	public PontoDeFuncaoDeDados(String nomeDaClasse, int numeroDeRegistrosLogicos,
			int numeroDeItensDeDadosReferenciados, TipoDado tipoDado) {
		this.nomeDaClasse = nomeDaClasse;
		this.numeroDeRegistrosLogicos = numeroDeRegistrosLogicos;
		this.numeroDeItensDeDadosReferenciados = numeroDeItensDeDadosReferenciados;
		this.tipoDado = tipoDado;
	}

	public PontoDeFuncaoDeDados(int numeroDeRegistrosLogicos, int numeroDeItensDeDadosReferenciados) {
		this.numeroDeRegistrosLogicos = numeroDeRegistrosLogicos;
		this.numeroDeItensDeDadosReferenciados = numeroDeItensDeDadosReferenciados;
	}

	public PontoDeFuncaoDeDados(String nomeDaClasse) {
		this.nomeDaClasse = nomeDaClasse;
	}

	public PontoDeFuncaoDeDados() {
	}

	public int valorDoPontoDeFuncao() {

		if (this.tipoDado == TipoDado.INTERNO) {
			return defineValorPontoDeFuncaoInterno();
		}

		if (this.tipoDado == TipoDado.EXTERNO) {
			return defineValorPontoDeFuncaoExterno();
		}

		return 0;
	}

	public Complexidade complexidadeFuncional() {

		if (this.numeroDeRegistrosLogicos == 1) {

			if (this.numeroDeItensDeDadosReferenciados >= 1 && this.numeroDeItensDeDadosReferenciados <= 19) {
				return Complexidade.SIMPLES;
			} else if (this.numeroDeItensDeDadosReferenciados >= 20 && this.numeroDeItensDeDadosReferenciados <= 50) {
				return Complexidade.SIMPLES;
			} else if (this.numeroDeItensDeDadosReferenciados > 50) {
				return Complexidade.MEDIO;
			}
		}

		if (this.numeroDeRegistrosLogicos >= 2 && this.numeroDeRegistrosLogicos <= 5) {
			if (this.numeroDeItensDeDadosReferenciados >= 1 && this.numeroDeItensDeDadosReferenciados <= 19) {
				return Complexidade.SIMPLES;
			} else if (this.numeroDeItensDeDadosReferenciados >= 20 && this.numeroDeItensDeDadosReferenciados <= 50) {
				return Complexidade.MEDIO;
			} else if (this.numeroDeItensDeDadosReferenciados > 50) {
				return Complexidade.COMPLEXO;
			}
		}

		if (this.numeroDeRegistrosLogicos >= 6) {
			if (this.numeroDeItensDeDadosReferenciados >= 1 && this.numeroDeItensDeDadosReferenciados <= 19) {
				return Complexidade.MEDIO;
			} else if (this.numeroDeItensDeDadosReferenciados >= 20 && this.numeroDeItensDeDadosReferenciados <= 50) {
				return Complexidade.COMPLEXO;
			} else if (this.numeroDeItensDeDadosReferenciados > 50) {
				return Complexidade.COMPLEXO;
			}
		}
		return null;
	}

	public int defineValorPontoDeFuncaoInterno() {

		if (this.complexidadeFuncional() == Complexidade.SIMPLES) {
			return 7;
		}

		if (this.complexidadeFuncional() == Complexidade.MEDIO) {
			return 10;
		}

		if (this.complexidadeFuncional() == Complexidade.COMPLEXO) {
			return 15;
		}

		return 0;
	}

	public int defineValorPontoDeFuncaoExterno() {

		if (this.complexidadeFuncional() == Complexidade.SIMPLES) {
			return 5;
		}

		if (this.complexidadeFuncional() == Complexidade.MEDIO) {
			return 7;
		}

		if (this.complexidadeFuncional() == Complexidade.COMPLEXO) {
			return 10;
		}

		return 0;
	}

	public String getNomeDaClasse() {
		return nomeDaClasse;
	}

	public void setNomeDaClasse(String nomeDaClasse) {
		this.nomeDaClasse = nomeDaClasse;
	}

	public int getNumeroDeRegistrosLogicos() {
		return numeroDeRegistrosLogicos;
	}

	public void setNumeroDeRegistrosLogicos(int numeroDeRegistrosLogicos) {
		this.numeroDeRegistrosLogicos = numeroDeRegistrosLogicos;
	}

	public int getNumeroDeItensDeDadosReferenciados() {
		return numeroDeItensDeDadosReferenciados;
	}

	public void setNumeroDeItensDeDadosReferenciados(int numeroDeItensDeDadosReferenciados) {
		this.numeroDeItensDeDadosReferenciados = numeroDeItensDeDadosReferenciados;
	}

	public TipoDado getTipoDado() {
		return tipoDado;
	}

	public void setTipoDado(TipoDado tipoDado) {
		this.tipoDado = tipoDado;
	}

}
