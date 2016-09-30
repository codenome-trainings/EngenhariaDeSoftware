package br.com.calculacusto.modelo.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.calculacusto.dao.LinguagemDeProgramacaoDao;
import br.com.calculacusto.modelo.Dados;
import br.com.calculacusto.modelo.Funcao;
import br.com.calculacusto.modelo.LinguagemDeProgramacao;
import br.com.calculacusto.modelo.Projeto;
import br.com.calculacusto.modelo.TipoDado;
import br.com.calculacusto.modelo.TipoFuncao;

public class Menu {
	
	Scanner entrada;
	Projeto projeto = new Projeto();

	public void menuPrincipal() throws Exception {
		entrada = new Scanner(System.in);
		int escolha;
		System.out.println("-----MENU PRINCIPAL-----");
		System.out.println("1. Configuração do projeto");
		System.out.println("2. Adiciona dados");
		System.out.println("3. Adiciona Entrada/Saida/Consulta");
		System.out.println("4. Preenche Nit");
		System.out.println("4. Dados Financeiros");
		System.out.println("6. Exibir Relatório");
		System.out.println("0. Sair");
		System.out.printf("Digite sua opção: ");
		escolha = entrada.nextInt();
		
		switch(escolha) {
		case 0:
			return;
		case 1:
			configuracaoDoProjeto();
			break;
		case 2:
			adicionaDados();
			break;
		case 3:
			adicionaESC();
			break;
		case 4:
			PreencheNit();
			break;
		case 5:
			dadosFinanceiros();
			break;
		case 6:
			relatorio();
		default:
			System.out.println("Opção inválida. Tente novamente...");
				
		}
		
		menuPrincipal();
	}
	
	public void relatorio() throws Exception {
		System.out.println("------------");		
		System.out.println("RELATÓRIO");
		System.out.println("------------");
		System.out.println("Ponto de Função Bruta: " + projeto.calculaPontoDeFuncaoBruta());
		System.out.println("Nivel de Influência Total: " + projeto.getNit());
		System.out.println("Ponto de Função: " + projeto.getPontoDeFuncao());
		System.out.println("Valor Fator de Ajuste: " + projeto.getFatorDeAjuste());
		System.out.println("Linhas aproximadas: " + projeto.kaloc());
		System.out.println("Esforço: " + projeto.getEsforco());
		System.out.println("Tempo: " + projeto.getTempo());
		System.out.println("Pessoas: " + projeto.getPessoa());
		System.out.println("Hora Homem: " + projeto.getHh());
		System.out.println("Custo: " + projeto.getCusto());
		System.out.println("Valor de venda: " + projeto.getValorDeVenda());
		System.out.println("Lucro: " + projeto.getLucro());
		System.out.println("------------");
	}

	public void dadosFinanceiros() {
		entrada = new Scanner(System.in);
		System.out.println("----Dados Financeiros----");
		System.out.printf("Digite o HH do Profissional: ");
		projeto.setHh(entrada.nextDouble());
	}

	public void PreencheNit() {
		entrada = new Scanner(System.in);
		List<Double> nits = new ArrayList<>();
		
		System.out.println("Comunicação de Dados");
		nits.add(entrada.nextDouble());
		System.out.println("Processamento de Dados Distribuído");
		nits.add(entrada.nextDouble());
		System.out.println("Utilização do Equipamento");
		nits.add(entrada.nextDouble());
		System.out.println("Volume de Transações");
		nits.add(entrada.nextDouble());
		System.out.println("Entrada de Dados On-line");
		nits.add(entrada.nextDouble());
		System.out.println("Eficiência do Usuário Final");
		nits.add(entrada.nextDouble());
		System.out.println("Atualização online");
		nits.add(entrada.nextDouble());
		System.out.println("Processamento Complexo");
		nits.add(entrada.nextDouble());
		System.out.println("Reusabilidade");
		nits.add(entrada.nextDouble());
		System.out.println("Facilidade de Implantação");
		nits.add(entrada.nextDouble());
		System.out.println("Facilidade Operacional");
		nits.add(entrada.nextDouble());
		System.out.println("Múltiplos Locais e Organizações do Usuário");
		nits.add(entrada.nextDouble());
		System.out.println("Facilidade de Mudanças");
		nits.add(entrada.nextDouble());
		
		projeto.setNit((int) calculaNit(nits));
		
		
	}

	public double calculaNit(List<Double> nits) {
		
		double soma = 0;
		
		for (Double nit : nits) {
			soma += nit;
		}
		
		return soma;
	}

