package Modelo;

public class CentralTelefonica {

	private String modelo; // nome da central

	private Categoria categoria; // tipo da central, se é híbrida ou ip

	private Disa disa; // variável enum que especifica o tipo de Disa
	private float preco;

	private Capacidade capacidadeLinhaAnalogica; // capacidade mínima e máxima
	private Capacidade capacidadeLinhaDigital;
	private Capacidade capacidadeLinhaIP;
	private Capacidade capacidadeRamalAnalogico;
	private Capacidade capacidadeRamalDigital;
	private Capacidade capacidadeRamalIP;

	public CentralTelefonica() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CentralTelefonica(String modelo, Categoria categoria, Disa disa, float preco,
			Capacidade capacidadeLinhaAnalogica, Capacidade capacidadeLinhaDigital, Capacidade capacidadeLinhaIP,
			Capacidade capacidadeRamalAnalogico, Capacidade capacidadeRamalDigital, Capacidade capacidadeRamalIP) {
		super();
		this.modelo = modelo;
		this.categoria = categoria;
		this.disa = disa;
		this.preco = preco;
		this.capacidadeLinhaAnalogica = capacidadeLinhaAnalogica;
		this.capacidadeLinhaDigital = capacidadeLinhaDigital;
		this.capacidadeLinhaIP = capacidadeLinhaIP;
		this.capacidadeRamalAnalogico = capacidadeRamalAnalogico;
		this.capacidadeRamalDigital = capacidadeRamalDigital;
		this.capacidadeRamalIP = capacidadeRamalIP;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
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

	/*
	 * Modelo de necessidade: 100 ramais IP 60 ramais analógicos 60 linhas/tronco
	 * analógicos 30 troncos digitais
	 * 
	 * 
	 */

}
