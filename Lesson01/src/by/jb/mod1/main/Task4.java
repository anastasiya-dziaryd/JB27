package by.jb.mod1.main;

// Напишите программу нахождения гипотенузы и площади прямоугольного треугольника по двум катетам.

public class Task4 {

	public static void main(String[] args) {
		double a = 5;
		double b = 7; 
		double c;
		double s;
		
		c = Math.sqrt(a * a + b * b);
		
		s = a * b / 2;
		
		System.out.print("Гипотенуза равна " + c + "; площадь прямоугольного треугольника равна " + s);

	}

}
