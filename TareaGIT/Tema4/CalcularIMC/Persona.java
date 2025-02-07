package CalcularIMC;
import java.text.DecimalFormat;


public class Persona {
	private double peso;
	private double altura;
	
	public Persona(double peso, double altura) {
		this.peso = peso;
		this.altura = altura;
	}
	
	public void calcularIMC() {
		double imc = peso/(Math.pow(altura, 2));
		DecimalFormat df = new DecimalFormat("#.##");
		if(imc<18.5) {
			System.out.println("Tu IMC es " + df.format(imc) + ". Estás por debajo del peso normal.");
		} else if(imc>=18.5 && imc<25) {
			System.out.println("Tu IMC es " + df.format(imc) + ". Tienes un peso saludable. ¡Buen trabajo!");
		} else if(imc>=25) {
			System.out.println("Tu IMC es " + df.format(imc) + ". Tienes sobrepeso. ¡Cuida tu salud!");
		} else {
			System.out.println("El valor introducido no es válido");
		}
	}
}
