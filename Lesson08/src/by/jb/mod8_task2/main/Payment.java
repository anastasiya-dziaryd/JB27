package by.jb.mod8_task2.main;

import java.util.ArrayList;
import java.util.List;

public class Payment {
	
	private List<Good> goods = new ArrayList<Good>();

	public void addGood (Good good) {
		goods.add(good);
	}
	
	public void deleteGood (Good good) {
		goods.remove(good);
	}
	
	public double totalSum () {
		double result = 0;
		for (Good good : goods) {
			result += good.getPrice();
		}
		return result;
	}
	
	public void printGoods () {
		for (Good good : goods) {
			System.out.println(good.getName());
		}
	}
}
