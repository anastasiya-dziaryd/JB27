package by.jb.mod9.main;

public class ProgrammerBook extends Book {
	
	private String level;
		
	public ProgrammerBook (String title, String author, double price, int publishingYear, String level) {
		super(title, author, price, publishingYear);
		this.level = level;
	}
	
	public void setLevel (String level) {
		this.level = level;
	}
	
	public String getLevel() {
		return level;
	}

	@Override
	public String toString() {
		return super.toString() + ", level=" + level;
	}
}
