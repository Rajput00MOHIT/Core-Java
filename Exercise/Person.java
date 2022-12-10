package in.co.Exercise;

public class Person {
	private String name;
	private String add;
	private int pincode;

	public Person() {

		System.out.println("i am defuld contecter");
	}

	public Person(String a) {
        this();
		System.out.println("i,m parameterised constructor");

	}

	public Person( String a,String b, int c) {
	     this(a);
	     this.add=b;
	     this.pincode=c;
	     
	     
		System.out.println("i am three parameterised Constructor");
	}
}
