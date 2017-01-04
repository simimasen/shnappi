package presentDemo;

/**
 * sample for Encapsulation
 * */

public class Student {
	private int id;
	private String name;
	private int age;
	private String sex;
	public Student(int id, String name, int age, String sex){
		System.out.println("Constructing an Student");
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	public void printStudentInfo(){
		System.out.println("the student information is "+ this.id +" "+this.name+" "+this.age+" "+this.sex);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

}
