public class UnderGradStudent extends Student {
	
	public UnderGradStudent() {
		super();
	}

	public UnderGradStudent(String name, ArrayList<Integer> tests, String grade) {
		super(name, tests, grade);
	}

	@Override
	public void computeGrade() {
		if(getTestAverage() >= 90) {
			setGrade("Honors");
		} else {
			super.computeGrade();
		}
	}
	
}
