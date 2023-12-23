package devices;

public abstract class Device {
	// Atributos
	public String serialNumber;
	
	// Métodos Getters e Setters
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	public String getSerialNumber() {
		return serialNumber;
	}
	
	// Método Construtor
	public Device(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	// Métodos
	public abstract void processDoc(String doc);
	
	
}
