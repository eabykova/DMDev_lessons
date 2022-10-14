package Lesson27;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Task6 {
	public static void main(String[] args) {
		LocalDate dateOfToday = LocalDate.now();
		LocalDate dateOfPast = LocalDate.of(2018, 7, 7);
		//two ways to create:
		LocalDateTime todayMidnight = LocalDateTime.of(dateOfToday, LocalTime.MIDNIGHT);
		LocalDateTime pastMidnight = dateOfPast.atStartOfDay();

		Duration duration = Duration.between(pastMidnight, todayMidnight);
		System.out.println("Number of seconds between two dates: " + duration.getSeconds());
	}
}
