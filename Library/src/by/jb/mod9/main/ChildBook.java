package by.jb.mod9.main;

public class ChildBook extends Book {
	
	private int age;
	
	public ChildBook (String title, String author, double price, int publishingYear, int age) {
		super(title, author, price, publishingYear);
		this.age = age;
	}
	
	public void setAge (int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", age=" + age;
	}
	
}
