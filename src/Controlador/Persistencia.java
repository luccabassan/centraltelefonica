package Controlador;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Persistencia {

	public static void salvar(String content, String path) throws IOException {
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
        buffWrite.append(content + "\n");
        buffWrite.close();
    }

	public boolean ler() {

		return true;
	}

}
