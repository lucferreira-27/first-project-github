package Workout.number4.application;

public class CurrencyConverter {

	public double price;
	public static final double IOF = 0.06;
	
	public double comprarDollar(int dollars) {
		
		return (IOF + 1) * (price * dollars); 
	}
	
	
}
