public class GradStudent extends Student {

	private int graduateID;

	public GradStudent() {
		super();
		graduateID = 0;
	}

	public GradStudent(String name, ArrayList<Integer> tests, String grade, int idNumber) {
		super(name, tests, grade);
		graduateID = idNumber;
	}

	public int getID() {
		return graduateID;
	}


}
