package my.exception;

public class Main {

	public static void main(String[] args) throws Exception{

		try {
			m1();
			System.out.println("In A");
		} catch (Exception e) {
			System.out.println("Throwing exception from m1");
		}
		finally{
			System.out.println("In finally");
		}
		System.out.println("outside of try-catch");
	}

	
	public static void m1() throws Exception {
		//System.out.println("in m1");
		throw new Exception();

	}

}