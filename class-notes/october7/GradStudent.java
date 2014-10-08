public class GradStudent extends Student {

	// Should be unique for every student
	private int graduateID;

	public GradStudent() {
		super();
		graduateID = 0;
	}

	public GradStudent(String name, 
			ArrayList<Integer> tests, String grade, int idNumber) {
		super(name, tests, grade);
		graduateID = idNumber;
	}

	public int getID() {
		return graduateID;
	}

	@Override
	public String toString() {
		return super.toString() + "\nGraduate ID: " + 
						graduateID;
	}

	@Override
	public boolean equals(Object o) {
		if( ! o instanceof GradStudent ) {
			return false;
		}

		// return ((GradStudent)o).getID() == this.getID();
		
		GradStudent g = (GradStudent) o;
		return g.getID() == this.getID();
	}

}

