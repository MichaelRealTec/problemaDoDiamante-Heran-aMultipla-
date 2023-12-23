package application;

import devices.ComboDevice;
import devices.ConcretePrinter;
import devices.ConcreteScanner;

public class Program {
	public static void main(String[] args) {
		// Problema do diamente (Heranças Multiplas)
		
		// Criando um novo objeto impressora
		ConcretePrinter p = new ConcretePrinter("1080");
		p.processDoc("My Letter"); // My letter = Minha Carta
		p.print("My Letter"); // My Letter = Minha Carta
		
		System.out.println(); // Pular uma linha
		
		// Criando um novo objeto Scanner
		ConcreteScanner s = new ConcreteScanner("2003"); // Número de serial do Scanner
		s.processDoc("My Email"); // My Email = meu email
		System.out.println("Scan result: " + s.scan()); // Imprimir resultado
		
		System.out.println(); // Pular uma linha
		
		// Criando a classe combo
		ComboDevice c = new ComboDevice("2081"); // atribuindo um número de serie
		c.processDoc("My dissertation"); // chamando o método .processDoc
		c.print("My dissertation"); // chamando o método .print
		System.out.println("Scan result: " + c.scan()); // chamando o método .scan
		
	}
}
