package access.control;

public class Driver {

	public static void main(String[] args) {

		SportsCar sc = new SportsCar();
		sc.doStuff();
		
		Convertible cv = new Convertible();
		cv.doMoreStuff();
	}

}
