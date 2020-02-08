package Workout.number1.application;

public class Retangulo {
	public double width;
	public double height;
	
	
	public double area() {
		return width * height;
	}
	public double perimetro() {
		return (width * 2) + (height * 2);
	}
	public double diagonal() {
		 
		return 2 * ((width * 2) + (height * 2)); 
	}
}
