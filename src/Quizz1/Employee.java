package Quizz1;

public class Employee {
	private int no;
	private String name;
	private String Career;
	
	public Employee() {}

	public Employee(int no, String name, String career) {
		super();
		this.no = no;
		this.name = name;
		Career = career;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCareer() {
		return Career;
	}

	public void setCareer(String career) {
		Career = career;
	}
	
	
	
}
