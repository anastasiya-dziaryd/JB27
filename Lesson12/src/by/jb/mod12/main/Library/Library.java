package by.jb.mod12.main.Library;

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
	
	public ArrayList<Book> getBooks(){
		return new ArrayList<Book>(this.books);
	}
}
