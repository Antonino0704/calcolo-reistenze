package calcolo.resistenze;

public class Resistenze {
	private String colore1, colore2, colore3, tolleranza;
	private int valoreColore1, valoreColore2, valoreColore3, valoreTolleranza;
	private final int ERROR_VALUE = -1;
	
	public Resistenze(String colore1, String colore2, String colore3, String tolleranza) {
		this.colore1 = colore1;
		this.colore2 = colore2;
		this.colore3 = colore3;
		this.tolleranza = tolleranza;
	}
	
	public void setColore1() throws ColorException {
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
			valoreColore1 = ERROR_VALUE;
			throw new ColorException("error color 1");
		}
	}
	
	public void setColore2() throws ColorException {
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
			valoreColore2 = ERROR_VALUE;
			throw new ColorException("error color 2");
		}
	}
	
	public void setColore3() throws ColorException {
		switch(colore3) {
		case "nero":
			valoreColore3 = 1;
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
			valoreColore3 = ERROR_VALUE;
			throw new ColorException("error color 3");
		}
	}
	
	public void setTolleranza() throws ColorException {
		switch(tolleranza) {
		case "oro":
			valoreTolleranza = 5;
			break;
		case "argento":
			valoreTolleranza = 10;
			break;
		default:
			valoreTolleranza= ERROR_VALUE;
			throw new ColorException("error tolleranza");
		}
	}
	
	public String getResistenza() {	
		if(colore3.equals("oro")) {
			return valoreColore1 + "." + valoreColore2;
		}
		else if(valoreColore2 == 0) {
			return (valoreColore1 * valoreColore3) + "0";
		}
		return valoreColore1 + "" + (valoreColore2 * valoreColore3);
	}
	
	public String getTolleranza() {
		return valoreTolleranza + "%";
	} 
}
