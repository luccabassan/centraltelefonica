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

	public static String ler(String path) throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader(path));

        String linha = buffRead.readLine();
        
		/*
		 * String linha = ""; while (true) { if (linha != null) {
		 * System.out.println(linha);
		 * 
		 * } else break; linha = buffRead.readLine(); }
		 */
        buffRead.close();
        
        return linha;
    }

}
