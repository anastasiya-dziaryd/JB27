package by.jb.mod6_part1.main;

//Определить класс «Дробь» в виде пары m/n. Объявить массив из k дробей, ввести/вывести значения для массива дробей.

public class Fraction {
	
	private int num;
	private int den;
	
	public Fraction(int num, int den) {
		this.num = num;
		if (den == 0) {
			System.out.println("Знаменатель равен нулю. Ошибка.");
		} else this.den = den;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public int getNum() {
		return num;
	}
	
	public void setDen(int den) {
		this.den = den;
	}
	
	public int getDen() {
		return den;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + den;
		result = prime * result + num;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fraction other = (Fraction) obj;
		if (den != other.den)
			return false;
		if (num != other.num)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return num + "/" + den;
	}
	
	
}