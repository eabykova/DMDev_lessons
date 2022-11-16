package DMDevCourse.Lesson27;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class DateTimeDemo {
	public static void main(String[] args) {
		ZonedDateTime now = ZonedDateTime.now();
		System.out.println(now);
		//methods we'll use are immutable and return new objects:
		long milli = now.toInstant().toEpochMilli(); //convert to versions extends java.util.Date and then get curTime in ms
		System.out.println(milli);//currentTime in milliseconds since 1970-01-01-00:00

		ZonedDateTime plusOneDay = now.plus(1L, ChronoUnit.DAYS);//change date for a day over
		//possible to use methods as .plusSeconds, .plusDays, .plusHours etc. But the .plus is universal method to use
		System.out.println(plusOneDay);

		ZonedDateTime minusMinute = now.minus(1L, ChronoUnit.MINUTES);//the same about .minus
		System.out.println(minusMinute);

		ZonedDateTime truncatedDate = now.truncatedTo(ChronoUnit.DAYS);//zeroing method
		System.out.println(truncatedDate);

		boolean isAfter = now.isAfter(plusOneDay);//comparison methods return boolean
		System.out.println(isAfter);

		LocalDateTime now1 = LocalDateTime.now(ZoneOffset.UTC);//in this using of LocalDateTime we can new about current
		System.out.println(now1);//time on UTC +0
		LocalDateTime nowHere = LocalDateTime.now();
		System.out.println(nowHere);
	}
}
