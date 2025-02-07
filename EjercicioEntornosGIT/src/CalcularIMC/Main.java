package CalcularIMC;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu peso en kilogramos:");
		double peso = sc.nextDouble();
		System.out.println("Introduce tu altura en metros:");
		double altura = sc.nextDouble();
		Persona personita = new Persona(peso, altura);
		
		personita.calcularIMC();
		sc.close();
	}

}
