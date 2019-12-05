package Modelo;

public class CentralTelefonica {

	private String modelo; // nome da central

	private int tipoRamal[] = { 0, 1, 2 }; // "analogico", "ip", "digital"
	private int qtdadeRamal[] = { 0, 0, 0 };

	private int tipoTronco[] = { 0, 1, 2 }; // "analogico", "ip", "digital"
	private int qtdadeTronco[] = { 0, 0, 0 };

	private Categoria categoria; // tipo da central, se é híbrida ou ip

	private Disa disa; // variável enum que especifica o tipo de Disa
	private float preco;

	private Capacidade capacidadeLinhaAnalogica; // capacidade mínima e máxima
	private Capacidade capacidadeLinhaDigital;
	private Capacidade capacidadeLinhaIP;
	private Capacidade capacidadeRamalAnalogico;
	private Capacidade capacidadeRamalDigital;
	private Capacidade capacidadeRamalIP;

	private Placa placa;

	/*
	 * Modelo de necessidade: 100 ramais IP 60 ramais analógicos 60 linhas/tronco
	 * analógicos 30 troncos digitais
	 * 
	 * 
	 */

}
