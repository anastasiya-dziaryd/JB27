package by.jb.mod4.main;

import java.util.Random;
import java.util.Scanner;

// В целочисленной последовательности есть нулевые элементы. Создать массив из номеров этих элементов. 

public class Task4 {

	public static void main(String[] args) {

		System.out.println("Введите длину массива: ");
		int arrLength = readFromConsole();
		int [] arr = new int [arrLength];
		enterArrayWithRandom(arr);
		printArray(arr);
		indexOfZeroElemets(arr);		
	}
	
	public static void indexOfZeroElemets(int[] arr) {
		System.out.print("Нулевые элементы расположены под номерами: ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				System.out.print(i + " ");
			}
		}		
	}
	
	public static int readFromConsole() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		if (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Введите ещё раз: ");
		}
		return (sc.nextInt());
	}
	
	public static void enterArrayWithRandom(int[] arr) {
		Random rand = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(3);
		}
		
	}
		
	public static void printArray(int[] arr) {
		System.out.print("[ ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("]");
	}

}
