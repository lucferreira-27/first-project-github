package Workout.number5.application;

public class Conta {
	private String conta;
	private String nome;
	private double saldo;
	
	
	
	
	
	public Conta(String conta, String nome) {
		
		this.conta = conta;
		this.nome = nome;
		
	}
	public Conta() {
		
	}
	
	
	
	@Override
	public String toString() {
		return "Conta: " + conta + ", Nome: " + nome + ", Saldo: " + saldo;
	}
	
	public void criarConta(String nome, String conta) {
		this.nome = nome;
		this.conta = conta;
	}
	public void criarConta(String nome, String conta, double saldo) {
		this.nome = nome;
		this.conta = conta;
		this.saldo = saldo;
	}
	public void depositar(double deposito) {
		setSaldo(getSaldo() + (deposito) );
	}

	public void retirar(double retirada) {
		setSaldo(getSaldo() - (retirada + 5) );
	}
	public String getConta() {
		return conta;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
	
	
	
	
	
}
