package calcolo.resistenze;

import java.util.*;

public class Main {
	private static Scanner input;
	private static String scelta;
	private static Resistenze resistenza;
	
	public static void main(String[] args) {
		input = new Scanner(System.in);
		scelta = "si";
		calcolo();
	}
	
	private static void calcolo() {
		while(scelta.equals("si") || scelta.equals("Si")) {
			startCalcolo();
			stampaResistenza();
			exit_or_no();
		}	
	}
	
	private static void stampaResistenza() {
		System.out.println("La resistenza ha un valore di " + resistenza.getResistenza() + " ohm");
		System.out.println("Tolleranza: " + resistenza.getTolleranza());
	}
	
	private static void startCalcolo() {
		try {
			resistenza = new Resistenze(inputColore1(), inputColore2(), inputColore3(), inputColore4());
			resistenza.setColore1();
			resistenza.setColore2();
			resistenza.setColore3();
			resistenza.setTolleranza();
		}
		catch (ColorException e) {
			System.out.println(System.lineSeparator());
			System.out.println(System.lineSeparator());
			System.out.println(e.getMessage());
			System.out.println(System.lineSeparator());
			System.out.println(System.lineSeparator());
			startCalcolo();
		}
		
	}
	
	private static String inputColore1() {
		System.out.println("inserisci in minuscolo il primo colore");
		return input.nextLine();
	}
	
	private static String inputColore2() {
		System.out.println("inserisci in minuscolo il secondo colore");
		return input.nextLine();
	}
	
	private static String inputColore3() {
		System.out.println("inserisci in minuscolo il terzo colore");
		return input.nextLine();
	}
	
	private static String inputColore4() {
		System.out.println("inserisci in minuscolo il quarto colore");
		return input.nextLine();
	}
	
	public static void exit_or_no() {
		System.lineSeparator();
		System.out.println("vuoi continuare, si o no");
		scelta = input.nextLine();
	}
	
	public static void out() {
		System.out.println("sei uscito dal programma");
		input.close();
	}
}
