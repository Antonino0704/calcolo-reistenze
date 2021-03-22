package calcolo.resistenze;

public class Resistenze {
	private String colore1, colore2, colore3, tolleranza;
	private int valoreColore1, valoreColore2, valoreColore3;
	public final int error = 1000000000;
	
	public Resistenze(String colore1, String colore2, String colore3, String tolleranza) {
		this.colore1 = colore1;
		this.colore2 = colore2;
		this.colore3 = colore3;
		this.tolleranza = tolleranza;
	}
	
	public void setColore1() {
		switch(colore1) {
		case "marrone":
			valoreColore1 = 1;
			break;
		case "rosso":
			valoreColore1 = 2;
			break;
		case "arancione":
			valoreColore1 = 3;
			break;
		case "giallo":
			valoreColore1 = 4;
			break;
		case "verde":
			valoreColore1 = 5;
			break;
		case "azzurro":
			valoreColore1 = 6;
			break;
		case "viola":
			valoreColore1 = 7;
			break;
		case "grigio":
			valoreColore1 = 8;
			break;
		case "bianco":
			valoreColore1 = 9;
			break;
		default:
			valoreColore1 = error;
		}
	}
	
	public void setColore2() {
		switch(colore2) {
		case "nero":
			valoreColore2 = 0;
			break;
		case "marrone":
			valoreColore2 = 1;
			break;
		case "rosso":
			valoreColore2 = 2;
			break;
		case "arancione":
			valoreColore2 = 3;
			break;
		case "giallo":
			valoreColore2 = 4;
			break;
		case "verde":
			valoreColore2 = 5;
			break;
		case "azzurro":
			valoreColore2 = 6;
			break;
		case "viola":
			valoreColore2 = 7;
			break;
		case "grigio":
			valoreColore2 = 8;
			break;
		case "bianco":
			valoreColore2 = 9;
			break;
		default:
			valoreColore2 = error;
		}
	}
	
	public void setColore3() {
		switch(colore3) {
		case "nero":
			valoreColore3 = 0;
			break;
		case "marrone":
			valoreColore3 = 10;
			break;
		case "rosso":
			valoreColore3 = 100;
			break;
		case "arancione":
			valoreColore3 = 1000;
			break;
		case "giallo":
			valoreColore3 = 10000;
			break;
		case "verde":
			valoreColore3 = 100000;
			break;
		case "azzurro":
			valoreColore3 = 1000000;
			break;
		case "oro":
			valoreColore3 = 0;
			break;
		default:
			valoreColore3 = error;
		}
	}
	
	public String getReistenza() {
		String resistor;	
		if (colore3.equals("oro")) {
			resistor = valoreColore1 + "," + valoreColore2;
		}
		else if(valoreColore2 == 0) {
			resistor = (valoreColore1 * valoreColore3) + "0";
		}
		else {
			resistor = valoreColore1 + "" + (valoreColore2 * valoreColore3);
		}
		return resistor;
	}
	
	public String getTolleranza() {
		if(tolleranza.equals("argento")) {
			return "10%";
		}
		else{
			return "5%";
		}
	}
	
	public int getValoreColore1() {
		return valoreColore1;
	}
	
	public int getValoreColore2() {
		return valoreColore2;
	}
	
	public int getValoreColore3() {
		return valoreColore3;
	}
	
	public String getTolleranzaValue() {
		return tolleranza;
	}

}
