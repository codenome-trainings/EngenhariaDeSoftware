package br.com.calculacusto.modelo;

public class Funcao extends DadosFuncao {
	


	// Tabela de Identificação da complexidade de Entradas Externas
	public Classificacao calculaComplexidadeDeEntradasExternas() {

		if (getReferencia() == 0 || getReferencia() == 1) {
			if (getItens() >= 1 && getItens() <= 4) {
				return Classificacao.SIMPLES;
			} else if (getItens() >= 5 && getItens() <= 15) {
				return Classificacao.SIMPLES;
			} else if (getItens() >= 16) {
				return Classificacao.MEDIO;
			}
		} else if (getReferencia() == 2) {
			if (getItens() >= 1 && getItens() <= 4) {
				return Classificacao.SIMPLES;
			} else if (getItens() >= 5 && getItens() <= 15) {
				return Classificacao.MEDIO;
			} else if (getItens() >= 16) {
				return Classificacao.COMPLEXO;
			}
		} else if (getReferencia() > 3) {
			if (getItens() >= 1 && getItens() <= 4) {
				return Classificacao.MEDIO;
			} else if (getItens() >= 5 && getItens() <= 15) {
				return Classificacao.COMPLEXO;
			} else if (getItens() >= 16) {
				return Classificacao.COMPLEXO;
			}
		}
		return null;
	}

	// Tabela de identificação da complexidade de saídas e consultas externas
	public Classificacao calculaComplexidadeDeSaidasEConsultasExternas() {
		if (getReferencia() == 0 || getReferencia() == 1) {
			if (getItens() >= 1 && getItens() <= 5) {
				return Classificacao.SIMPLES;
			} else if (getItens() >= 6 && getItens() <= 19) {
				return Classificacao.SIMPLES;
			} else if (getItens() >= 20) {
				return Classificacao.MEDIO;
			}
		} else if (getReferencia() == 2 || getReferencia() == 3) {
			if (getItens() >= 1 && getItens() <= 5) {
				return Classificacao.SIMPLES;
			} else if (getItens() >= 6 && getItens() <= 19) {
				return Classificacao.MEDIO;
			} else if (getItens() >= 20) {
				return Classificacao.COMPLEXO;
			}
		} else if (getReferencia() > 3) {
			if (getItens() >= 1 && getItens() <= 5) {
				return Classificacao.MEDIO;
			} else if (getItens() >= 6 && getItens() <= 19) {
				return Classificacao.COMPLEXO;
			} else if (getItens() >= 20) {
				return Classificacao.COMPLEXO;
			}
		}

		return null;
	}

	// EE: Entradas Externas
	public int definePontoDeFuncaoDeEntradasExternas() {

		if (calculaComplexidadeDeEntradasExternas().equals(Classificacao.SIMPLES)) {
			return 3;
		} else if (calculaComplexidadeDeEntradasExternas().equals(Classificacao.MEDIO)) {
			return 4;
		} else if (calculaComplexidadeDeEntradasExternas().equals(Classificacao.COMPLEXO)) {
			return 6;
		}

		return 0;
	}
	
	//SE: Saidas Externas
	public int definePontoDeFuncaoDeSaidasExternas() {

		if (calculaComplexidadeDeEntradasExternas().equals(Classificacao.SIMPLES)) {
			return 4;
		} else if (calculaComplexidadeDeEntradasExternas().equals(Classificacao.MEDIO)) {
			return 5;
		} else if (calculaComplexidadeDeEntradasExternas().equals(Classificacao.COMPLEXO)) {
			return 7;
		}

		return 0;
	}
	
	//CE: Consutlas externas
	public int definePontoDeFuncaoDeConsultasExternas() {

		if (calculaComplexidadeDeEntradasExternas().equals(Classificacao.SIMPLES)) {
			return 3;
		} else if (calculaComplexidadeDeEntradasExternas().equals(Classificacao.MEDIO)) {
			return 4;
		} else if (calculaComplexidadeDeEntradasExternas().equals(Classificacao.COMPLEXO)) {
			return 6;
		}

		return 0;
	}
	
	
}
