package Lesson27;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task3 {
	public static void main(String[] args) {
		String formatDate = "26-03-1968T09:24";
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy'T'HH:mm");//need to escape char T
		LocalDateTime local = LocalDateTime.parse(formatDate, dateTimeFormatter);//first arg is string to parse date,
																	// second arg is formatter for new obj LocDateTime
		System.out.println(local);
	}
}