	public void adicionaESC() throws Exception {
		entrada = new Scanner(System.in);
		String nomeDoCaso;
		int registros;
		int itens;
		TipoFuncao tipoDeArquivo = null;
		int pontoDeFuncao;
		boolean continua = true;
		
		while(continua) {
			System.out.printf("Nome do caso: ");
			nomeDoCaso = entrada.nextLine();
			System.out.printf("Registros: ");
			registros = entrada.nextInt();
			System.out.printf("Itens");
			itens = entrada.nextInt();
			
			int escolha = 0;
			while(!(escolha == 1 || escolha == 2)) {
				System.out.println("\n\nTipo de Arquivo");
				System.out.println("1. Entrada Externo");
				System.out.println("2. Saída Externa");
				System.out.println("3. Consulta Externa");
				escolha = entrada.nextInt();
				if(escolha == 1) {
					tipoDeArquivo = TipoFuncao.ENTRADA;
					break;
				} else if(escolha == 2) {
					tipoDeArquivo = TipoFuncao.SAIDA;
					break;
				} else if (escolha == 3) {
					tipoDeArquivo = TipoFuncao.CONSULTA;
				} else {
					throw new Exception("Tipo de Arquivo ESC Não selecionado!");
				}
			}
			
			Funcao funcao = new Funcao(nomeDoCaso, registros, itens, tipoDeArquivo);
			funcao.adicionaPontoDeFuncao(funcao.calculaPontoDeFuncao());
			
			System.out.println("Deseja adicionar mais classes: [1]SIM | [2]NÃO");
			escolha = entrada.nextInt();
			if(escolha == 2) continua = false;
		}
	}

	public void adicionaDados() throws Exception {
		entrada = new Scanner(System.in);
		String nomeDaClasse;
		int registros;
		int itens;
		TipoDado tipoDeArquivo = null;
		int pontoDeFuncao;
		boolean continua = true;
		
		while(continua) {
			System.out.printf("Nome da Classe: ");
			nomeDaClasse = entrada.nextLine();
			System.out.printf("Quantidades registros: ");
			registros = entrada.nextInt();
			System.out.printf("Itens");
			itens = entrada.nextInt();
			
			int escolha = 0;
			while(!(escolha == 1 || escolha == 2)) {
				System.out.println("\n\nTipo de Arquivo");
				System.out.println("1. Arquivo Lógico Interno");
				System.out.println("2. Arquivo Lógico Externo");
				escolha = entrada.nextInt();
				if(escolha == 1) {
					tipoDeArquivo = TipoDado.INTERNO;
					break;
				} else if(escolha == 2) {
					tipoDeArquivo = TipoDado.EXTERNO;
					break;
				} else {
					throw new Exception("Tipo de arquivo ALI e AIE não selecionado");
				}
			}
			
			Dados dados = new Dados(nomeDaClasse, registros, itens, tipoDeArquivo);
			dados.adicionaPontoDeFuncao(dados.calculaPontoDeFuncao());
			
			System.out.println("Deseja adicionar mais classes: [1]SIM | [2]NÃO");
			escolha = entrada.nextInt();
			if(escolha == 2) {
				continua = false;
			}
		}
	}

	public void configuracaoDoProjeto() throws Exception {
		entrada = new Scanner(System.in);
		System.out.printf("Nome do projeto: ");
		String nomeDoProjeto = entrada.nextLine();
		projeto.setNome(nomeDoProjeto);
		
		LinguagemDeProgramacaoDao linguagemDeProgramacaoDao = new LinguagemDeProgramacaoDao();
		LinguagemDeProgramacao linguagem;
		
		boolean achaLinguagem = false;
		while(!achaLinguagem) {
			System.out.printf("Linguagem: ");
			String busca = entrada.nextLine();
			linguagem = linguagemDeProgramacaoDao.buscaPorNome(busca);
			if(linguagem != null) {
				System.out.println("Linguagem Encontrada");
				projeto.setNomeDaLinguagem(busca);
				achaLinguagem = true;
			} else {
				throw new Exception("Linguagem não encontrada");
			}
		}
		
		System.out.println("-----Escolha a medida-----");
		System.out.println("1. Média");
		System.out.println("2. Mediana");
		System.out.println("3. Menor");
		System.out.println("4. Maior");
		
		System.out.printf("Digite sua opção: ");
		int escolha = entrada.nextInt();
		
		switch(escolha) {
		case 1:
			projeto.setMedida("media");
			break;
		case 2:
			projeto.setMedida("mediana");
			break;
		case 3:
			projeto.setMedida("menor");
			break;
		case 4:
			projeto.setMedida("maior");
			break;
		default:
			System.out.println("Opção inválida!");
		}
		
	}
}
