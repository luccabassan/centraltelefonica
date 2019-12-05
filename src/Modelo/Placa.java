package Modelo;

public class Placa {

	private int qtdadeRamalAnalogico;
	private int qtdadeRamalDigital;
	private int qtdadeLinhaAnalogico;
	private int qtdadeLinhaDigital;

	public Placa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Placa(int qtdadeRamalAnalogico, int qtdadeRamalDigital, int qtdadeLinhaAnalogico, int qtdadeLinhaDigital) {
		super();
		this.qtdadeRamalAnalogico = qtdadeRamalAnalogico;
		this.qtdadeRamalDigital = qtdadeRamalDigital;
		this.qtdadeLinhaAnalogico = qtdadeLinhaAnalogico;
		this.qtdadeLinhaDigital = qtdadeLinhaDigital;
	}

	public int getQtdadeRamalAnalogico() {
		return qtdadeRamalAnalogico;
	}

	public void setQtdadeRamalAnalogico(int qtdadeRamalAnalogico) {
		this.qtdadeRamalAnalogico = qtdadeRamalAnalogico;
	}

	public int getQtdadeRamalDigital() {
		return qtdadeRamalDigital;
	}

	public void setQtdadeRamalDigital(int qtdadeRamalDigital) {
		this.qtdadeRamalDigital = qtdadeRamalDigital;
	}

	public int getQtdadeLinhaAnalogico() {
		return qtdadeLinhaAnalogico;
	}

	public void setQtdadeLinhaAnalogico(int qtdadeLinhaAnalogico) {
		this.qtdadeLinhaAnalogico = qtdadeLinhaAnalogico;
	}

	public int getQtdadeLinhaDigital() {
		return qtdadeLinhaDigital;
	}

	public void setQtdadeLinhaDigital(int qtdadeLinhaDigital) {
		this.qtdadeLinhaDigital = qtdadeLinhaDigital;
	}

}
