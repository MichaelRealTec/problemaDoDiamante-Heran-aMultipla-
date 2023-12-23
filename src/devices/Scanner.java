package devices;

public class Scanner extends Device{
	
	// Método construtor
	public Scanner(String serialNumber) {
		super(serialNumber);
	}
	
	// Métodos
	@Override
	public void processDoc(String doc) {
		System.out.println("Scanner processing: " + doc);
	}
	
	public String scan() {
		return "Scanned content";
	}
	
}
