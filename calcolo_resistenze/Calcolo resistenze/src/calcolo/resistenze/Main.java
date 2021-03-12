package calcolo.resistenze;

import java.util.*;

public class Main {
	private static Scanner input;
	
	public static void main(String[] args) {
		input = new Scanner(System.in);
		Calcolo();
	}
	
	private static void Calcolo() {
		String scelta;
		do {
			String colore1 = inputColore1();
			String colore2 = inputColore2();
			String colore3 = inputColore3();
			String colore4 = inputColore4();
			
			Resistenze resistenza = new Resistenze(colore1, colore2, colore3, colore4);
			startCalcolo(resistenza);
			
			stampaResistenza(resistenza);
			
			System.lineSeparator();
			System.out.println("vuoi uscire dal programma? si o no");
			scelta = input.nextLine();
		}
		while(scelta.equals("no") || scelta.equals("No"));
		out();
		input.close();
	}
	
	
	private static void stampaResistenza(Resistenze resistenza) {
		if(checkColore(resistenza) == true && checkTolleranza(resistenza) == true) {
			System.out.println("La reistenza ha un valore di " + resistenza.getReistenza() + " ohm");
			System.out.println("Tolleranza: " + resistenza.getTolleranza());
		}
		else {
			System.out.println("qualcosa è andato storto, riprova e inserisci i valori correttamente");	
		}
	}
	
	private static void startCalcolo(Resistenze resistenza) {
		resistenza.setColore1();
		resistenza.setColore2();
		resistenza.setColore3();
	}
	
	private static boolean checkColore(Resistenze resistenza) {
		if(resistenza.getValoreColore1() == resistenza.error) {
			return false;
		}
		else if(resistenza.getValoreColore2() == resistenza.error) {
			return false;
		}
		else if(resistenza.getValoreColore3() == resistenza.error) {
			return false;
		}
		else {
			return true;
		}
	}
	
	private static boolean checkTolleranza(Resistenze resistenza) {
		if(resistenza.getTolleranzaValue().equals("oro") || resistenza.getTolleranzaValue().equals("argento")) {
			return true;
		}
		else {
			return false;
		}
	}
	
	private static String inputColore1() {
		System.out.println("inserisci in minuscolo il primo colore");
		String colore1 = input.nextLine();
		return colore1;
	}
	
	private static String inputColore2() {
		System.out.println("inserisci in minuscolo il secondo colore");
		String colore2 = input.nextLine();
		return colore2;
	}
	
	private static String inputColore3() {
		System.out.println("inserisci in minuscolo il terzo colore");
		String colore3 = input.nextLine();
		return colore3;
	}
	
	private static String inputColore4() {
		System.out.println("inserisci in minuscolo il quarto colore");
		String colore4 = input.nextLine();
		return colore4;
	}
	
	public static void out() {
		System.out.println("sei uscito dal programma");
	}
}
