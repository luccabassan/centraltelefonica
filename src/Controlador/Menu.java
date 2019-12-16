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
		System.out.println("|    Bem-vindo ao Sistema de Solu��es de Centrais Telef�nicas    |");
		System.out.println("|________________________________________________________________|");

	}

	public void listarMenu() {

		/*
		 * o sistema ir� mostrar o menu e executar a op��o digitada, sempre ir�
		 * apresentar o menu ap�s a execu��o, a n�o ser que a op��o digitada for para
		 * finalizar o programa ou algum inteiro inv�lido
		 */
		while (this.printMenu()) {

		}

	}

	public boolean printMenu() {

		boolean ativo = true; // vari�vel que controla o looping do menu

		System.out.println("");
		System.out.println("Menu do sistema:");
		System.out.println("(C) Cadastrar uma central telef�nica");
		System.out.println("(L) Listar centrais telef�nicas");
		System.out.println("(R) Consultar solu��o");
		System.out.println("(F) SAIR\n");

		System.out.println("Digite uma das op��es de menu:");
		String menu = this.entrada.next();

		switch (menu.toUpperCase()) {
//		 o usu�rio tem que digitar a letra C para abrir o formul�rio de central
//		 telef�nica
		case "C":
			this.cadastrarCentralTelefonica();
			break;
//		 o usu�rio tem que digitar a letra L para listar as centrais telef�nicas
//		 cadastradas
		case "L":
			this.listarCentralTelefonica();
			break;
//		 o usu�rio tem que digitar a letra R busca por solu��es
		case "R":
			this.consultarSolucao();
			break;
//		 o usu�rio tem que digitar a letra F fechar o programa
		case "F":
			this.sair();
			ativo = false;
			break;
		default:
//			Caso o usu�rio digite uma letra diferente das citadas acima o 
//			programa imprimi uma mensagem de erro
			System.err.println("Op��o digitada inv�lida!");
			break;
		}

		return ativo;

	}

	private void cadastrarCentralTelefonica() {
//		instancia classe do formul�rio de central telef�nica
		FormCentralTelefonica form = new FormCentralTelefonica();
//		Abre formul�rio para o usu�rio dar entrada nos campos
		form.formulario();

	}

	private void listarCentralTelefonica() {
//		instancia classe do formul�rio de central telef�nica
		FormCentralTelefonica form = new FormCentralTelefonica();
		form.printCentrais();

	}

	private void consultarSolucao() {
//		instancia classe da solu��o
		Solucao solucao = new Solucao();
//		Abre formul�rio de perguntas para que o sistema identifique 
//		as melhores solu��os baseadas no que o usu�rio digitou
		solucao.pergunta();

	}

	private void sair() {

		System.out.println("Fim do programa!");

	}

}
