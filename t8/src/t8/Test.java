package t8;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Masina testCar=new Masina("Peugeot", "negru");
		System.out.println(testCar.toString());
		testCar.revopsire("gri");
		System.out.println(testCar.toString());
		Student testStud=new Student("Popescu", "Maria", testCar);
		System.out.println(testStud.toString());
		
		System.out.println();
		Masina myCar=new Masina("Opel", "roz");
		Student me=new Student("Giurgiu", "Alexandra", myCar);
		System.out.println("Original ");
		System.out.println(me.toString());
		
		Student shallowMe=(Student)me.shallowClone();
		System.out.println("Shallow Clone");
		System.out.println(shallowMe.toString());
		Student deepMe=(Student)me.deepClone();
		System.out.println("Deep Clone");
		System.out.println(deepMe.toString());
		
		System.out.println();
		myCar.revopsire("negru");
		System.out.println("Original ");
		System.out.println(me.toString());
		System.out.println("Shallow Clone");
		System.out.println(shallowMe.toString());
		System.out.println("Deep Clone");
		System.out.println(deepMe.toString());
	}

}
