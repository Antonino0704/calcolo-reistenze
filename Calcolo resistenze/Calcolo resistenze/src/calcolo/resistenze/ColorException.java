package calcolo.resistenze;

public class ColorException extends Exception {
	
	public ColorException(String msg) {
		super(msg);
	}
	
	@Override
	public String getMessage() {
		return "qualcosa è andato storto: " + super.getMessage();
	}
}
