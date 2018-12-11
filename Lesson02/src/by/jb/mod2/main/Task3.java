package by.jb.mod2.main;

import java.util.Scanner;

// Вычислить длину окружности и площадь круга одного и того же заданного радиуса R

public class Task3 {

	public static void main(String[] args) {
		double r, c, s;
		
		System.out.println("Введите значение радиуса: ");
		r = readFromConsole();
		
		if (r < 0) {
			System.out.println("Радиус не может быть меньше нуля. Результат не подсчитан.");
		}
		c = 2 * Math.PI * r;
		s = Math.PI * Math.pow(r, 2);
		
		System.out.println("Длина окружности равна " + c + "; площадь круга равна " + s);
		
		

	}
	
	public static double readFromConsole() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println("Введите ещё раз: ");
		}
		return (sc.nextDouble());
	}

}
