package by.jb.mod9.main;

import java.util.ArrayList;
import java.util.List;

public class Library {
	
	private List<Book> books = new ArrayList<Book>();
	
	public void addBook(Book book) {
		books.add(book);
	}
	
	public void deleteBook(Book book) {
		books.remove(book);
	}
	
	public List<Book> findBookByTitle(String title) {
		List<Book> foundList = new ArrayList<Book>();
		for (Book book : books) {
			if (book.getTitle().equals(title)) {
				foundList.add(book);
			}
		}
		if (foundList.isEmpty()) {
			return null;
		} else 	return foundList;
	}
	
	public List<Book> findBookByAuthor(String author){
		List<Book> foundList = new ArrayList<Book>();
		for (Book book : books) {
			if (book.getAuthor().equals(author)) {
				foundList.add(book);
			}
		}
		if (foundList.isEmpty()) {
			return null;
		} else 	return foundList;
	}
	
	public List<Book> findBookByTitleAndAuthor(String title, String author) {
		List<Book> foundList = new ArrayList<Book>();
		for (Book book : books) {
			if (book.getTitle().equals(title) && book.getAuthor().equals(author)) {
				foundList.add(book);
			}
		}
		if (foundList.isEmpty()) {
			return null;
		} else 	return foundList;
		
	}
	
	public List<Book> sortAuthorBooksByPrice(String author) {
		List<Book> authorBooks = findBookByAuthor(author);
		authorBooks.sort(new BookPriceComparator());
		return authorBooks;
	}
	
	public List<Book> sortAuthorBooksByPublishingYear(String author) {
		List<Book> authorBooks = findBookByAuthor(author);
		authorBooks.sort(new BookPublishingYearComparator());
		return authorBooks;
	}
		
}
