package by.jb.mod4.main;

import java.util.Random;
import java.util.Scanner;

// В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К

public class Task2 {

	public static void main(String[] args) {
		
		int result = 0;
		System.out.println("Введите длину массива: ");
		int n = readFromConsole();
		
		System.out.println("Введите k: ");
		int k = readFromConsole();
		
		int[] a = new int[n];
		enterArrayWithRandom(a);
		printArray(a);
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] % k == 0) {
				result += a[i];
			}
		}
		System.out.println("Result = " + result);
	}

	public static void enterArrayWithRandom(int[] mas) {
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(300);
		}
	}
	
	public static int readFromConsole() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Введите ещё раз: ");
		}
		return (sc.nextInt());
	}
	
	public static void printArray(int[] mas) {
		System.out.print("[ ");
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
		System.out.print("]" + "\n");
		
	}

}
