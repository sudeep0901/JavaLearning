package com.sudeep.datetime;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.Year;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Set;

import javax.swing.text.DateFormatter;

public class DateTimeMain {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		LocalDate ldate = LocalDate.now();
		
		LocalDate dob = LocalDate.of(1984, Month.JANUARY, 9);
		System.out.println(ldate);
		System.out.println(dob);
		
		Instant ins = Instant.EPOCH;
		System.out.println(ins);

		System.out.println(ins.getEpochSecond());
		System.out.println(ins.now());
		System.out.println(ins.now().getEpochSecond());
		
		ZonedDateTime zdatetime = ZonedDateTime.now();
		System.out.println(zdatetime);
		System.out.println(zdatetime.getYear());
		
		Year year = Year.now();
		
		System.out.println(year);
		YearMonth yearMonth = YearMonth.now();
		System.out.println(yearMonth);
		YearMonth ym  = YearMonth.of(2019, 10);
		System.out.println(ym);
		
		OffsetDateTime offsetDt = OffsetDateTime.now();
		System.out.println(offsetDt);
		System.out.println(offsetDt.getOffset());
		
		DayOfWeek dow = DayOfWeek.MONDAY.plus(3);
		System.out.println(dow);
		
		Locale locale = Locale.getDefault();
		System.out.println(locale);
		
		System.out.println(dow.getDisplayName(TextStyle.FULL, locale));
		System.out.println(dow.getDisplayName(TextStyle.NARROW, locale));
		System.out.println(dow.getDisplayName(TextStyle.SHORT, locale));
		
		LocalDate date = LocalDate.of(2000, Month.NOVEMBER, 20);
		TemporalAdjuster adj = TemporalAdjusters.next(DayOfWeek.WEDNESDAY);
		LocalDate nextWed = date.with(adj);
		
		System.out.println(nextWed);
		System.out.printf("time is %s", nextWed);
		
		LocalTime thissec;
		
//		for(;;) {
//			thissec = LocalTime.now();
//			System.out.println(thissec.getHour() + " : "+ thissec.getSecond());
//		}
		
		
		Set<String> allZones = ZoneId.getAvailableZoneIds();
		
		System.out.println(allZones);
		List<String> zoneList = new ArrayList<String>(allZones);
		
		LocalDateTime dt = LocalDateTime.now();
		Collections.sort(zoneList);
		
		for(String s : allZones)
		{
			
			ZoneId zone = ZoneId.of(s);
			ZonedDateTime zdt = dt.atZone(zone);
			ZoneOffset zoff = zdt.getOffset();
			System.out.println(zone);
			System.out.println(zdt);
			System.out.println(zoff);
//			Thread.sleep(5000);;
//			System.out.println(s);
		}
		
		String in = "19590709";
		LocalDate date1 = LocalDate.parse(in, DateTimeFormatter.BASIC_ISO_DATE);
		System.out.println(date1);

		  in = "Jun-01-1997";

		DateTimeFormatter df = DateTimeFormatter.ofPattern("MMM-d-yyyy");
		date1 = LocalDate.parse(in,df);
		System.out.println(date1);
	}
}

	