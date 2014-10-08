/**
 * See Barron's page 130
 */

public class Student {

	private String name;
	private ArrayList<Integer> testScores;
	private String overallGrade;

	// Default Constructor
	public Student() {
		name = "";
		testScores = new ArrayList<Integer>();
		overallGrade = "";
	}

	public Student(String name, 
			ArrayList<Integer> tests, String grade) {
		this.name = name;
		testScores = tests;
		overallGrade = grade;
	}

	public String getName() {
		return name;
	}

	public String getGrade() {
		return overallGrade;
	}

	public void setGrade(String grade) {
		overallGrade = grade;
	}

	public double getTestAverage() {
		double total = 0;
		for(int i = 0; i < testScores.size(); i++) {
			total += testScores.get(i);
		}

		return total / testScores.size();
	}

	// See UnderGradStudent
	public void computeGrade() {
		if(getTestAverage() >= 65) {
			overallGrade = "Pass";
		} else {
			overallGrade = "Fail";
		}
	}


	@Override
	public String toString() {
		return super.toString() +"\nName: " + name;
	}

	@Override
	public boolean equals(Object o) {

	}

}

