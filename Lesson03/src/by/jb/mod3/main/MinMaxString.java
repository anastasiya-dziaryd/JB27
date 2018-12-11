package by.jb.mod3.main;

import java.util.Scanner;

public class MinMaxString {
	public static void main(String[] args) {
		int n = 10;

		String max = "", min = "", str = "";
		
		for (int i = 0; i < n; i++) {
			System.out.print("> ");
			str = readFromConsole();
			if (i == 0) {
					min = str;
			}
			if (str.length() > max.length()) {
				max = str;
			} else if (str.length() < min.length()) {
				min = str;
			}
			
		}
		
		System.out.println("max string = " + max + " length=" +	max.length());
		System.out.println("min string = " + min + " length=" + min.length());
	}
	
	public static String readFromConsole() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		if (sc.hasNextLine()) {
			return (sc.nextLine());
		} else return null;
	}
}
