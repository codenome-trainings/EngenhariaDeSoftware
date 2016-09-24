package br.com.calculacusto.modelo;

import java.util.Vector;

public class DadosFuncao {

	private String nome;
	private int registro;
	private int itens;
	private int pontoDeFuncao;
	
	
	// Tabela de Identificação da Complexidade dos dados
	public String calculaComplexidadeDeDados() {

		if (this.registro == 1) {
			if (this.itens >= 1 && this.itens <= 19) {
				return "Simples";
			} else if (this.itens >= 20 && this.itens <= 50) {
				return "Simples";
			} else if (this.itens > 50) {
				return "Média";
			}
		} else if (this.registro >= 2 && this.registro <= 5) {
			if (this.itens >= 1 && this.itens <= 19) {
				return "Simples";
			} else if (this.itens >= 20 && this.itens <= 50) {
				return "Média";
			} else if (this.itens > 50) {
				return "Complexa";
			}
		} else if (this.registro >= 6) {
			if (this.itens >= 1 && this.itens <= 19) {
				return "Média";
			} else if (this.itens >= 20 && this.itens <= 50) {
				return "Complexa";
			} else if (this.itens > 50) {
				return "Complexa";
			}
		}

		return null;

	}

	// ALI: Arquivo Lógico Interno
	public int defineValorPontoDeFuncaoInterno() {

		if (this.calculaComplexidadeDeDados().equals("Simples")) {
			return 7;
		} else if (this.calculaComplexidadeDeDados().equals("Média")) {
			return 10;
		} else if (this.calculaComplexidadeDeDados().equals("Complexa")) {
			return 15;
		}

		return 0;
	}

	// ALE: Arquivo de Interface Externa
	public int defineValorPontoDeFuncaoExterno() {
		if (this.calculaComplexidadeDeDados().equals("Simples")) {
			return 5;
		} else if (this.calculaComplexidadeDeDados().equals("Média")) {
			return 7;
		} else if (this.calculaComplexidadeDeDados().equals("Complexa")) {
			return 10;
		}

		return 0;
	}

	// -------------------------------------------------------------------------------------

	int referencia;

	// Tabela de Identificação da coplexidade de Entradas Externas
	public String calculaComplexidadeDeEntradasExternas() {

		if (referencia == 0 || referencia == 1) {
			if (itens >= 1 && itens <= 4) {
				return "Simples";
			} else if (itens >= 5 && itens <= 15) {
				return "Simples";
			} else if (itens >= 16) {
				return "Média";
			}
		} else if (referencia == 2) {
			if (itens >= 1 && itens <= 4) {
				return "Simples";
			} else if (itens >= 5 && itens <= 15) {
				return "Média";
			} else if (itens >= 16) {
				return "Complexa";
			}
		} else if (referencia > 3) {
			if (itens >= 1 && itens <= 4) {
				return "Média";
			} else if (itens >= 5 && itens <= 15) {
				return "Complexa";
			} else if (itens >= 16) {
				return "Complexa";
			}
		}
		return null;
	}

	// Tabela de identificação da complexidade de saídas e consultas externas
	public String calculaComplexidadeDeSaidasEConsultasExternas(int referencia, int itens) {
		if (referencia == 0 || referencia == 1) {
			if (itens >= 1 && itens <= 5) {
				return "Simples";
			} else if (itens >= 6 && itens <= 19) {
				return "Simples";
			} else if (itens >= 20) {
				return "Média";
			}
		} else if (referencia == 2 || referencia == 3) {
			if (itens >= 1 && itens <= 5) {
				return "Simples";
			} else if (itens >= 6 && itens <= 19) {
				return "Média";
			} else if (itens >= 20) {
				return "Complexa";
			}
		} else if (referencia > 3) {
			if (itens >= 1 && itens <= 5) {
				return "Média";
			} else if (itens >= 6 && itens <= 19) {
				return "Complexa";
			} else if (itens >= 20) {
				return "Complexa";
			}
		}

		return null;
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
