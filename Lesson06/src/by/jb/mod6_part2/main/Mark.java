package by.jb.mod6_part2.main;

public class Mark {
	
	private int mark;
	
	public Mark (int mark) {
		this.mark = mark;
	}

	public void setMark (int mark) {
		 this.mark = mark;
	}
	
	public int getMark () {
		 return mark;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + mark;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mark other = (Mark) obj;
		if (mark != other.mark)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "" + mark;
	}
	
}
