package by.jb.mod3.main;

import java.util.Scanner;

/* Составить программу для вычисления значений функции F(x) на отрезке [а, b] с 
шагом h. Результат представить в виде таблицы, первый столбец которой – значения
аргумента, второй - соответствующие значения функции: */

public class Task2 {

	public static void main(String[] args) {
		double a, b, h, x, f;
		
		System.out.println("Введите a = ");
		a = readFromConsole(); 
		System.out.println("Введите b = ");
		b = readFromConsole();
		System.out.println("Введите h = ");
		h = readFromConsole();
				
		for (double i = a; i <=b; i = i + h) {
			if (b < a) {
				System.out.println("b should be > a");
				break;
			} 
			if (h > b - a) {
				System.out.println("h should he < (b - a)");
				break;
			}
			x = i;
			f = 2 * Math.tan(x / 2) + 1;
			System.out.println(x + " - " + f);			
		}

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
