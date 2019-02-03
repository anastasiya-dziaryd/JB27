package by.jb.mod12.main;

import by.jb.mod12.main.Library.Book;
import by.jb.mod12.main.Library.Library;
import by.jb.mod12.main.Reader.JsonReader;

public class BooksFromFile {
	
  private static String WorkFolderPath = "D://JavaBasics//Lesson12";
  private static String jsonFileName = "TESTJSON.json";
	
  public static void main(String args[])
  {
	  JsonReader jsonReader = new JsonReader();
	  Library library = jsonReader.Read(WorkFolderPath, jsonFileName);
	  for (Book book : library.getBooks()) {
		  System.out.println(book.toString());
	  }
  }
}