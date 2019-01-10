package by.jb.mod6_part2.main;

public class ProgramStudent {
	

	public static void main(String[] args) {
		
		Group gr1 = new Group();
		
		Student st1 = new Student();
		Mark st1Math = new Mark(10);
		Mark st1English = new Mark(9);
		Mark st1Literature = new Mark(9);
		st1.add(st1Math);
		st1.add(st1English);
		st1.add(st1Literature);
		
		Student st2 = new Student();
		Mark st2Math = new Mark(3);
		Mark st2English = new Mark(4);
		Mark st2Literature = new Mark(2);
		st2.add(st2Math);
		st2.add(st2English);
		st2.add(st2Literature);
		
		Student st3 = new Student();
		Mark st3Math = new Mark(8);
		Mark st3English = new Mark(5);
		Mark st3Literature = new Mark(9);
		st3.add(st3Math);
		st3.add(st3English);
		st3.add(st3Literature);
		
		gr1.add(st1);
		gr1.add(st2);
		gr1.add(st3);
		
		System.out.println("Средний балл учебной группы: " + gr1.getAvgGroupMark());
		gr1.getAvgAllStudentsMark();
		System.out.println("Число отличников: " + gr1.getExcelentStudentCounter());
		System.out.println("Количество студентов, имеющих '2': " + gr1.getBadStudentCounter());
	}
}
