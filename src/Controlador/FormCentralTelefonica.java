package Controlador;

import java.util.List;
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

	/*
	 * Método/formulário de central telefônica. É capturado os valores de entrada e
	 * armazenado em arquivo texto
	 */
	public void formulario() {

		CentralTelefonica ct = new CentralTelefonica();

		System.out.println("Digite o modelo: ");
		String modelo = this.entrada.nextLine();
		ct.setModelo(modelo);

		System.out.println("Digite a categoria: ");
		String categoria = this.entrada.nextLine();

		/*
		 * A ideia inicial da classe Categoria era permitir flexibilidade para o
		 * usuário, mas não deu tempo para criar um cadastro de categorias. Desda forma
		 * a categoria acabou ficando um registro aberto
		 */
		Categoria cat = new Categoria(categoria);
		ct.setCategoria(cat);

		System.out.println("Possui DISA multinível [s/n]? ");
		String multinivel = this.entrada.next();

		Disa disa;

		/*
		 * Uma central não pode ser multinível e simples ao mesmo tempo, por isso esta
		 * validação
		 */
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

		System.out.println("Qual o preço?");
		float preco = this.entrada.nextFloat();
		ct.setPreco((float) preco);

		System.out.println("Qual a capacidade mínima de linhas analógicas?");
		int capMinLinhaAnalogica = this.entrada.nextInt();

		System.out.println("Qual a capacidade MÁXIMA de linhas analógicas?");
		int capMaxLinhaAnalogica = this.entrada.nextInt();

		ct.setCapacidadeLinhaAnalogica(new Capacidade(capMinLinhaAnalogica, capMaxLinhaAnalogica));

		System.out.println("Qual a capacidade mínima de linhas digitais?");
		int capMinLinhaDigital = this.entrada.nextInt();

		System.out.println("Qual a capacidade MÁXIMA de linhas digitais?");
		int capMaxLinhaDigital = this.entrada.nextInt();

		ct.setCapacidadeLinhaDigital(new Capacidade(capMinLinhaDigital, capMaxLinhaDigital));

		System.out.println("Qual a capacidade mínima de linhas IP?");
		int capMinLinhaIp = this.entrada.nextInt();

		System.out.println("Qual a capacidade MÁXIMA de linhas IP?");
		int capMaxLinhaIp = this.entrada.nextInt();

		ct.setCapacidadeLinhaIP(new Capacidade(capMinLinhaIp, capMaxLinhaIp));

		System.out.println("Qual a capacidade mínima de ramais analógicos?");
		int capMinRamalAnalogico = this.entrada.nextInt();

		System.out.println("Qual a capacidade MÁXIMA de ramais analógicos?");
		int capMaxRamalAnalogico = this.entrada.nextInt();

		ct.setCapacidadeRamalAnalogico(new Capacidade(capMinRamalAnalogico, capMaxRamalAnalogico));

		System.out.println("Qual a capacidade mínima de ramais digitais?");
		int capMinRamalDigital = this.entrada.nextInt();

		System.out.println("Qual a capacidade MÁXIMA de ramais digitais?");
		int capMaxRamalDigital = this.entrada.nextInt();

		ct.setCapacidadeRamalDigital(new Capacidade(capMinRamalDigital, capMaxRamalDigital));

		System.out.println("Qual a capacidade mínima de ramais IP?");
		int capMinRamalIp = this.entrada.nextInt();

		System.out.println("Qual a capacidade MÁXIMA de ramais IP?");
		int capMaxRamalIp = this.entrada.nextInt();

		ct.setCapacidadeRamalIP(new Capacidade(capMinRamalIp, capMaxRamalIp));

		/*
		 * Biblioteca da Google que simplifica o uso de objetos e json
		 */
		Gson gson = new Gson();
		/*
		 * Converto o objeto CentralTelefonica para json, assim facilita para armanezar
		 * os dados em arquvio texto
		 */
		String json = gson.toJson(ct);

		try {

			Persistencia.salvar(json, "persistencia.json");

			System.out.println("Central telefônica cadastrada com sucesso!");
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(e.getMessage());
		}

	}

	/*
	 * Método que busca os registros de centrais telefônicas armazenadas em arquivo
	 */
	public void printCentrais() {

		List<CentralTelefonica> objCentral;
		int contador = 1;

		try {

			objCentral = Persistencia.ler("persistencia.json");

			for (CentralTelefonica ct : objCentral) {

				if (ct == null) {
					continue;
				}
				this.imprimiCentralTelefonica(ct, contador);
				contador++;

			}

		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("Erro ao recuperar dados do arquivo. " + e.getMessage());
		}

	}

	/*
	 * Método que impimi o objeto CentralTelefonica
	 */
	public void imprimiCentralTelefonica(CentralTelefonica ct, int contador) {

		System.out.println(contador + ". ________________________________");
		System.out.println("|");

		System.out.println("|  Modelo: " + ct.getModelo());
		System.out.println("|  Categoria: " + ct.getCategoria().getCategoria());
		System.out.println("|  Tipo de DISA: " + ct.getDisa());
		System.out.println("|  Preço da Central: " + ct.getPreco());
		System.out.println("|  Capacidade de linhas analógicas: mmínima " + ct.getCapacidadeLinhaAnalogica().getMinima()
				+ ", máxima " + ct.getCapacidadeLinhaAnalogica().getMaxima());

		System.out.println("|  Capacidade de linhas Digitais: mmínima " + ct.getCapacidadeLinhaDigital().getMinima()
				+ ", máxima " + ct.getCapacidadeLinhaDigital().getMaxima());

		System.out.println("|  Capacidade de linhas IP: mínima " + ct.getCapacidadeLinhaIP().getMinima() + ", máxima "
				+ ct.getCapacidadeLinhaIP().getMaxima());

		System.out.println("|  Capacidade de Ramais analógicos: mínima " + ct.getCapacidadeRamalAnalogico().getMinima()
				+ ", máxima " + ct.getCapacidadeRamalAnalogico().getMaxima());

		System.out.println("|  Capacidade de Ramais Digitais: mínima " + ct.getCapacidadeRamalDigital().getMinima()
				+ ", máxima " + ct.getCapacidadeRamalDigital().getMaxima());

		System.out.println("|  Capacidade de Ramais IP: mínima " + ct.getCapacidadeRamalIP().getMinima() + ", máxima "
				+ ct.getCapacidadeRamalIP().getMaxima());

		System.out.println("|__________________________________");

	}

}
