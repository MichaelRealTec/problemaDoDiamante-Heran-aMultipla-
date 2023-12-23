package devices;


// Combo Device é tanto Scanner quanto Printer


public class ComboDevice extends Device implements Scanner, Printer{  // Heranças Multiplas
	
	// Método Construtor
	public ComboDevice(String serialNumber) {
		super(serialNumber);
	}
	
	// Métodos
	@Override
	public void print(String doc) {
		System.out.println("Combo printing: " + doc);
	}
	
	@Override
	public String scan() {
		return "Combo scan result";
	}
	
	@Override
	public void processDoc(String doc) {
		System.out.println("Combo processing: " + doc);
	}
	// É possível usar os métodos instanciados das interfaces Printer e Scanner pois elas estabelecem contratos e elimina à ambiguidade do problema do diamante. 
}
