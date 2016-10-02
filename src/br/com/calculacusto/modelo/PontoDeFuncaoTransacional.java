package br.com.calculacusto.modelo;

public class PontoDeFuncaoTransacional {
	private String nomeDoCasoDeUso;
	private int numeroDeArquivosReferenciados;
	private int numeroDeItensDeDadosReferenciados;
	private TipoFuncao tipoFuncao;
	
	
	
	public PontoDeFuncaoTransacional(String nomeDoCasoDeUso, int numeroDeArquivosReferenciados,
			int numeroDeItensDeDadosReferenciados, TipoFuncao tipoFuncao) {
		this.nomeDoCasoDeUso = nomeDoCasoDeUso;
		this.numeroDeArquivosReferenciados = numeroDeArquivosReferenciados;
		this.numeroDeItensDeDadosReferenciados = numeroDeItensDeDadosReferenciados;
		this.tipoFuncao = tipoFuncao;
	}
	
	public PontoDeFuncaoTransacional(int numeroDeArquivosReferenciados,
			int numeroDeItensDeDadosReferenciados, TipoFuncao tipoFuncao) {
		this.numeroDeArquivosReferenciados = numeroDeArquivosReferenciados;
		this.numeroDeItensDeDadosReferenciados = numeroDeItensDeDadosReferenciados;
		this.tipoFuncao = tipoFuncao;
	}
	
	public PontoDeFuncaoTransacional(TipoFuncao tipoFuncao) {
		this.tipoFuncao = tipoFuncao;
	}

	public PontoDeFuncaoTransacional(int numeroDeArquivosReferenciados, int numeroDeItensDeDadosReferenciados) {
		this.numeroDeArquivosReferenciados = numeroDeArquivosReferenciados;
		this.numeroDeItensDeDadosReferenciados = numeroDeItensDeDadosReferenciados;
	}
	
	public PontoDeFuncaoTransacional() {
	}

	public int valorDoPontoDeFuncao() {

		if (this.tipoFuncao == TipoFuncao.ENTRADA) {
			return definePontoDeFuncaoDeEntradasExternas();
		}

		if (this.tipoFuncao == TipoFuncao.SAIDA) {
			return definePontoDeFuncaoDeSaidasExternas();
		}

		if (this.tipoFuncao == TipoFuncao.CONSULTA) {
			return definePontoDeFuncaoDeConsultasExternas();
		}

		return 0;
	}

	public Complexidade complexidadeFuncional() {

		if (this.tipoFuncao == TipoFuncao.ENTRADA) {
			return complexidadeFuncionalDeEntradaExterna();
		}

		if ((this.tipoFuncao == TipoFuncao.SAIDA) || (this.tipoFuncao == TipoFuncao.CONSULTA)) {
			return complexidadeFuncionalDeSaidasConsultasExternas();
		}

		return null;
	}

	public Complexidade complexidadeFuncionalDeEntradaExterna() {

		if (this.numeroDeArquivosReferenciados == 0 || this.numeroDeArquivosReferenciados == 1) {

			if (this.numeroDeItensDeDadosReferenciados >= 1 && this.numeroDeItensDeDadosReferenciados <= 4) {
				return Complexidade.SIMPLES;
			} else if (this.numeroDeItensDeDadosReferenciados >= 5 && this.numeroDeItensDeDadosReferenciados <= 15) {
				return Complexidade.SIMPLES;
			} else if (this.numeroDeItensDeDadosReferenciados >= 16) {
				return Complexidade.MEDIO;
			}

		}
		
		if (this.numeroDeArquivosReferenciados == 2) {

			if (this.numeroDeItensDeDadosReferenciados >= 1 && this.numeroDeItensDeDadosReferenciados <= 4) {
				return Complexidade.SIMPLES;
			} else if (this.numeroDeItensDeDadosReferenciados >= 5 && this.numeroDeItensDeDadosReferenciados <= 15) {
				return Complexidade.MEDIO;
			} else if (this.numeroDeItensDeDadosReferenciados >= 16) {
				return Complexidade.COMPLEXO;
			}

		}
		
		if (this.numeroDeArquivosReferenciados >= 3) {

			if (this.numeroDeItensDeDadosReferenciados >= 1 && this.numeroDeItensDeDadosReferenciados <= 4) {
				return Complexidade.MEDIO;
			} else if (this.numeroDeItensDeDadosReferenciados >= 5 && this.numeroDeItensDeDadosReferenciados <= 15) {
				return Complexidade.COMPLEXO;
			} else if (this.numeroDeItensDeDadosReferenciados >= 16) {
				return Complexidade.COMPLEXO;
			}

		}
		
		return null;

	}

