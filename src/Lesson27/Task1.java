package Lesson27;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Task1 {
	public static void main(String[] args) {
		LocalDateTime startTime = LocalDateTime.of(2020, 6, 25, 19, 47);
		LocalDateTime plusMonths = startTime.plusMonths(3);
		LocalDate localDate = plusMonths.toLocalDate();
		LocalTime localTime = plusMonths.toLocalTime();
		System.out.println("Start time is: " + startTime);
		System.out.println("Time after time gain is: " + plusMonths);
		System.out.println("LocalDate from LocalDateTime is: " + localDate);
		System.out.println("LocalTime from LocalDateTime is: " + localTime);
	}
}
