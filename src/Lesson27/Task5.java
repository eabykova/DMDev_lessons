package Lesson27;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Task5 {
	public static void main(String[] args) {
		LocalDate dateOfToday = LocalDate.now();
		LocalDate dateOfPast = LocalDate.of(2018, 7, 7);
		Period period = Period.between(dateOfToday, dateOfPast);
		System.out.println("Number of days since dateOfPast: " + period.getDays());//check why does not work?
		long between = ChronoUnit.DAYS.between(dateOfPast, dateOfToday);
		System.out.println("Number of days since dateOfPast using ChronoUnit: " + between);
	}
}
