package Workout.number2.program;

import java.util.Scanner;

import Workout.number2.application.Empregado;

public class Programa {
	public static void main(String[] args) {
		Empregado empregado = new Empregado();

		Scanner sc = new Scanner(System.in);

		System.out.println("Nome");
		empregado.nome = sc.nextLine();
		System.out.println("Salario Bruto");
		empregado.salario_b = sc.nextDouble();
		System.out.println("Imposto");
		empregado.tax = sc.nextDouble();
		System.out.println("Porcentagem de aumento de salario bruto:");
		empregado.aumentarSalario(sc.nextInt());

		System.out.println("Aumento em Porcentagem: " + empregado.porcentagem);
		System.out.println("Atualizado: " + empregado.salarioL());
	}
}
