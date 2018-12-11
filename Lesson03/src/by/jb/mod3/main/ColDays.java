package by.jb.mod3.main;

import java.util.Scanner;

public class ColDays {

	public static void main(String[] args) {
		
		int year, month, col_day = 0;
		
		System.out.print("Введите год: ");
		year = readFromConsole();
		System.out.print("Введите номер месяца: ");
		month = readFromConsole();
		
		switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				col_day = 31;
				break;
			case 2:
				if (year % 4 == 0) {
					col_day = 29;
				} else {
					col_day = 28;
				}
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				col_day = 30;
				break;
		}
		System.out.println("Количество дней равно - " + col_day);
	}
	
	public static int readFromConsole() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		if (sc.hasNextInt()) {
			return (sc.nextInt());
		} else return 0;	
	}
}
