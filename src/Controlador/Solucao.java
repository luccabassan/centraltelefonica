package Controlador;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Modelo.CentralTelefonica;

public class Solucao {

	int qtdadeRamalAnalogico;
	int qtdadeRamalIP;
	int qtdadeRamalDigital;
	int qtdadeLinhaAnalogico;
	int qtdadeLinhaIP;
	int qtdadeLinhaDigital;

	private Scanner entrada;

	public Solucao() {
		super();
		this.entrada = new Scanner(System.in);
	}

	/*
	 * Método/formulário de solução. É capturado os dados necessários para que o
	 * sistema encontre as centrais telefônicas que se enquadram no que o usuário
	 * digitou
	 */
	public void pergunta() {

		System.out.println("");
		System.out.println("Vamos achar a solução ideial!");
		System.out.println("Responda o questionário abaixo:");
		System.out.println("");

		System.out.println("1/6. Qual a quatidade de linhas analógicas? ");
		this.qtdadeLinhaAnalogico = this.entrada.nextInt();

		System.out.println("2/6. Qual a quatidade de linhas digitais? ");
		this.qtdadeLinhaDigital = this.entrada.nextInt();

		System.out.println("3/6. Qual a quatidade de linhas IPs? ");
		this.qtdadeLinhaIP = this.entrada.nextInt();

		System.out.println("4/6. Qual a quatidade de ramais analógicos? ");
		this.qtdadeRamalAnalogico = this.entrada.nextInt();

		System.out.println("5/6. Qual a quatidade de ramais digitais? ");
		this.qtdadeRamalDigital = this.entrada.nextInt();

		System.out.println("6/6. Qual a quatidade de ramais IPs? ");
		this.qtdadeRamalIP = this.entrada.nextInt();

		this.resultado();

	}

	/*
	 * Método que busca as centrais telefônicas e imprimi para o usuário
	 */
	public void resultado() {

		List<CentralTelefonica> resultado = this.buscaSolucao();

		if (resultado.size() == 0) {
			System.out.println("Não encontramos nenhuma solução! :(");
		} else {
			System.out.println("Encontrada " + resultado.size() + " central(is) telefônica(s)!");

			FormCentralTelefonica formCentralTelefonica = new FormCentralTelefonica();

			for (int i = 0; i < resultado.size(); i++) {
				formCentralTelefonica.imprimiCentralTelefonica(resultado.get(i), (i + 1));
			}

		}

	}

	/*
	 * Método que busca todos os reguistros de central telefônica e confere as que
	 * se enquadram no que o usuário deseja
	 */
	private List<CentralTelefonica> buscaSolucao() {

		List<CentralTelefonica> objCentral;
		List<CentralTelefonica> resultado = new ArrayList<CentralTelefonica>();

		try {

			objCentral = Persistencia.ler("persistencia.json");

			for (CentralTelefonica ct : objCentral) {

				if (ct == null) {
					continue;
				}

				if (this.validaQtdadeLinhaAnalogica(ct) && this.validaQtdadeLinhaDigital(ct)
						&& this.validaQtdadeLinhaIP(ct) && this.validaQtdadeRamalAnalogico(ct)
						&& this.validaQtdadeRamalDigital(ct) && this.validaQtdadeRamalIP(ct)) {
					resultado.add(ct);
				}

			}

		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("Erro ao recuperar dados do arquivo. " + e.getMessage());
		}

		return resultado;

	}

	/*
	 * É verificado a central telefônica possui uma capacidade mínima e máxima de
	 * linha analógica que se enquadra na necessidade do usuário
	 */
	private boolean validaQtdadeLinhaAnalogica(CentralTelefonica ct) {

		if (this.qtdadeLinhaAnalogico > 0) {
			if (ct.getCapacidadeLinhaAnalogica().getMinima() <= this.qtdadeLinhaAnalogico
					&& ct.getCapacidadeLinhaAnalogica().getMaxima() >= this.qtdadeLinhaAnalogico) {
				return true;
			}
		}

		return false;

	}

	/*
	 * É verificado a central telefônica possui uma capacidade mínima e máxima de
	 * linha digital que se enquadra na necessidade do usuário
	 */
	private boolean validaQtdadeLinhaDigital(CentralTelefonica ct) {

		if (this.qtdadeLinhaDigital > 0) {
			if (ct.getCapacidadeLinhaDigital().getMinima() <= this.qtdadeLinhaDigital
					&& ct.getCapacidadeLinhaDigital().getMaxima() >= this.qtdadeLinhaDigital) {
				return true;
			}
		}

		return false;

	}

	/*
	 * É verificado a central telefônica possui uma capacidade mínima e máxima de
	 * linha IP que se enquadra na necessidade do usuário
	 */
	private boolean validaQtdadeLinhaIP(CentralTelefonica ct) {

		if (this.qtdadeLinhaIP > 0) {
			if (ct.getCapacidadeLinhaIP().getMinima() <= this.qtdadeLinhaIP
					&& ct.getCapacidadeLinhaIP().getMaxima() >= this.qtdadeLinhaIP) {
				return true;
			}
		}

		return false;

	}
	
	/*
	 * É verificado a central telefônica possui uma capacidade mínima e máxima de
	 * ramal analógico que se enquadra na necessidade do usuário
	 */
	private boolean validaQtdadeRamalAnalogico(CentralTelefonica ct) {

		if (this.qtdadeRamalAnalogico > 0) {
			if (ct.getCapacidadeRamalAnalogico().getMinima() <= this.qtdadeRamalAnalogico
					&& ct.getCapacidadeRamalAnalogico().getMaxima() >= this.qtdadeRamalAnalogico) {
				return true;
			}
		}

		return false;

	}

	/*
	 * É verificado a central telefônica possui uma capacidade mínima e máxima de
	 * ramal digital que se enquadra na necessidade do usuário
	 */
	private boolean validaQtdadeRamalDigital(CentralTelefonica ct) {

		if (this.qtdadeRamalDigital > 0) {
			if (ct.getCapacidadeRamalDigital().getMinima() <= this.qtdadeRamalDigital
					&& ct.getCapacidadeRamalDigital().getMaxima() >= this.qtdadeRamalDigital) {
				return true;
			}
		}

		return false;

	}

	/*
	 * É verificado a central telefônica possui uma capacidade mínima e máxima de
	 * ramal IP que se enquadra na necessidade do usuário
	 */
	private boolean validaQtdadeRamalIP(CentralTelefonica ct) {

		if (this.qtdadeRamalIP > 0) {
			if (ct.getCapacidadeRamalIP().getMinima() <= this.qtdadeRamalIP
					&& ct.getCapacidadeRamalIP().getMaxima() >= this.qtdadeRamalIP) {
				return true;
			}
		}

		return false;

	}

}
