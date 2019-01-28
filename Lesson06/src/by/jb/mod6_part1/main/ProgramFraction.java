package by.jb.mod6_part1.main;

import java.util.Scanner;

public class ProgramFraction {

	public static void main(String[] args) {

		Fraction [] frArr = new Fraction [4];
		
		System.out.println("Введите числитель и знаменатель дроби: ");
		frArr[0] = new Fraction(readFromConsole(), readFromConsole());
		
		System.out.println("Введите числитель и знаменатель дроби: ");
		frArr[1] = new Fraction(readFromConsole(), readFromConsole());
		
		System.out.println("Введите числитель и знаменатель дроби: ");
		frArr[2] = new Fraction(readFromConsole(), readFromConsole());
		
		System.out.println("Введите числитель и знаменатель дроби: ");
		frArr[3] = new Fraction(readFromConsole(), readFromConsole());
	
		
		printArray(frArr);
		
	}		
		public static void printArray (Fraction[] arr) {
			System.out.print("[ ");
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.print("]");
		}
		
		public static int readFromConsole () {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			while (!sc.hasNextInt()) {
				sc.next();
				System.out.println("Введите еще раз: ");
			} return sc.nextInt();
			
		}

}
