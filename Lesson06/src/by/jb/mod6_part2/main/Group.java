package by.jb.mod6_part2.main;

import java.util.ArrayList;
import java.util.List;

public class Group {

	private List<Student> students = new ArrayList<Student>();
	
	public void add(Student st) {
		students.add(st);
	}
	
	public void delete(Student st) {
		students.remove(st);
	}
	
	public void getAvgAllStudentsMark() {
		int i = 1;
		for (Student st : students) {
			System.out.println("Средний балл " + i + " студента: " + st.showAvgMark());
			i++;
		}
	}
	
	public double getAvgGroupMark () {
		double result = 0;
		for (Student st : students) {
			result += st.showAvgMark ();
		}
		return result / students.size();
	}
	
	public int getExcelentStudentCounter () {
		int result = 0;
		for (Student st : students) {
			if (st.isExcelent () == true) {
				result += 1;
			};
		}
		return result;
	}
	
	public int getBadStudentCounter () {
		int result = 0;
		for (Student st : students) {
			if (st.hasBadMark () == true) {
				result += 1;
			};
		}
		return result;
	}
	
}
