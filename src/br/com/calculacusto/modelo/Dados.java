package br.com.calculacusto.modelo;

import java.util.ArrayList;
import java.util.List;

public class Dados extends DadosFuncao {

	private TipoDado tipoDeArquivo;
	private List<Integer> pontosDeFuncoes = new ArrayList<>();

	public Dados(String nomeDaClasse, int registros, int itens, TipoDado tipoDeArquivo) {
		setNome(nomeDaClasse);
		setRegistro(registros);
		setItens(itens);
		this.setTipoDeArquivo(tipoDeArquivo);
	}
	
	public void adicionaPontoDeFuncao(int pontoDeFuncao) {
		this.pontosDeFuncoes.add(pontoDeFuncao);
	}
	
	public int calculaPontoDeFuncao() throws Exception {
		if (this.tipoDeArquivo == TipoDado.INTERNO) {
			return defineValorPontoDeFuncaoInterno();
		} else if(this.tipoDeArquivo == TipoDado.EXTERNO){
			return defineValorPontoDeFuncaoExterno();
		} else {
			throw new Exception("Tipo de arquivo não definido!");
		}
	}
	
	public int totalPontoDeFuncaoPF1() {
		int total = 0;
		for (Integer pontoDeFuncao : pontosDeFuncoes) {
			total += (int) pontoDeFuncao;
		}
		return total;
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

	

	public TipoDado getTipoDeArquivo() {
		return tipoDeArquivo;
	}

	public void setTipoDeArquivo(TipoDado tipoDeArquivo) {
		this.tipoDeArquivo = tipoDeArquivo;
	}

	public List<Integer> getPontosDeFuncoes() {
		return pontosDeFuncoes;
	}

	public void setPontosDeFuncoes(List<Integer> pontosDeFuncoes) {
		this.pontosDeFuncoes = pontosDeFuncoes;
	}

}
