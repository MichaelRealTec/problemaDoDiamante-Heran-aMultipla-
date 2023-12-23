package devices;

public class Printer extends Device{   // Herda da classe Device
	  
	// Método construtor
	public Printer(String serialNumber) {
		super(serialNumber);
	}
	
	// Métodos
	@Override
	public void processDoc(String doc) {
		System.out.println("Printer processing: " + doc);
	}
	
	public void print(String doc) {
		System.out.println("Printing: " + doc);
	}
	
	
}
