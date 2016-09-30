package br.com.calculacusto.modelo;

public class PontoDeFuncaoTransacional {
	private String nomeDoCasoDeUso;
	private int numeroDeArquivosReferenciados;
	private int numeroDeItensDeDadosReferenciados;
	private TipoFuncao tipoFuncao;
	
			
	public Complexidade complexidadeFuncional() {
		
		if (this.numeroDeArquivosReferenciados == 1) {
			if (this.numeroDeItensDeDadosReferenciados >= 1 && this.numeroDeItensDeDadosReferenciados <= 19) {
				return Complexidade.SIMPLES;
			} else if (this.numeroDeItensDeDadosReferenciados >= 20 && this.numeroDeItensDeDadosReferenciados <= 50) {
				return Complexidade.SIMPLES;
			} else {
				return Complexidade.MEDIO;
			}
		}
		
		if (this.numeroDeArquivosReferenciados >= 2 && this.numeroDeArquivosReferenciados <= 5) {
			if (this.numeroDeItensDeDadosReferenciados >= 1 && this.numeroDeItensDeDadosReferenciados <= 19) {
				return Complexidade.SIMPLES;
			} else if (this.numeroDeItensDeDadosReferenciados >= 20 && this.numeroDeItensDeDadosReferenciados <= 50) {
				return Complexidade.MEDIO;
			} else {
				return Complexidade.COMPLEXO;
			}
		}
		
		if (this.numeroDeArquivosReferenciados >= 6) {
			if (this.numeroDeItensDeDadosReferenciados >= 1 && this.numeroDeItensDeDadosReferenciados <= 19) {
				return Complexidade.MEDIO;
			} else if (this.numeroDeItensDeDadosReferenciados >= 20 && this.numeroDeItensDeDadosReferenciados <= 50) {
				return Complexidade.COMPLEXO;
			} else {
				return Complexidade.COMPLEXO;
			}
		}

		return null;
	}
	
	public int valorDoPontoDeFuncao() {
		return 0;
	}

	public String getNomeDoCasoDeUso() {
		return nomeDoCasoDeUso;
	}

	public void setNomeDoCasoDeUso(String nomeDoCasoDeUso) {
		this.nomeDoCasoDeUso = nomeDoCasoDeUso;
	}

	public int getNumeroDeArquivosReferenciados() {
		return numeroDeArquivosReferenciados;
	}

	public void setNumeroDeArquivosReferenciados(int numeroDeArquivosReferenciados) {
		this.numeroDeArquivosReferenciados = numeroDeArquivosReferenciados;
	}

	public int getNumeroDeItensDeDadosReferenciados() {
		return numeroDeItensDeDadosReferenciados;
	}

	public void setNumeroDeItensDeDadosReferenciados(int numeroDeItensDeDadosReferenciados) {
		this.numeroDeItensDeDadosReferenciados = numeroDeItensDeDadosReferenciados;
	}

	public TipoFuncao getTipoFuncao() {
		return tipoFuncao;
	}

	public void setTipoFuncao(TipoFuncao tipoFuncao) {
		this.tipoFuncao = tipoFuncao;
	}

}
