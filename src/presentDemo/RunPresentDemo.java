package presentDemo;

public class RunPresentDemo {

	public static void main(String[] args) {
		//Encapsulation
//		Student student = new Student();
//		student.setAge(20);
//		System.out.println(student.getAge());
		
		//Polymorphism
		
		StudentDetail sd = new StudentDetail(1001,"Charlie",20,"male",50);
		sd.printStudentInfo();
		System.out.println("from student detail -------------");
		Student student = new StudentDetail(1001,"Charlie",20,"male",50);
		student.printStudentInfo();
		System.out.println("from student  -------------");
	}

}
