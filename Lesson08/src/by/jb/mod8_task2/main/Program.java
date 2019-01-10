package by.jb.mod8_task2.main;

public class Program {

	public static void main(String[] args) {

		Payment payment1 = new Payment();
		
		Good good1 = new Good("Milk", 2);
		Good good2 = new Good("Sweets", 8);
		
		payment1.addGood(good1);
		payment1.addGood(good2);
		
		System.out.println("Ваш заказ: ");
		payment1.printGoods();
		System.out.println("Сумма покупки: " + payment1.totalSum());
		
	}

}
