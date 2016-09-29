package br.com.calculacusto.modelo.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.calculacusto.dao.LinguagemDeProgramacaoDao;
import br.com.calculacusto.modelo.Dados;
import br.com.calculacusto.modelo.LinguagemDeProgramacao;
import br.com.calculacusto.modelo.Projeto;

public class Menu {
	
	Scanner entrada = new Scanner(System.in);
	Projeto projeto = new Projeto();

	public void menuPrincipal() {
		
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
	
	public void relatorio() {

	}

	public void dadosFinanceiros() {
		System.out.println("----Dados Financeiros----");
		System.out.printf("Digite o HH do Profissional: ");
		projeto.setHh(entrada.nextDouble());
	}

	public void PreencheNit() {
		
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

	public void adicionaESC() {

		String nomeDoCaso;
		int registros;
		int itens;
		String tipoDeArquivo;
		
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
					tipoDeArquivo = "EE";
					break;
				} else if(escolha == 2) {
					tipoDeArquivo = "SE";
					break;
				} else if (escolha == 3) {
					tipoDeArquivo = "CE";
				} else {
					System.out.println("Tipo de arquivo não selecionado");
				}
			}
			
			/*
			 * Adicionar esses dados no BDD Simuladon
			 */
			
			System.out.println("Deseja adicionar mais classes: [1]SIM | [2]NÃO");
			escolha = entrada.nextInt();
			if(escolha == 2) continua = false;
		}
	}

	public void adicionaDados() {

		String nomeDaClasse;
		int registros;
		int itens;
		String tipoDeArquivo = null;
		
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
					tipoDeArquivo = "ALI";
					break;
				} else if(escolha == 2) {
					tipoDeArquivo = "ALE";
					break;
				} else {
					System.out.println("Tipo de arquivo não selecionado");
				}
			}
			
			
			
			new Dados(nomeDaClasse, registros, itens, tipoDeArquivo);
			
			System.out.println("Deseja adicionar mais classes: [1]SIM | [2]NÃO");
			escolha = entrada.nextInt();
			if(escolha == 2) {
				continua = false;
			}
		}
	}

	public void configuracaoDoProjeto() {
		
		System.out.printf("Nome do projeto: ");
		projeto.setNome(entrada.nextLine());
		
		LinguagemDeProgramacaoDao linguagemDeProgramacaoDao = new LinguagemDeProgramacaoDao();
		LinguagemDeProgramacao linguagem;
		
		boolean achaLinguagem = false;
		while(!achaLinguagem) {
			System.out.printf("Linguagem: ");
			String busca = entrada.nextLine();
			if(linguagemDeProgramacaoDao.buscaPorNome(busca).equals(busca)) {
				System.out.println("Linguagem Encontrada");
				projeto.setNomeDaLinguagem(busca);
				achaLinguagem = true;
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
