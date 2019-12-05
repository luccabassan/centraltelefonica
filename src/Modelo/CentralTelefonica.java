package Modelo;

public class CentralTelefonica {

	private String modelo; // nome da central

	private static int tipoRamal[] = { 0, 1, 2 }; // "analogico", "ip", "digital"

	private int qtdadeRamal[]; // atribuição das qtdades { 60, 0, 100 };

	private static int tipoTronco[] = { 0, 1, 2 }; // "analogico", "ip", "digital"
	private int qtdadeTronco[]; // atribuição das qtdades { 10, 0, 0 };

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

	public CentralTelefonica() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CentralTelefonica(String modelo, int[] qtdadeRamal, int[] qtdadeTronco, Categoria categoria, Disa disa,
			float preco, Capacidade capacidadeLinhaAnalogica, Capacidade capacidadeLinhaDigital,
			Capacidade capacidadeLinhaIP, Capacidade capacidadeRamalAnalogico, Capacidade capacidadeRamalDigital,
			Capacidade capacidadeRamalIP, Placa placa) {
		super();
		this.modelo = modelo;
		this.qtdadeRamal = qtdadeRamal;
		this.qtdadeTronco = qtdadeTronco;
		this.categoria = categoria;
		this.disa = disa;
		this.preco = preco;
		this.capacidadeLinhaAnalogica = capacidadeLinhaAnalogica;
		this.capacidadeLinhaDigital = capacidadeLinhaDigital;
		this.capacidadeLinhaIP = capacidadeLinhaIP;
		this.capacidadeRamalAnalogico = capacidadeRamalAnalogico;
		this.capacidadeRamalDigital = capacidadeRamalDigital;
		this.capacidadeRamalIP = capacidadeRamalIP;
		this.placa = placa;

	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public static int[] getTipoRamal() {
		return tipoRamal;
	}

	public static void setTipoRamal(int[] tipoRamal) {
		CentralTelefonica.tipoRamal = tipoRamal;
	}

	public int[] getQtdadeRamal() {
		return qtdadeRamal;
	}

	public void setQtdadeRamal(int[] qtdadeRamal) {
		this.qtdadeRamal = qtdadeRamal;
	}

	public static int[] getTipoTronco() {
		return tipoTronco;
	}

	public static void setTipoTronco(int[] tipoTronco) {
		CentralTelefonica.tipoTronco = tipoTronco;
	}

	public int[] getQtdadeTronco() {
		return qtdadeTronco;
	}

	public void setQtdadeTronco(int[] qtdadeTronco) {
		this.qtdadeTronco = qtdadeTronco;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Disa getDisa() {
		return disa;
	}

	public void setDisa(Disa disa) {
		this.disa = disa;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public Capacidade getCapacidadeLinhaAnalogica() {
		return capacidadeLinhaAnalogica;
	}

	public void setCapacidadeLinhaAnalogica(Capacidade capacidadeLinhaAnalogica) {
		this.capacidadeLinhaAnalogica = capacidadeLinhaAnalogica;
	}

	public Capacidade getCapacidadeLinhaDigital() {
		return capacidadeLinhaDigital;
	}

	public void setCapacidadeLinhaDigital(Capacidade capacidadeLinhaDigital) {
		this.capacidadeLinhaDigital = capacidadeLinhaDigital;
	}

	public Capacidade getCapacidadeLinhaIP() {
		return capacidadeLinhaIP;
	}

	public void setCapacidadeLinhaIP(Capacidade capacidadeLinhaIP) {
		this.capacidadeLinhaIP = capacidadeLinhaIP;
	}

	public Capacidade getCapacidadeRamalAnalogico() {
		return capacidadeRamalAnalogico;
	}

	public void setCapacidadeRamalAnalogico(Capacidade capacidadeRamalAnalogico) {
		this.capacidadeRamalAnalogico = capacidadeRamalAnalogico;
	}

	public Capacidade getCapacidadeRamalDigital() {
		return capacidadeRamalDigital;
	}

	public void setCapacidadeRamalDigital(Capacidade capacidadeRamalDigital) {
		this.capacidadeRamalDigital = capacidadeRamalDigital;
	}

	public Capacidade getCapacidadeRamalIP() {
		return capacidadeRamalIP;
	}

	public void setCapacidadeRamalIP(Capacidade capacidadeRamalIP) {
		this.capacidadeRamalIP = capacidadeRamalIP;
	}

	public Placa getPlaca() {
		return placa;
	}

	public void setPlaca(Placa placa) {
		this.placa = placa;
	}

	/*
	 * Modelo de necessidade: 100 ramais IP 60 ramais analógicos 60 linhas/tronco
	 * analógicos 30 troncos digitais
	 * 
	 * 
	 */

}
