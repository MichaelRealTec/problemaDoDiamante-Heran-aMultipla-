package devices;

public class ConcreteScanner extends Device implements Scanner{
	
	// Método construtor
	public ConcreteScanner(String serialNumber) {
		super(serialNumber);
	}
	
	// Métodos
	@Override
	public void processDoc(String doc) {
		System.out.println("Scanner processing: " + doc);
	}
	
	@Override
	public String scan() {
		return "Scanned content";
	}
	
}
