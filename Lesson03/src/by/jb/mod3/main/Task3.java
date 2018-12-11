package by.jb.mod3.main;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		double x, f = 0;
		
		System.out.println("Введите x = ");
		x = readFromConsole(); 
		
		if ( x <= 3) {
			f = 9;
		} else if (x > 3) {
			f = 1 / (x * x + 1);
		}
		System.out.println("F(" + x + ") = " + f);
		
	}
	
	public static double readFromConsole() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println("Введите ещё раз: ");
		} return (sc.nextDouble());
	}

}
