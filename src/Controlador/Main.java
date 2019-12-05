package Controlador;

import Modelo.Capacidade;
import Modelo.Categoria;
import Modelo.CentralTelefonica;
import Modelo.Disa;
import Modelo.Placa;

public class Main {

	public static void main(String[] args) {

		System.out.println("Projeto Central Telefônica");

		Categoria catHibrida = new Categoria(1, "Central Híbrida");
		Categoria catIp = new Categoria(2, "Central IP");

		CentralTelefonica ct1 = new CentralTelefonica();
		ct1.setModelo("Impacta 300");
		ct1.setCategoria(catIp);
		ct1.setDisa(Disa.MULTINIVEL);
		int qtdadeRamal[] = { 60, 0, 100 };
		ct1.setQtdadeRamal(qtdadeRamal);
		int qtdadeTronco[] = { 100, 0, 0 };
		ct1.setQtdadeTronco(qtdadeTronco);
		ct1.setPreco((float) 550.60);
		ct1.setCapacidadeLinhaAnalogica(new Capacidade(0, 50));
		ct1.setCapacidadeLinhaDigital(new Capacidade(0, 40));
		ct1.setCapacidadeLinhaIP(new Capacidade(0, 50));
		ct1.setCapacidadeRamalAnalogico(new Capacidade(0, 50));
		ct1.setCapacidadeRamalDigital(new Capacidade(0, 50));
		ct1.setCapacidadeRamalIP(new Capacidade(0, 50));
		ct1.setPlaca(new Placa(10, 2, 60, 5));

		CentralTelefonica ct2 = new CentralTelefonica();
		ct2.setModelo("Impacta 500");
		ct2.setCategoria(catHibrida);
		ct2.setDisa(Disa.SIMPLES);
		int qtdadeRamal1[] = { 0, 30, 100 };
		ct2.setQtdadeRamal(qtdadeRamal1);
		int qtdadeTronco1[] = { 50, 0, 0 };
		ct2.setQtdadeTronco(qtdadeTronco1);
		ct2.setPreco((float) 550.60);
		ct2.setCapacidadeLinhaAnalogica(new Capacidade(0, 50));
		ct2.setCapacidadeLinhaDigital(new Capacidade(0, 40));
		ct2.setCapacidadeLinhaIP(new Capacidade(0, 50));
		ct2.setCapacidadeRamalAnalogico(new Capacidade(0, 50));
		ct2.setCapacidadeRamalDigital(new Capacidade(0, 50));
		ct2.setCapacidadeRamalIP(new Capacidade(0, 50));
		ct2.setPlaca(new Placa(10, 2, 60, 5));

		System.out.println(CentralTelefonica.getTipoRamal()[2]);

	}

}
