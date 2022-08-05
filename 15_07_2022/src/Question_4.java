class Animal{
	void eat()
	{
		System.out.println("Animal eat");
	
	}
	void sleep()
	{
		System.out.println("Animal Sleep");
	}
}

class Bird extends Animal{
	void eat() {
		System.out.println("Bird eat");
		
	}
	void sleep() {
		System.out.println("Bird sleep");
	}
	void fly()
	{
		System.out.println("Bird fly");
	}
}

public class Question_4 {
	public static void main( String[] args)
	{
		Animal A= new Animal();
		System.out.println("Animal class");
		A.eat();
		A.sleep();
		System.out.println("Bird class");
		Bird B = new Bird();
		B.eat();
		B.sleep();
		B.fly();
	}

}
