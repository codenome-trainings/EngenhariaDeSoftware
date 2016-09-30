package br.com.calculacusto.modelo;

import java.util.ArrayList;
import java.util.List;

public class Funcao extends DadosFuncao {
	
	private List<Integer> pontosDeFuncoes = new ArrayList<>();
	private TipoFuncao tipoDeArquivo;
	
	public Funcao(String nomeDaClasse, int registros, int itens, TipoFuncao tipoDeArquivo) {
		setNome(nomeDaClasse);
		setRegistro(registros);
		setItens(itens);
		this.tipoDeArquivo = tipoDeArquivo;
	}
	
	public void adicionaPontoDeFuncao(int pontoDeFuncao) {
		this.pontosDeFuncoes.add(pontoDeFuncao);
	}
	
	public int calculaPontoDeFuncao() throws Exception {
		if (this.tipoDeArquivo == TipoFuncao.ENTRADA) {
			return definePontoDeFuncaoDeEntradasExternas();
		} else if(this.tipoDeArquivo == TipoFuncao.SAIDA){
			return definePontoDeFuncaoDeSaidasExternas();
		} else if(this.tipoDeArquivo == TipoFuncao.CONSULTA) {
			return definePontoDeFuncaoDeConsultasExternas();
		} else {
			throw new Exception("Tipo de arquivo não definido!");
		}
	}
	
	public int totalPontoDeFuncaoPF2() {
		int total = 0;
		for (Integer pontoDeFuncao : pontosDeFuncoes) {
			total += (int) pontoDeFuncao;
		}
		return total;
	}
	
	// Tabela de Identificação da complexidade de Entradas Externas
	public Complexidade calculaComplexidadeDeEntradasExternas() {

		if (getReferencia() == 0 || getReferencia() == 1) {
			if (getItens() >= 1 && getItens() <= 4) {
				return Complexidade.SIMPLES;
			} else if (getItens() >= 5 && getItens() <= 15) {
				return Complexidade.SIMPLES;
			} else if (getItens() >= 16) {
				return Complexidade.MEDIO;
			}
		} else if (getReferencia() == 2) {
			if (getItens() >= 1 && getItens() <= 4) {
				return Complexidade.SIMPLES;
			} else if (getItens() >= 5 && getItens() <= 15) {
				return Complexidade.MEDIO;
			} else if (getItens() >= 16) {
				return Complexidade.COMPLEXO;
			}
		} else if (getReferencia() > 3) {
			if (getItens() >= 1 && getItens() <= 4) {
				return Complexidade.MEDIO;
			} else if (getItens() >= 5 && getItens() <= 15) {
				return Complexidade.COMPLEXO;
			} else if (getItens() >= 16) {
				return Complexidade.COMPLEXO;
			}
		}
		return null;
	}

	// Tabela de identificação da complexidade de saídas e consultas externas
	public Complexidade calculaComplexidadeDeSaidasEConsultasExternas() {
		if (getReferencia() == 0 || getReferencia() == 1) {
			if (getItens() >= 1 && getItens() <= 5) {
				return Complexidade.SIMPLES;
			} else if (getItens() >= 6 && getItens() <= 19) {
				return Complexidade.SIMPLES;
			} else if (getItens() >= 20) {
				return Complexidade.MEDIO;
			}
		} else if (getReferencia() == 2 || getReferencia() == 3) {
			if (getItens() >= 1 && getItens() <= 5) {
				return Complexidade.SIMPLES;
			} else if (getItens() >= 6 && getItens() <= 19) {
				return Complexidade.MEDIO;
			} else if (getItens() >= 20) {
				return Complexidade.COMPLEXO;
			}
		} else if (getReferencia() > 3) {
			if (getItens() >= 1 && getItens() <= 5) {
				return Complexidade.MEDIO;
			} else if (getItens() >= 6 && getItens() <= 19) {
				return Complexidade.COMPLEXO;
			} else if (getItens() >= 20) {
				return Complexidade.COMPLEXO;
			}
		}

		return null;
	}

	// EE: Entradas Externas
	public int definePontoDeFuncaoDeEntradasExternas() {

		if (calculaComplexidadeDeEntradasExternas().equals(Complexidade.SIMPLES)) {
			return 3;
		} else if (calculaComplexidadeDeEntradasExternas().equals(Complexidade.MEDIO)) {
			return 4;
		} else if (calculaComplexidadeDeEntradasExternas().equals(Complexidade.COMPLEXO)) {
			return 6;
		}

		return 0;
	}
	
	//SE: Saidas Externas
	public int definePontoDeFuncaoDeSaidasExternas() {

		if (calculaComplexidadeDeEntradasExternas().equals(Complexidade.SIMPLES)) {
			return 4;
		} else if (calculaComplexidadeDeEntradasExternas().equals(Complexidade.MEDIO)) {
			return 5;
		} else if (calculaComplexidadeDeEntradasExternas().equals(Complexidade.COMPLEXO)) {
			return 7;
		}

		return 0;
	}
	
	//CE: Consutlas externas
	public int definePontoDeFuncaoDeConsultasExternas() {

		if (calculaComplexidadeDeEntradasExternas().equals(Complexidade.SIMPLES)) {
			return 3;
		} else if (calculaComplexidadeDeEntradasExternas().equals(Complexidade.MEDIO)) {
			return 4;
		} else if (calculaComplexidadeDeEntradasExternas().equals(Complexidade.COMPLEXO)) {
			return 6;
		}

		return 0;	
	}
	
	
}
