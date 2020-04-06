package ui;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class DateTimeApp {

	public static void main(String[] args) {
		System.out.println("Create some dates/times...");
		LocalDate now1 = LocalDate.now();
		LocalTime now2 = LocalTime.now();
		LocalDateTime now3 = LocalDateTime.now();
		
		System.out.println(now1);
        System.out.println(now2);
        System.out.println(now3);
        
        System.out.println("Generate some holiday dates....");
        LocalDate julyFourth = LocalDate.of(2020, 7, 4);
        LocalDate christMas = LocalDate.of(2020, 12, 25);
        System.out.println(julyFourth);
        System.out.println(christMas);
        
        LocalDate memorialDay = LocalDate.parse("2020-05-25");
        System.out.println(memorialDay);
        
        System.out.println("Year:  "+now1.getYear());
        System.out.println("Month:  "+now1.getMonth());
        System.out.println("MonthValue:  "+now1.getMonthValue());
        System.out.println("DOY:  "+now1.getDayOfYear());
        System.out.println("DOW:  "+now1.getDayOfWeek());
        
        System.out.println("Compare some dates");
        System.out.println("now isBefore memorial day??? "+now1.isBefore(memorialDay));
        System.out.println("now isAfter memorial day??? "+now1.isAfter(christMas));
        System.out.println("now compareTo memorial day??? "+now1.compareTo(memorialDay));
        
        System.out.println("Adjust some dates");
        System.out.println("Memorial Day of next year.... "+memorialDay.withYear(2021));
        
        System.out.println("Adding Subtracting Time");
        LocalDate nowPlus3Weeks = now1.plus(3, ChronoUnit.WEEKS);
        System.out.println("3 weeks from now... "+nowPlus3Weeks);
        
        System.out.println("How many days until Christmas???");
        System.out.println(now1.until(christMas, ChronoUnit.DAYS));
        
        System.out.println("Days between July 4th and Memorial Day"+ ChronoUnit.DAYS.between(julyFourth, memorialDay));
        
        System.out.println("Formatting Dates");
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        System.out.println("Current Date in Full format: "+formatter.format(now1));
	}

}
