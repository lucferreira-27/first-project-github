package Workout.number6.program;

import java.util.Scanner;

import Workout.number6.application.Quartos;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos quartos serão alugados?");
		int n =  sc.nextInt();
		Quartos[] q = new Quartos[10];
		
		for(int i = 0; i < n; i++) {
			System.out.println("Nome:");
			String nome = sc.next();

			System.out.println("Email:");
			String email = sc.next();
			
			System.out.println("Quarto: ");
			int quarto = sc.nextInt();
			
			q[quarto] = new Quartos(nome,email);
			q[quarto].setNquarto(quarto);
		}
		
		for(int i = 0; i < 10; i++) {
			if(q[i] != null) {
			System.out.println(q[i].toString());
			}
		}

	}

}
