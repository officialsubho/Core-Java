package my.Square;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

class Main {

	public static void main(String[] args) {

		javaDatetimeapi();
	}

	private static void javaDatetimeapi() {

		LocalDate date = LocalDate.now();
		System.out.println("local date is : " + date);

		LocalTime time = LocalTime.now();
		System.out.println("local time is :" + time);

		LocalDateTime datetime = LocalDateTime.now();
		System.out.println("Local date and time is : " + datetime);
		
		DateTimeFormatter format = DateTimeFormatter.o
	}
}
