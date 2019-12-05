package Controlador;

import Modelo.CentralTelefonica;

public class Main {

	public static void main(String[] args) {

		System.out.println("Projeto Central Telefônica");

		CentralTelefonica ct1 = new CentralTelefonica();
		CentralTelefonica ct2 = new CentralTelefonica();

		System.out.println(CentralTelefonica.getTipoRamal()[2]);

	}

}
