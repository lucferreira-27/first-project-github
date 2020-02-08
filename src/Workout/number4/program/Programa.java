package Workout.number4.program;

import java.util.Scanner;


import Workout.number4.application.CurrencyConverter;



public class Programa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		CurrencyConverter converter = new CurrencyConverter();
		
		System.out.println("Valor do dolar");
		converter.price = sc.nextDouble();
		System.out.println("Quantos dolares serão comprados? ");
		System.out.println("Valor a ser pago: " + converter.comprarDollar(sc.nextInt()) );
	}
}
