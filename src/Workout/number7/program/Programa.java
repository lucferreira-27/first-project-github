package Workout.number7.program;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Workout.number7.application.Funcionario;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("en","US"));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos empregados?");
		List <Funcionario> list = new ArrayList<>();


		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Funcionario #"+i + 1);
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Salario: ");
			double salario = sc.nextDouble();
			
			list.add(new Funcionario(nome, salario, id));
			
		}
		
		
		System.out.println("ID do Funcionario, que recebera aumento: ");
		
		int id = sc.nextInt();
		
		Funcionario funcinario = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if(funcinario == null) {
			System.out.println("Não existe");
		}else {
			System.out.println("Entre com a porcentagem");
			double porcentagem = sc.nextDouble();
			funcinario.aumentarSalario(porcentagem);
		}
		System.out.println("\nLista de Funcionarios: ");
		
		for(Funcionario obj : list) {
			System.out.println(obj.toString());
		}

	}

}
