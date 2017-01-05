package presentAbstraction;

abstract class student {
    private String name;
    private int age;
    private int grand;

    public student(){}
    public student(String name,int age,int grand){
        this.name=name;
        this.age=age;
        this.grand=grand;
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
	public int getGrand() {
		return grand;
	}
	public void setGrand(int grand) {
		this.grand = grand;
	}
	abstract public void study();
    public void eat(){
        System.out.println("time to eat：");
    }
}
class Basicstudent extends student {
    public Basicstudent(){}
    public Basicstudent(String name,int age,int grand){
        super(name,age,grand);
    }
    public void study(){
        System.out.println("Basicstudent:   study");
    }

}
class Goodstudent extends student{

    public Goodstudent(){}
    public Goodstudent(String name,int age,int grand){
        super(name,age,grand);
    }

    public void study(){
        System.out.println("Goodstudent:  study");
    }
}
