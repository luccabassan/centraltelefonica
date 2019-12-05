package Modelo;

public class CentralTelefonica {

	private String modelo; // nome da central

	private int tipoRamal[] = { 0, 1, 2 }; // "analogico", "ip", "digital"
	private int qtdadeRamal[] = { 0, 0, 0 };

	private int tipoTronco[] = { 0, 1, 2 }; // "analogico", "ip", "digital"
	private int qtdadeTronco[] = { 0, 0, 0 };

	private Categoria categoria; // tipo da central, se � h�brida ou ip

	private Disa disa; // vari�vel enum que especifica o tipo de Disa
	private float preco;

	private Capacidade capacidadeLinhaAnalogica; // capacidade m�nima e m�xima
	private Capacidade capacidadeLinhaDigital;
	private Capacidade capacidadeLinhaIP;
	private Capacidade capacidadeRamalAnalogico;
	private Capacidade capacidadeRamalDigital;
	private Capacidade capacidadeRamalIP;

	private Placa placa;

	/*
	 * Modelo de necessidade: 100 ramais IP 60 ramais anal�gicos 60 linhas/tronco
	 * anal�gicos 30 troncos digitais
	 * 
	 * 
	 */

}
