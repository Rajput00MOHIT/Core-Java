package in.co.oop;

public class constructor1 {
	 private int modelYear;
	 private String modelName;

	public int getModelYear() {
		return modelYear;
	}

	public String getModelName() {
		return modelName;
	}

	public  constructor1(int year, String name) {
		 this.modelName = name;
		 this.modelYear = year;
	}

	public static void main(String[] args) {
		constructor1 myCar = new constructor1(1969, "Mustang");
		System.out.println(myCar.getModelYear() + " " + myCar.getModelName());
	}
}


	