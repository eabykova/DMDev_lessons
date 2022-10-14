package Lesson27;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task2 {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		DateTimeFormatter dayMonthYear = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		DateTimeFormatter dayMonthYearAndTime = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		String format = date.format(dayMonthYear);
		System.out.println(date);
		System.out.println(format);
	}
}
