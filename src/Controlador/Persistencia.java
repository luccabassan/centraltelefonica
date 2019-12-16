package Controlador;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;

import Modelo.CentralTelefonica;

public class Persistencia {

	/*
	 * M�todo que salva num arquivo texto os valores de entrada da central
	 * telef�nica
	 * Cada linha do arquivo � equivalente a um registro de central
	 * telef�nica
	 */
	public static void salvar(String content, String path) throws IOException {

		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path, true));
		buffWrite.append(content + "\n");
		buffWrite.close();
	}

	/*
	 * M�todo que retorna uma lista de objetos tipo CentralTelefonica
	 */
	public static List<CentralTelefonica> ler(String path) throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(path));

		List<CentralTelefonica> objCentral = new ArrayList<CentralTelefonica>();
		Gson gson = new Gson();

		String linha = "";
		while (true) {
			if (linha != null) {

				objCentral.add((CentralTelefonica) gson.fromJson(linha, CentralTelefonica.class));

			} else
				break;
			linha = buffRead.readLine();
		}

		buffRead.close();

		return objCentral;
	}

}
