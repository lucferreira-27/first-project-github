package Workout.number5.program;

import java.util.Scanner;

import Workout.number5.application.Conta;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Conta conta;
		conta = new Conta();
		System.out.println("Número da Conta: ");
		String nome = sc.nextLine();

		System.out.println("Nome do dono da Conta: ");
		String contaNumero = sc.nextLine();

		System.out.println("Deseja realizar um deposito inicial? S/N");
		String resp = sc.next();
		if (resp.equals("S")) {
			System.out.println("Insira o valor do deposito: ");
			double saldo = sc.nextDouble();
			conta.criarConta(nome, contaNumero, saldo);
		}
		else{
			conta.criarConta(nome, contaNumero);
		}
		
		System.out.println("------ Detalhes da Conta ------\n"+conta.toString());
		
		System.out.println("Valor do Deposito: ");
		conta.depositar(sc.nextDouble());
		System.out.println("------ Atualizado ------\n"+conta.toString());
		System.out.println("Valor da Retirada: ");
		conta.retirar(sc.nextDouble());
		System.out.println("------ Atualizado ------\n"+conta.toString());
		

	}

}
