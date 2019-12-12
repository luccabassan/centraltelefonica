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

	public static void salvar(String content, String path) throws IOException {

		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path, true));
		buffWrite.append(content + "\n");
		buffWrite.close();
	}

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
