package Controlador;

import java.util.Scanner;

import Modelo.Capacidade;
import Modelo.Categoria;
import Modelo.CentralTelefonica;
import Modelo.Disa;

public class Main {

	public static void main(String[] args) {

		Categoria catHibrida = new Categoria("Central Híbrida");
		Categoria catIp = new Categoria("Central IP");

		CentralTelefonica ct1 = new CentralTelefonica();
		ct1.setModelo("Impacta 300");
		ct1.setCategoria(catIp);
		ct1.setDisa(Disa.MULTINIVEL);
		ct1.setPreco((float) 550.60);
		ct1.setCapacidadeLinhaAnalogica(new Capacidade(0, 50));
		ct1.setCapacidadeLinhaDigital(new Capacidade(0, 40));
		ct1.setCapacidadeLinhaIP(new Capacidade(0, 50));
		ct1.setCapacidadeRamalAnalogico(new Capacidade(0, 50));
		ct1.setCapacidadeRamalDigital(new Capacidade(0, 50));
		ct1.setCapacidadeRamalIP(new Capacidade(0, 50));

		CentralTelefonica ct2 = new CentralTelefonica();
		ct2.setModelo("Impacta 500");
		ct2.setCategoria(catHibrida);
		ct2.setDisa(Disa.SIMPLES);
		ct2.setPreco((float) 550.60);
		ct2.setCapacidadeLinhaAnalogica(new Capacidade(0, 50));
		ct2.setCapacidadeLinhaDigital(new Capacidade(0, 40));
		ct2.setCapacidadeLinhaIP(new Capacidade(0, 50));
		ct2.setCapacidadeRamalAnalogico(new Capacidade(0, 50));
		ct2.setCapacidadeRamalDigital(new Capacidade(0, 50));
		ct2.setCapacidadeRamalIP(new Capacidade(0, 50));

//		System.out.println(CentralTelefonica.getTipoRamal()[2]);
		
		Menu menu = new Menu();
		menu.printBemvindo();
		menu.listarMenu();

	}

}
