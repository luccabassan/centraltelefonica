package Controlador;

import java.util.Scanner;

import Modelo.Capacidade;
import Modelo.Categoria;
import Modelo.CentralTelefonica;
import Modelo.Disa;

public class Main {

	public static void main(String[] args) {

		// inicia o programa instanciando o menu
		Menu menu = new Menu();
		// imprimi boas vindas
		menu.printBemvindo();
		// imprimi op��es do menu
		menu.listarMenu();

	}

}
