package Lesson27;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Task8 {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		//two ways to add some days:
		LocalDateTime plus = now.plusDays(42);
		LocalDateTime plus1 = now.with(temporal -> temporal.plus(42L, ChronoUnit.DAYS));
		System.out.println("Current date and time: " + now);
		System.out.println("plus 42 days: " + plus);
		System.out.println("plus 42 days: " + plus1);
	}
}
