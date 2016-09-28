package br.com.calculacusto.modelo;

public class Dados {
	
	private int registro;
	private int itens;
	
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
	
}
