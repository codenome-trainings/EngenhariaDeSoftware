package br.com.calculacusto.modelo;

public class Funcao {
	
	private int referencia;
	private int itens;

	// Tabela de Identificação da complexidade de Entradas Externas
	public String calculaComplexidadeDeEntradasExternas() {

		if (this.referencia == 0 || this.referencia == 1) {
			if (this.itens >= 1 && this.itens <= 4) {
				return "Simples";
			} else if (this.itens >= 5 && this.itens <= 15) {
				return "Simples";
			} else if (this.itens >= 16) {
				return "Média";
			}
		} else if (this.referencia == 2) {
			if (this.itens >= 1 && this.itens <= 4) {
				return "Simples";
			} else if (this.itens >= 5 && this.itens <= 15) {
				return "Média";
			} else if (this.itens >= 16) {
				return "Complexa";
			}
		} else if (this.referencia > 3) {
			if (this.itens >= 1 && this.itens <= 4) {
				return "Média";
			} else if (this.itens >= 5 && this.itens <= 15) {
				return "Complexa";
			} else if (this.itens >= 16) {
				return "Complexa";
			}
		}
		return null;
	}

	// Tabela de identificação da complexidade de saídas e consultas externas
	public String calculaComplexidadeDeSaidasEConsultasExternas() {
		if (this.referencia == 0 || this.referencia == 1) {
			if (this.itens >= 1 && this.itens <= 5) {
				return "Simples";
			} else if (this.itens >= 6 && this.itens <= 19) {
				return "Simples";
			} else if (this.itens >= 20) {
				return "Média";
			}
		} else if (this.referencia == 2 || this.referencia == 3) {
			if (this.itens >= 1 && this.itens <= 5) {
				return "Simples";
			} else if (this.itens >= 6 && this.itens <= 19) {
				return "Média";
			} else if (this.itens >= 20) {
				return "Complexa";
			}
		} else if (this.referencia > 3) {
			if (this.itens >= 1 && this.itens <= 5) {
				return "Média";
			} else if (this.itens >= 6 && this.itens <= 19) {
				return "Complexa";
			} else if (this.itens >= 20) {
				return "Complexa";
			}
		}

		return null;
	}
	
	public int getReferencia() {
		return referencia;
	}

	public void setReferencia(int referencia) {
		this.referencia = referencia;
	}

	public int getItens() {
		return itens;
	}

	public void setItens(int itens) {
		this.itens = itens;
	}

	// EE: Entradas Externas
	public int definePontoDeFuncaoDeEntradasExternas() {

		if (calculaComplexidadeDeEntradasExternas().equals("Simples")) {
			return 3;
		} else if (calculaComplexidadeDeEntradasExternas().equals("Média")) {
			return 4;
		} else if (calculaComplexidadeDeEntradasExternas().equals("Complexa")) {
			return 6;
		}

		return 0;
	}
	
	//SE: Saidas Externas
	public int definePontoDeFuncaoDeSaidasExternas() {

		if (calculaComplexidadeDeEntradasExternas().equals("Simples")) {
			return 4;
		} else if (calculaComplexidadeDeEntradasExternas().equals("Média")) {
			return 5;
		} else if (calculaComplexidadeDeEntradasExternas().equals("Complexa")) {
			return 7;
		}

		return 0;
	}
	
	//CE: Consutlas externas
	public int definePontoDeFuncaoDeConsultasExternas() {

		if (calculaComplexidadeDeEntradasExternas().equals("Simples")) {
			return 3;
		} else if (calculaComplexidadeDeEntradasExternas().equals("Média")) {
			return 4;
		} else if (calculaComplexidadeDeEntradasExternas().equals("Complexa")) {
			return 6;
		}

		return 0;
	}
	
	
}
