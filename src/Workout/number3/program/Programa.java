package Workout.number3.program;

import java.util.Scanner;

import Workout.number3.application.Alunos;



public class Programa {
	public static void main(String[] args) {
		Alunos a1 = new Alunos();
		
		Scanner sc = new Scanner(System.in);
		a1.nome = "Lucas";
		a1.notas = new double[] {
				sc.nextDouble(),
				sc.nextDouble(),
				sc.nextDouble()
				};
		
		a1.boletim();
		
	}
}
