package by.jb.mod6_part1.main;

import java.util.Scanner;

public class ProgramFraction {

	public static void main(String[] args) {

		String [] frArr = new String [4];
		
		System.out.println("Введите числитель и знаменатель дроби: ");
		Fraction fr0 = new Fraction(readFromConsole(), readFromConsole());
		frArr[0] = fr0.getFraction();
		
		System.out.println("Введите числитель и знаменатель дроби: ");
		Fraction fr1 = new Fraction(readFromConsole(), readFromConsole());
		frArr[1] = fr1.getFraction();
		
		System.out.println("Введите числитель и знаменатель дроби: ");
		Fraction fr2 = new Fraction(readFromConsole(), readFromConsole());
		frArr[2] = fr2.getFraction();
		
		System.out.println("Введите числитель и знаменатель дроби: ");
		Fraction fr3 = new Fraction(readFromConsole(), readFromConsole());
		frArr[3] = fr3.getFraction();
		
		printArray(frArr);
		
	}		
		public static void printArray (String[] arr) {
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
