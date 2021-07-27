package i_Interfaces;

public class b_LionImplement implements a_AnimalInterface {

	@Override
	public void eat() {
		System.out.println("Lion eat");
		
	}

	@Override
	public void travel() {
		System.out.println("Lion travels");
		
	}

	public static void main(String[] args) {
		b_LionImplement lion = new b_LionImplement();
		lion.eat();
		lion.travel();
	}

}
