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
			System.err.println("Opção digitada inválida!");
			break;
		}

		return ativo;

	}

	private void cadastrarCentralTelefonica() {
		// TODO Auto-generated method stub
		FormCentralTelefonica form = new FormCentralTelefonica();
		form.formulario();
		System.out.println("Executar o cadatro de central telefônica");

	}

	private void listarCentralTelefonica() {
		// TODO Auto-generated method stub
		System.out.println("Executar a listagem de centrais telefônicas");

	}

	private void consultarSolucao() {
		// TODO Auto-generated method stub
		System.out.println("Executar a consulta da melhor solução");

	}

	private void sair() {
		// TODO Auto-generated method stub
		System.out.println("Fim do programa!");

	}

}
