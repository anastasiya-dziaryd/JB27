package by.jb.mod12.main.Library;

public class Book{
	
	private String title;
	private String author;
	private double price;
	private int publishingYear;
	
	public Book (String title, String author, double price, int publishingYear) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.publishingYear = publishingYear;
	}
	
	public void setTitle (String title) {
		this.title = title;
	}
	
	public String getTitle () {
		return title;
	}
	
	public void setAuthor (String author) {
		this.author = author;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setPrice (double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPublishingYear (int publishingYear) {
		this.publishingYear = publishingYear;
	}
	
	public int getPublishingYear() {
		return publishingYear;
	}
	

	@Override
	public String toString() {
		return "Book: title=" + title + ", author=" + author + ", price=" + price + ", publishingYear=" + publishingYear;
	}

}
