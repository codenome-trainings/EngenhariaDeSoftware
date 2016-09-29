package br.com.calculacusto.modelo;

import br.com.calculacusto.dao.DadosFuncaoDao;
import br.com.calculacusto.dao.LinguagemDeProgramacaoDao;

public class Dados extends DadosFuncao {
	
	private String tipoDeArquivo;
	
	DadosFuncaoDao dadosFuncaoDao = new DadosFuncaoDao();
	DadosFuncao dadosFuncao;
	
	public Dados(String nomeDaClasse, int registros, int itens, String tipoDeArquivo) {
		setNome(nomeDaClasse);
		setRegistro(registros);
		setItens(itens);
		this.tipoDeArquivo = tipoDeArquivo;
	}
	
	public void escolheTipoDeArquivo() {
		
	}

		// Tabela de Identificação da Complexidade dos dados
		public Classificacao calculaComplexidadeDeDados() {
			if (getRegistro() == 1) {
				if (getItens() >= 1 && getItens() <= 19) {
					return Classificacao.SIMPLES;
				} else if (getItens() >= 20 && getItens() <= 50) {
					return Classificacao.SIMPLES;
				} else if (getItens() > 50) {
					return Classificacao.MEDIO;
				}
			} else if (getRegistro() >= 2 && getRegistro() <= 5) {
				if (getItens() >= 1 && getItens() <= 19) {
					return Classificacao.SIMPLES;
				} else if (getItens() >= 20 && getItens() <= 50) {
					return Classificacao.MEDIO;
				} else if (getItens() > 50) {
					return Classificacao.COMPLEXO;
				}
			} else if (getRegistro() >= 6) {
				if (getItens() >= 1 && getItens() <= 19) {
					return Classificacao.MEDIO;
				} else if (getItens() >= 20 && getItens() <= 50) {
					return Classificacao.COMPLEXO;
				} else if (getItens() > 50) {
					return Classificacao.COMPLEXO;
				}
			}
			return null;
		}

		// ALI: Arquivo Lógico Interno
		public int defineValorPontoDeFuncaoInterno() {

			if (this.calculaComplexidadeDeDados().equals(Classificacao.SIMPLES)) {
				return 7;
			} else if (this.calculaComplexidadeDeDados().equals(Classificacao.MEDIO)) {
				return 10;
			} else if (this.calculaComplexidadeDeDados().equals(Classificacao.COMPLEXO)) {
				return 15;
			}

			return 0;
		}

		// ALE: Arquivo de Interface Externa
		public int defineValorPontoDeFuncaoExterno() {
			if (this.calculaComplexidadeDeDados().equals(Classificacao.SIMPLES)) {
				return 5;
			} else if (this.calculaComplexidadeDeDados().equals(Classificacao.MEDIO)) {
				return 7;
			} else if (this.calculaComplexidadeDeDados().equals(Classificacao.COMPLEXO)) {
				return 10;
			}

			return 0;
		}
	
}
