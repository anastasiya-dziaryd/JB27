package by.jb.mod9.main;

public class Program {

	public static void main(String[] args) {
		
		Library library = new Library();
		
		ProgrammerBook book1 = new ProgrammerBook("Java", "Beits", 25.89, 2018, "beginner");
		ChildBook book2 = new ChildBook("Hat", "Nosov", 12.39, 2017, 10);
		Schoolbook book3 = new Schoolbook("English", "Panova", 8, 2015, 6);
		ProgrammerBook book4 = new ProgrammerBook("Java", "Beits", 18.89, 2017, "middle");
		ChildBook book5 = new ChildBook("Test","Nosov", 11.39, 2017, 10);
		Schoolbook book6 = new Schoolbook("English", "Panova", 18, 2018, 8);
		Schoolbook book7 = new Schoolbook("English", "Panova", 9, 2014, 7);
		
		library.addBook(book1);
		library.addBook(book2);
		library.addBook(book3);
		library.addBook(book4);	
		library.addBook(book5);
		library.addBook(book6);
		library.addBook(book7);
		
		
		System.out.println(library.findBookByTitle("Java") + "\n");
		System.out.println(library.findBookByTitleAndAuthor("English", "Lapitskaya") + "\n"); 
		System.out.println(library.findBookByTitleAndAuthor("Hat", "Nosov") + "\n"); 
		System.out.println(library.findBookByAuthor("Panova") + "\n");
		System.out.println(library.sortAuthorBooksByPrice("Nosov") + "\n");
		System.out.println(library.sortAuthorBooksByPublishingYear("Beits") + "\n");
		System.out.println(library.sortAuthorBooksByPrice("Panova") + "\n");
		System.out.println(library.sortAuthorBooksByPublishingYear("Panova") + "\n");


	}

}