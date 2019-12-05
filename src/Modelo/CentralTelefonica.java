package Modelo;

public class CentralTelefonica {

	private String modelo; // nome da central
	
	private int tipoRamal[] = { 0, 1, 2 }; // "analogico", "ip", "digital"
	private int qtdadeRamal[] = { 0, 0, 0 };

	private int tipoTronco[] = { 0, 1, 2 }; // "analogico", "ip", "digital"
	private int qtdadeTronco[] = { 0, 0, 0 };

	private int categoria; // tipo da central, se � 0-h�bricas ou 1-ip 
//	private String categoriaNome[] = { "centrais h�bricas", "centrais ip" }; // tipo da central
	
	private boolean hasDisa; // atendimento digital
//	private int tipoDisa; // 0-multin�vel, 1.simples => n�vel dentro do atendimento digital
	private Disa disa;
	private float preco;

	private int capacidadeLinhaAnalogica[] = { 2, 12 }; // capacidade m�nima e m�xima
	private int capacidadeLinhaDigital[] = { 2, 12 };
	private int capacidadeLinhaIP[] = { 2, 12 };
	private int capacidadeRamalAnalogico[] = { 2, 12 };
	private int capacidadeRamalDigital[] = { 2, 12 };
	private int capacidadeRamalIP[] = { 2, 12 };

	private Placa placa;
	
	/*
	 * Modelo de necessidade: 100 ramais IP 60 ramais anal�gicos 60 linhas/tronco
	 * anal�gicos 30 troncos digitais
	 * 
	 * 
	 */

}
