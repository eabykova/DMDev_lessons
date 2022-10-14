package Lesson27;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Task4 {
	public static void main(String[] args) {
		//instant is a "dot on our timeline", does not keep timezone
		//we have to specify timezone by hands
		String formatDate = "26-03-1968T09:24";
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy'T'HH:mm");
		LocalDateTime local = LocalDateTime.parse(formatDate, dateTimeFormatter);
		//possible to create timezone using identifier "Zoned.of"
		Instant instant = local.toInstant(ZoneId.of("America/Chicago").getRules().getOffset(local));
		System.out.println("LocalDateTime: " + local);
		System.out.println("Instant: " + instant);
		System.out.println("Ime since start at 1/01/1970: " + instant.toEpochMilli());

	}
}
