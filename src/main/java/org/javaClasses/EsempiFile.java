package org.javaClasses;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class EsempiFile {

	public static void main(String[] args) {

		String nomeFile = "esempio.txt";
		File esempio = new File(nomeFile);
		
		System.out.println("Il file esempio.txt è presente nella cartella corrente? " + esempio.exists());
		System.out.println("Creo il file..");
		try {
			esempio.createNewFile();
		} catch (IOException e) {
			System.out.println("Errore nella creazione del file");
			e.printStackTrace();
		}
		System.out.println("Il file esempio.txt è presente nella cartella corrente? " + esempio.exists() + "\n");
		
		System.out.println("Posso leggere il file? " + esempio.canRead());
		System.out.println("Posso scrivere sul file? " + esempio.canWrite() + "\n");
		
		try {
			// creazione di un writer che permette di scrivere all'interno di un file
			FileWriter writer = new FileWriter(nomeFile);
			writer.write("Prova di scrittura su file\n");
			writer.write("Prova di scrittura su file 2\n");
			writer.write("Prova di scrittura su file 3");
			writer.close();
			
			// creazione di un reader che permetter di leggere all'interno di un file
			BufferedReader reader = Files.newBufferedReader(Paths.get(nomeFile));
			while (true) {
				String riga = reader.readLine(); // legge una linea dal file
				if (riga == null)
					break; // controlla se il file e' finito
				System.out.println(riga);
			}
			reader.close();
			System.out.println("\n");
			
			// rimozione del file se presente
			//esempio.delete();
		} catch (IOException e) {
			System.out.println("Errore nella scrittra del file " + nomeFile);
			e.printStackTrace();
		}
		
		File cartella = new File ("C:\\Users\\Ale-m\\Desktop\\Tutorato_IDS\\");
		File nuovaCartella = new File("C:\\Users\\Ale-m\\Desktop\\Tutorato_IDS\\NuovaCartella");
		// creo una nuova cartella il cuo percorso è quello specificato dal File su cui chiamo il metodo
		nuovaCartella.mkdir();
		nuovaCartella.delete();
		
		System.out.println("Lista dei file presenti all'interno della cartella Tutorato_IDS: ");
		String[] files = cartella.list();
		for(String s : files) {
			System.out.println(s);
		}
		System.out.println("\n");
		
		String listaLibri = "C:\\Users\\Ale-m\\Desktop\\Tutorato_IDS\\resources\\Libri.csv";
		
		try {
			BufferedReader reader = Files.newBufferedReader(Paths.get(listaLibri));
			while (true) {
				String riga = reader.readLine(); // legge una linea dal file
				if (riga == null)
					break; // controlla se il file e' finito
				String[] valori = riga.split(";");
				System.out.println(riga);
				for(String s : valori) {
					System.out.println(s);
				}
				System.out.println("\n");
			}
			reader.close();
			System.out.println("\n");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
