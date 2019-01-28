package by.jb.mod9.main;

public class Schoolbook extends Book {
	
	private int form;
		
		public Schoolbook (String title, String author, double price, int publishingYear, int form) {
			super(title, author, price, publishingYear);
			this.form = form;
		}
		
		public void setForm (int form) {
			this.form = form;
		}
		
		public int getForm() {
			return form;
		}
		
		@Override
		public String toString() {
			return super.toString() + ", form=" + form;
		}

}