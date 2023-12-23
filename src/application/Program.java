package application;

import devices.Printer;
import devices.Scanner;

public class Program {
	public static void main(String[] args) {
		// Problema do diamente (Heranças Multiplas)
		
		// Criando um novo objeto impressora
		Printer p = new Printer("1080");
		p.processDoc("My Letter"); // My letter = Minha Carta
		p.print("My Letter"); // My Letter = Minha Carta
		
		// Criando um novo objeto Scanner
		Scanner s = new Scanner("2003"); // Número de serial do Scanner
		s.processDoc("My Email"); // My Email = meu email
		System.out.println("Scan result: " + s.scan()); // Imprimir resultado
		
	}
}
