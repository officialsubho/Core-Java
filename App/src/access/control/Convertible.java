package access.control;

public class Convertible extends SportsCar {

	public void doThings() {

		SportsCar sc = new SportsCar();
		sc.doStuff();
	}

	public void doMoreStuff() {
		doStuff();
	}
}
