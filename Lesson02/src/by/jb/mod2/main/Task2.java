package by.jb.mod2.main;

import java.util.Scanner;

// Вычислить значение выражения по формуле (все переменные принимают действительные значения):

public class Task2 {

	public static void main(String[] args) {
		
		double a, b, c, result;
		
		System.out.println("Введите значение a: ");
		a = readFromConsole();
		System.out.println("Введите значение b: ");
		b = readFromConsole();
		System.out.println("Введите значение c: ");
		c = readFromConsole();

		if (a == 0) {
			System.out.println("Деление на ноль. Результат не подсчитан.");
		} else {
			result = (b + Math.sqrt(b * b + 4 * a * c) / (2 * a) - Math.pow(a, 3) * c + b);
			System.out.println("Результат = " + result);
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
