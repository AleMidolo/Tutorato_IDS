package org.javaClasses.libreria;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;

public class ListaLibri {

	public static void main(String[] args) {
		
		String listaLibri = "C:\\Users\\Ale-m\\Desktop\\Tutorato_IDS\\resources\\Libri.csv";
		
		HashMap<String, ArrayList<String>> mappaLibri = leggiFile(listaLibri);
		Libreria libreria = new Libreria();
		
		generaLibri(mappaLibri, libreria);
		
		stampaReport(libreria);
	}
	
	public static HashMap<String, ArrayList<String>> leggiFile(String lista) {

		HashMap<String, ArrayList<String>> mappaLibri = new HashMap<>();
		try {
			BufferedReader reader = Files.newBufferedReader(Paths.get(lista));
			reader.readLine();
			while (true) {
				String riga = reader.readLine(); // legge una linea dal file
				if (riga == null)
					break; // controlla se il file e' finito
				inserisciLibro(riga, mappaLibri);
			}
			reader.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		return mappaLibri;
	}
	
	public static void inserisciLibro(String riga, HashMap<String, ArrayList<String>> mappa) {
		String[] splitted = riga.split(";");
		String nomeLibro = splitted[0];
		ArrayList<String> valoriLibro = new ArrayList<>();
		for(int i=1; i<splitted.length; i++) {
			valoriLibro.add(splitted[i]);
		}
		mappa.put(nomeLibro, valoriLibro);
	}
	
	public static void generaLibri(HashMap<String, ArrayList<String>> mappa, Libreria libreria) {
		for(String nomeLibro : mappa.keySet()) {
			ArrayList<String> valori = mappa.get(nomeLibro);
			Double prezzo = Double.parseDouble(valori.get(1));
			int disponibilità = Integer.parseInt(valori.get(2));
			Book libro = new Book(nomeLibro, prezzo, valori.get(3), disponibilità, valori.get(4));
			libreria.addLibro(libro);
		}
	}
	
	public static void stampaReport(Libreria libreria) {
		String statistiche = "Report.txt";
		
		ArrayList<Book> libriPocaDisp = new ArrayList<>();
		ArrayList<Book> totaleLibri = new ArrayList<>();
		
		Integer numeroDiLibri = calcolaStatistiche(libriPocaDisp, totaleLibri, libreria);
		Integer numeroScaffali = libreria.getScaffali().size();	
		
		try {
			File report = new File(statistiche);
			if(report.exists())
				report.delete();
			
			FileWriter writer = new FileWriter(statistiche);
			writer.write("Numero totale di libri: " + numeroDiLibri + "\n");
			writer.write("Numero totale di scaffali: " + numeroScaffali + "\n");
			writer.write("Libri con disponibilità minore di 2: \n");
			for(Book b : libriPocaDisp) {
				writer.write("\t" + b.getNome() + "\n");
			}
			writer.write("\n\nRicavi per libro: \n");
			for(Book b : totaleLibri) {
				writer.write("\tLibro: " + b.getNome() + " Ricavo: " + b.getDisponibilità()*b.getPrezzo() + "\n");
			}
			writer.write("\n\n");
			for(Scaffale s : libreria.getScaffali()) {
				writer.write("Genere: " + s.getGenere() + ", numero di libri: " + s.getLibri().size() +"\n");
			}
			writer.close();
			System.out.println("Report creato");
		}
		catch(IOException e) {
			e.printStackTrace();
			return;
		}
	}
	
	public static Integer calcolaStatistiche(ArrayList<Book> libriPocaDisp, ArrayList<Book> totaleLibri, Libreria libreria) {
		Integer numeroDiLibri = 0;
		
		for(Scaffale s : libreria.getScaffali()) {
			numeroDiLibri += s.getLibri().size();
			for(Book b : s.getLibri()) {
				if(b.getDisponibilità() < 2)
					libriPocaDisp.add(b);
				totaleLibri.add(b);
			}
		}	
		
		return numeroDiLibri;
	}
}
