package Workout.number8.program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Workout.number7.application.Funcionario;

public class Programa {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Tamanho do Array: ");
			int n = sc.nextInt();
			int[][] m = new int[n][n];
			int[] mainDiagonal = new int[n*n];
			int[] negative = new int[n*n];
			int x = -1;
			int a = 0;
			int j, i;
		for(i = 0; i < n; i++) {
			
			
			for(j = 0; j < n; j++) {
				m[i][j] = sc.nextInt();
			}
		}
		
		
		for(i = 0; i < n; i++) {
			
			
			for(j = 0; j < n; j++) {
				if(i == j) {
					
					x++;
					mainDiagonal[x] = m[i][j];
				}
				if(m[i][j] < 0) {
					
					a++;
					negative[a] = m[i][j];
				}
			}
		}
		for(x = 0; x < n; x++)
		System.out.print(" "+mainDiagonal[x]);
		System.out.println();
		for(x = 0; x < n; x++)
		System.out.print(" "+negative[x]);	
	}

}
