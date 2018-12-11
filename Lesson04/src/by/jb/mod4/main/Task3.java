package by.jb.mod4.main;

// Дана последовательность действительных чисел а1 а2 ,..., аn . Выяснить, будет ли она возрастающей

public class Task3 {

	public static void main(String[] args) {
	
		double [] arr = new double [] {0, 1.5, 3, 4.5, 6};
		boolean result = true;
		
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				result = false;
				break;
			}
		}
		 if (result == false) {
			 System.out.println("Последовательность чисел не возрастающая");
		 } else {
			 System.out.println("Последовательность чисел возрастающая");
		 }
	}
}
