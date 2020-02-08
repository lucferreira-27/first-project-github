package Workout.number1.program;

import Workout.number1.application.Retangulo;

public class Programa {
	public static void main(String[] args) {
		Retangulo retangulo = new Retangulo();
		
		retangulo.height = 12;
		retangulo.width = 5;
		
		System.out.println(retangulo.area());
		System.out.println(retangulo.perimetro());
		System.out.println(retangulo.diagonal());
	}
}
