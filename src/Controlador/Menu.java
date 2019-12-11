package Controlador;

import java.util.Scanner;

public class Menu {

	Scanner entrada;

	public Menu() {
		super();

		this.entrada = new Scanner(System.in);

	}

	public void printBemvindo() {

		System.out.println("_________________________________________________________________");
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
		case "C":
			this.cadastrarCentralTelefonica();
			break;
		case "L":
			this.listarCentralTelefonica();
			break;
		case "R":
			this.listarCentralTelefonica();
			break;
		case "F":
			this.sair();
			ativo = false;
			break;
		default:
			System.err.println("Op��o digitada inv�lida!");
			break;
		}

		return ativo;

	}

	private void cadastrarCentralTelefonica() {
		// TODO Auto-generated method stub
		FormCentralTelefonica form = new FormCentralTelefonica();
		form.formulario();
		System.out.println("Executar o cadatro de central telef�nica");

	}

	private void listarCentralTelefonica() {
		// TODO Auto-generated method stub
		System.out.println("Executar a listagem de centrais telef�nicas");

	}

	private void consultarSolucao() {
		// TODO Auto-generated method stub
		System.out.println("Executar a consulta da melhor solu��o");

	}

	private void sair() {
		// TODO Auto-generated method stub
		System.out.println("Fim do programa!");

	}

}
