package Controlador;

import java.util.Scanner;

import Modelo.Capacidade;
import Modelo.Categoria;
import Modelo.CentralTelefonica;
import Modelo.Disa;
import com.google.gson.Gson;

public class FormCentralTelefonica {

	private Scanner entrada;

	public FormCentralTelefonica() {
		super();
		this.entrada = new Scanner(System.in);
	}

	public void formulario() {

		CentralTelefonica ct = new CentralTelefonica();

		System.out.println("Digite o modelo: ");
		String modelo = this.entrada.nextLine();
		ct.setModelo(modelo);

		System.out.println("Digite a categoria: ");
		String categoria = this.entrada.nextLine();

		Categoria cat = new Categoria(categoria);
		ct.setCategoria(cat);

		System.out.println("Possui DISA multin�vel [s/n]? ");
		String multinivel = this.entrada.next();

		Disa disa;

		if (!multinivel.equalsIgnoreCase("s")) {

			System.out.println("Possui DISA simples [s/n]? ");
			String simples = this.entrada.next();

			if (!simples.equalsIgnoreCase("s")) {
				disa = Disa.NENHUMA;
			} else {
				disa = Disa.SIMPLES;
			}

		} else {
			disa = Disa.MULTINIVEL;
		}

		ct.setDisa(disa);

		System.out.println("Qual o pre�o?");
		float preco = this.entrada.nextFloat();
		ct.setPreco((float) preco);

		System.out.println("Qual a capacidade m�nima de linhas anal�gicas?");
		int capMinLinhaAnalogica = this.entrada.nextInt();

		System.out.println("Qual a capacidade M�XIMA de linhas anal�gicas?");
		int capMaxLinhaAnalogica = this.entrada.nextInt();

		ct.setCapacidadeLinhaAnalogica(new Capacidade(capMinLinhaAnalogica, capMaxLinhaAnalogica));

		System.out.println("Qual a capacidade m�nima de linhas digitais?");
		int capMinLinhaDigital = this.entrada.nextInt();

		System.out.println("Qual a capacidade M�XIMA de linhas digitais?");
		int capMaxLinhaDigital = this.entrada.nextInt();

		ct.setCapacidadeLinhaDigital(new Capacidade(capMinLinhaDigital, capMaxLinhaDigital));

		System.out.println("Qual a capacidade m�nima de linhas IP?");
		int capMinLinhaIp = this.entrada.nextInt();

		System.out.println("Qual a capacidade M�XIMA de linhas IP?");
		int capMaxLinhaIp = this.entrada.nextInt();

		ct.setCapacidadeLinhaIP(new Capacidade(capMinLinhaIp, capMaxLinhaIp));

		System.out.println("Qual a capacidade m�nima de ramais anal�gicos?");
		int capMinRamalAnalogico = this.entrada.nextInt();

		System.out.println("Qual a capacidade M�XIMA de ramais anal�gicos?");
		int capMaxRamalAnalogico = this.entrada.nextInt();

		ct.setCapacidadeRamalAnalogico(new Capacidade(capMinRamalAnalogico, capMaxRamalAnalogico));

		System.out.println("Qual a capacidade m�nima de ramais digitais?");
		int capMinRamalDigital = this.entrada.nextInt();

		System.out.println("Qual a capacidade M�XIMA de ramais digitais?");
		int capMaxRamalDigital = this.entrada.nextInt();

		ct.setCapacidadeRamalDigital(new Capacidade(capMinRamalDigital, capMaxRamalDigital));

		System.out.println("Qual a capacidade m�nima de ramais IP?");
		int capMinRamalIp = this.entrada.nextInt();

		System.out.println("Qual a capacidade M�XIMA de ramais IP?");
		int capMaxRamalIp = this.entrada.nextInt();

		ct.setCapacidadeRamalIP(new Capacidade(capMinRamalIp, capMaxRamalIp));

		Gson gson = new Gson();
		String json = gson.toJson(ct);
		
		try {
			
			Persistencia.salvar(json, "persistencia.json");
			
			System.out.println("Central telef�nica cadastrada com sucesso!");
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(e.getMessage());
		}
		

	}
	
	public void listagem() {
		
		String texto = null;
		
		try {
			
			texto = Persistencia.ler("persistencia.json");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		Gson gson = new Gson();
		
		CentralTelefonica ct = (CentralTelefonica) gson.fromJson(texto, CentralTelefonica.class); 
		
		System.out.println("Modelo: " + ct.getModelo());
		System.out.println("Categoria: " + ct.getCategoria().getCategoria());
		System.out.println("Tipo de DISA: " + ct.getDisa());
		System.out.println("Pre�o da Central: " + ct.getPreco());
		System.out.println("Capacidade de linhas anal�gicas:");
		System.out.println("M�n: "+ ct.getCapacidadeLinhaAnalogica().getMinima()+"| M�x: "+ ct.getCapacidadeLinhaAnalogica().getMaxima());
		System.out.println("Capacidade de linhas Digitais:");
		System.out.println("M�n: "+ ct.getCapacidadeLinhaDigital().getMinima()+"| M�x: "+ ct.getCapacidadeLinhaDigital().getMaxima());
		System.out.println("Capacidade de linhas IP:");
		System.out.println("M�n: "+ ct.getCapacidadeLinhaIP().getMinima()+"| M�x: "+ ct.getCapacidadeLinhaIP().getMaxima());
		System.out.println("Capacidade de Ramais anal�gicos:");
		System.out.println("M�n: "+ ct.getCapacidadeRamalAnalogico().getMinima()+"| M�x: "+ ct.getCapacidadeRamalAnalogico().getMaxima());
		System.out.println("Capacidade de Ramais Digitais:");
		System.out.println("M�n: "+ ct.getCapacidadeRamalDigital().getMinima()+"| M�x: "+ ct.getCapacidadeRamalDigital().getMaxima());
		System.out.println("Capacidade de Ramais IP:");
		System.out.println("M�n: "+ ct.getCapacidadeRamalIP().getMinima()+"| M�x: "+ ct.getCapacidadeRamalIP().getMaxima());
		

	}

}
