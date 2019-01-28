package by.jb.mod9.main;

import java.util.Comparator;

public class BookPriceComparator implements Comparator<Book> {

	@Override
	public int compare(Book arg0, Book arg1) {
		if(arg0.getPrice() > arg1.getPrice()) {
			return 1;
		}
		if (arg0.getPrice() < arg1.getPrice()) {
			return -1;
		}
		return 0;
	}
	

}
