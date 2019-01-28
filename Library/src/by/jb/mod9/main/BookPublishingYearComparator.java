package by.jb.mod9.main;

import java.util.Comparator;

public class BookPublishingYearComparator implements Comparator<Book> {

	@Override
	public int compare(Book arg0, Book arg1) {
		if(arg0.getPublishingYear() > arg1.getPublishingYear()) {
			return 1;
		}
		if (arg0.getPublishingYear() < arg1.getPublishingYear()) {
			return -1;
		}
		return 0;
	}

}
