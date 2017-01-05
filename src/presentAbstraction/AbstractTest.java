package presentAbstraction;

public class AbstractTest {

	public static void main(String[] args) {
		student s = new Basicstudent();
        s.setName("Basicstudent1");
        s.setAge(20);
        s.setGrand(1111);
        System.out.println(s.getName()+"----"+s.getAge()+"----"+s.getGrand());
        s.eat();
        s.study();

        s =new Basicstudent("Basicstudent1",20,2222);
        System.out.println(s.getName()+"----"+s.getAge()+"----"+s.getGrand());
        s.eat();
        s.study();

	}

}
