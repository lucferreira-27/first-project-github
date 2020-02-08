package Workout.number2.application;

public class Empregado {
	public String nome;
	public double salario_b;
	public double tax;
	public double porcentagem;
	
	public double salarioL() {
		return salario_b - tax;
	}
	public void aumentarSalario(double porcentagem) {
		
		this.porcentagem = (int)porcentagem;
		salario_b += salario_b * porcentagem / 100;
		
		
	}
}
