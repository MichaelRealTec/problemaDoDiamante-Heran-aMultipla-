package devices;

public class ConcretePrinter extends Device implements Printer{   // Herda da classe Device
	  
	// Método construtor
	public ConcretePrinter(String serialNumber) {
		super(serialNumber);
	}
	
	// Métodos
	@Override
	public void processDoc(String doc) {
		System.out.println("Printer processing: " + doc);
	}
	
	@Override
	public void print(String doc) {
		System.out.println("Printing: " + doc);
	}
	
	
}
