package Lesson27;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Task7 {
	public static void main(String[] args) {
		Instant now = Instant.now();
		ZonedDateTime zonedDateTime = now.atZone(ZoneId.of("Africa/Cairo"));
		System.out.println("Current time here: " + now);
		System.out.println("Current time in Cairo, Africa: " + zonedDateTime);
	}
}