	public Complexidade complexidadeFuncionalDeSaidasConsultasExternas() {

		if (this.numeroDeArquivosReferenciados == 0 || this.numeroDeArquivosReferenciados == 1) {
			if (this.numeroDeItensDeDadosReferenciados >= 1 && this.numeroDeItensDeDadosReferenciados <= 5) {
				return Complexidade.SIMPLES;
			} else if (this.numeroDeItensDeDadosReferenciados >= 6 && this.numeroDeItensDeDadosReferenciados <= 19) {
				return Complexidade.SIMPLES;
			} else if (this.numeroDeItensDeDadosReferenciados >= 20) {
				return Complexidade.MEDIO;
			}
		}
		
		if (this.numeroDeArquivosReferenciados == 2 || this.numeroDeArquivosReferenciados == 3) {
			if (this.numeroDeItensDeDadosReferenciados >= 1 && this.numeroDeItensDeDadosReferenciados <= 5) {
				return Complexidade.SIMPLES;
			} else if (this.numeroDeItensDeDadosReferenciados >= 6 && this.numeroDeItensDeDadosReferenciados <= 19) {
				return Complexidade.MEDIO;
			} else if (this.numeroDeItensDeDadosReferenciados >= 20) {
				return Complexidade.COMPLEXO;
			}
		}
		
		if (this.numeroDeArquivosReferenciados > 3) {
			if (this.numeroDeItensDeDadosReferenciados >= 1 && this.numeroDeItensDeDadosReferenciados <= 5) {
				return Complexidade.MEDIO;
			} else if (this.numeroDeItensDeDadosReferenciados >= 6 && this.numeroDeItensDeDadosReferenciados <= 19) {
				return Complexidade.COMPLEXO;
			} else if (this.numeroDeItensDeDadosReferenciados >= 20) {
				return Complexidade.COMPLEXO;
			}
		}

		return null;
	}

	// EE: Entradas Externas
	public int definePontoDeFuncaoDeEntradasExternas() {

		if (complexidadeFuncionalDeEntradaExterna() == Complexidade.SIMPLES) {
			return 3;
		}

		if (complexidadeFuncionalDeEntradaExterna() == Complexidade.MEDIO) {
			return 4;
		}

		if (complexidadeFuncionalDeEntradaExterna() == Complexidade.COMPLEXO) {
			return 6;
		}

		return 0;
	}

	// SE: Saidas Externas
	public int definePontoDeFuncaoDeSaidasExternas() {

		if (complexidadeFuncionalDeSaidasConsultasExternas() == Complexidade.SIMPLES) {
			return 4;
		}

		if (complexidadeFuncionalDeSaidasConsultasExternas() == Complexidade.MEDIO) {
			return 5;
		}

		if (complexidadeFuncionalDeSaidasConsultasExternas() == Complexidade.COMPLEXO) {
			return 7;
		}

		return 0;
	}

	// CE: Consutlas externas
	public int definePontoDeFuncaoDeConsultasExternas() {

		if (complexidadeFuncionalDeSaidasConsultasExternas() == Complexidade.SIMPLES) {
			return 3;
		}

		if (complexidadeFuncionalDeSaidasConsultasExternas() == Complexidade.MEDIO) {
			return 4;
		}

		if (complexidadeFuncionalDeSaidasConsultasExternas() == Complexidade.COMPLEXO) {
			return 6;
		}

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
