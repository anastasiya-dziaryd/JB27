package by.jb.mod3.main;

import java.util.Scanner;

public class LastDigit {
	
	public static void main(String[] args) {

		int number;
		int poslZifra;
		int poslZifraKv;
		System.out.print("Введите число: ");
		
		number = readFromConsole();
		poslZifra = number % 10;
		switch (poslZifra) {
			case 0: 
				poslZifraKv = 0;
				break;
			case 1:
				poslZifraKv = 1;
				break;
			case 2:
				poslZifraKv = 4;
				break;
			case 3:
				poslZifraKv = 9;
				break;
			case 4:
				poslZifraKv = 6;
				break;
			case 5:
				poslZifraKv = 5;
				break;
			case 6:
				poslZifraKv = 6;
				break;
			case 7:
				poslZifraKv = 9;
				break;
			case 8:
				poslZifraKv = 4;
				break;
			case 9:
				poslZifraKv = 1;
				break;
			default:
				System.out.println("Что-то не то с программой.");
				return;
		}
		System.out.println("Последняя цифра квадрата числа " + poslZifra + " равняется " + poslZifraKv); // number было заменено на poslZifra
	}

	public static int readFromConsole() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		if (sc.hasNextInt()) {
			return (sc.nextInt());
		} else return 0;
	}
}
