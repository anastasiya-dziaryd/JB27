package by.jb.mod3.main;

import java.util.Scanner;

public class Line01 {

	public static void main(String[] args) {
		
		int number;
		int digit = 0;
		
		System.out.print("Введите число: ");
		number = readFromConsole();
		
		while (number != 0) {
			digit = number % 10;
			number = number / 10;
			if (digit % 2 == 0) {
				System.out.println("В числе есть четная цифра.");
				return;
			}
		}
		System.out.println("В числе нет четных цифр.");
	}
	
	public static int readFromConsole() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		if (sc.hasNextInt()) {
			return (sc.nextInt());
		} else return 0;
	}
}
