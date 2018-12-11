package by.jb.mod2.main;

import java.util.Scanner;

public class Task1 {
//	public class MinMaxString {
		public static void main(String[] args) {
			int n = 10;
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			String max = "", min = "", str = "";
			for (int i = 0; i < n; i++) { // цикл будет продолжаться, пока i не станет равной n (т.е. 10 раз) 
				System.out.print("> "); 
				if (sc.hasNextLine()) {
					str = sc.nextLine(); // переменной str присваивается введенное значение
					if (i == 0) {
						min = str; // первая введенная строка присваивается переменной min
					}
					if (str.length() > max.length()) {
						max = str; // если длина введенной строки больше, чем длина значения в переменной max, то переменной max присваивается новое значение (введенная строка)
					} else if (str.length() < min.length()) {
					min = str; // если длина введенной строки меньше, чем длина значения в переменной min, то переменной min присваивается новое значение (введенная строка)
					}
				}
			}
			System.out.println("max string = " + max + " length=" + max.length());
			System.out.println("min string = " + min + " length=" + min.length());
		}
}

