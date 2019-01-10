package by.jb.mod6_part2.main;

import java.util.ArrayList;
import java.util.List;

public class Student {
	
	private List<Mark> marks = new ArrayList<Mark>();
	
	public List<Mark> getMarks() {
		return marks;
	}
	
	public void add(Mark mark) {
		marks.add(mark);
	}
	
	public void delete(Mark mark) {
		marks.remove(mark);
	}
	
	public double showAvgMark () {
		double sum = 0;
		double tempMark = 0;
		for (int i = 0; i < marks.size(); i++) {
			tempMark = Integer.valueOf(marks.get(i).toString());
			sum += tempMark;
		}
		return (sum / marks.size());
	}
	
	public boolean isExcelent () {
		for (Mark mark : marks) {
			if (mark.getMark() < 9) {
				//System.out.println("Не отличник");
				return false;
			} 
		}
		//System.out.println("Отличник");
		return true;
	}
	
	public boolean hasBadMark () {
		Mark m = new Mark(2);
		return marks.contains(m);
	}

}
