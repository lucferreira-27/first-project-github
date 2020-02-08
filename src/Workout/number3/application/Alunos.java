package Workout.number3.application;

public class Alunos {
	public String nome;
	public double[] notas;
	public double soma = 0;
	public double media;
	public String status;
	
	public void boletim() {
		for(double nota : notas) {
			soma += nota;
		}
		
		this.media = soma;
		
		if(this.media >= 60) {
			System.out.println("Aprovado, Nota Final: " + media);
			return;
		}
		
		System.out.println("Reprovado");
		
		System.out.println("Faltam: " + (60 - media) + "pontos");
	}

	
}
