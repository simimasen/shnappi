package presentDemo;

/**
 * sample for Polymorphism
 * */
public class StudentDetail extends Student{
	private double grade;

	public StudentDetail(int id, String name, int age, String sex,double grade) {
		super(id,name,age,sex);
		setGrade(grade);
	}
	
	public void printStudentInfo(){
		System.out.println("the student grade is "+ getGrade());
	}
	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}
	
}
