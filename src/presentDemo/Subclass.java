package presentDemo;

class Superclass {
	int id;

	Superclass(int id) {
		this.id = id;
	}

	public void getId() {
		System.out.println("The value of the variable named age in super class is: "+ id);
	}
}

public class Subclass extends Superclass {
	Subclass(int id) {
		super(id);
	}

	public static void main(String argd[]) {
		Subclass s = new Subclass(24);
		s.getId();
	}
}