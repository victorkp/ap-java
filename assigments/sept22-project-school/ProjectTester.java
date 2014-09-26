package edu.school;


import java.util.ArrayList;

public class ProjectTester {


	public static void main(String[] args) {
		School school = new School();

		Classroom classA = new Classroom("Visual Basic");
		Classroom classB = new Classroom("C++");
		Classroom classC = new Classroom("AP Java");

		
		Student studA = new Student("Student A", 2016);
		Student studB = new Student("Student B", 2015);
		Student studC = new Student("Student C", 2015);
		Student studD = new Student("Student D", 2015);
		Student studE = new Student("Student E", 2016);

		classA.addStudent(studA);
		classA.addStudent(studB);
		classA.addStudent(studC);

		classB.addStudent(studB);
		classB.addStudent(studC);
		classB.addStudent(studD);

		classC.addStudent(studC);
		classC.addStudent(studD);
		classC.addStudent(studE);


		System.out.println("Classroom Tests");
		printTest("getClassName", classA.getClassName().equals("Visual Basic"));
		printTest("getNumberOfStudents", classA.getNumberOfStudents() == 3);
		printTest("hasStudent - true", classA.hasStudent(studA));
		printTest("hasStudent - false", classA.hasStudent(studD));
		classC.removeStudent(studE);
		printTest("removeStudent", !classC.hasStudent(studE));
		printTest("getNumberOfSeniors", classB.getNumberOfSeniors() == 3);

		System.out.println("School Tests");
		printTest("hasClassroom", school.hasClassroom(classA));
		printTest("getNumberOfClassrooms", school.getNumberOfClassrooms() == 3);
		printTest("getLargestClassroom", (school.getLargestClassroom() == classA || school.getLargestClassroom() == classB));
		printTest("mostStudentsInOneClass", school.mostStudentsInOneClass() == 3);
		printTest("getAverageNumberOfStudents", school.getAverageNumberOfStudents() == ((double)8)/3);

		System.out.print("\tgetClassesWithStudent: ");
		ArrayList<Classroom> classesWithStudent = school.getClassesWithStudent(studC);
		if(classesWithStudent.contains(classA) && classesWithStudent.contains(classB) && classesWithStudent.contains(classC)) {
			System.out.println("passed");
		} else {
			System.out.println("failed");
		}
	}

	private static void printTest(String message, boolean pass) {
		System.out.println("\tTesting " + message + ": " + (pass ? "passed" : "failed"));
	}

}
