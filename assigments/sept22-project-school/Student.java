package edu.school;

public class Student {

	private String name;
	private int graduationYear;

	public Student(String name, int gradYear) {
		this.name = name;
		graduationYear = gradYear;
	}

	public String getName() {
		return name;
	}

	public int getGraduationYear() {
		return graduationYear;
	}

}
