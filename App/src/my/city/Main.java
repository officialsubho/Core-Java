package my.city;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {

	public static void main(String[] args) {

		LocalDate date = LocalDate.now();
		System.out.println(date.plusDays(2));
		LocalTime time = LocalTime.now();
		System.out.println(time);
		LocalDateTime datetime = LocalDateTime.now();
		System.out.println(datetime);

		LocalDate newdate = LocalDate.of(1988, 9, 15);
		newdate.minusDays(1);
		System.out.println(newdate); // trick question . Since Date is immutable
										// class , you have to store the return
										// value in a variable.

		System.out.println(LocalDate.of(1985, 7, 21));

		/*
		 * The date and Time classes have private constructors . In the exam you
		 * might get something like this . Dont fall for it . LocalDate date1 =
		 * new LocalDate(1985, 7, 21);
		 */
	}

}


