package Controlador;

import java.util.Scanner;

public class Menu {

	Scanner entrada;

	public Menu() {
		super();

		this.entrada = new Scanner(System.in);

	}

	public void printBemvindo() {

		System.out.println(" ________________________________________________________________");
		System.out.println("|                                                                |");
		System.out.println("|    Bem-vindo ao Sistema de Soluções de Centrais Telefônicas    |");
		System.out.println("|________________________________________________________________|");

	}

	public void listarMenu() {

		/*
		 * o sistema irá mostrar o menu e executar a opção digitada, sempre irá
		 * apresentar o menu após a execução, a não ser que a opção digitada for para
		 * finalizar o programa ou algum inteiro inválido
		 */
		while (this.printMenu()) {

		}

	}

	public boolean printMenu() {

		boolean ativo = true; // variável que controla o looping do menu

		System.out.println("");
		System.out.println("Menu do sistema:");
		System.out.println("(C) Cadastrar uma central telefônica");
		System.out.println("(L) Listar centrais telefônicas");
		System.out.println("(R) Consultar solução");
		System.out.println("(F) SAIR\n");

		System.out.println("Digite uma das opções de menu:");
		String menu = this.entrada.next();

		switch (menu.toUpperCase()) {
//		 o usuário tem que digitar a letra C para abrir o formulário de central
//		 telefônica
		case "C":
			this.cadastrarCentralTelefonica();
			break;
//		 o usuário tem que digitar a letra L para listar as centrais telefônicas
//		 cadastradas
		case "L":
			this.listarCentralTelefonica();
			break;
//		 o usuário tem que digitar a letra R busca por soluções
		case "R":
			this.consultarSolucao();
			break;
//		 o usuário tem que digitar a letra F fechar o programa
		case "F":
			this.sair();
			ativo = false;
			break;
		default:
//			Caso o usuário digite uma letra diferente das citadas acima o 
//			programa imprimi uma mensagem de erro
			System.err.println("Opção digitada inválida!");
			break;
		}

		return ativo;

	}

	private void cadastrarCentralTelefonica() {
//		instancia classe do formulário de central telefônica
		FormCentralTelefonica form = new FormCentralTelefonica();
//		Abre formulário para o usuário dar entrada nos campos
		form.formulario();

	}

	private void listarCentralTelefonica() {
//		instancia classe do formulário de central telefônica
		FormCentralTelefonica form = new FormCentralTelefonica();
		form.printCentrais();

	}

	private void consultarSolucao() {
//		instancia classe da solução
		Solucao solucao = new Solucao();
//		Abre formulário de perguntas para que o sistema identifique 
//		as melhores soluçãos baseadas no que o usuário digitou
		solucao.pergunta();

	}

	private void sair() {

		System.out.println("Fim do programa!");

	}

}
