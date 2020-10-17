package github.problems.practice;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class TimeDate {

  public static void main(String[] args) {

    String s = "Wed Jun 03 17:00:00 PDT 2020";

    System.out.println(convertDateToUTCTime(s));
  }

  public static String convertDateToUTCTime(String dateInString) {
    String utcDate = null;
    DateFormat utcFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");

    try {
      utcDate = utcFormat.format(convertToCalendarDate(dateInString));
    } catch (Exception e) {
      e.printStackTrace();
      //utcDate = dateInString;
    }
    return utcDate;
  }

  public static Date convertToCalendarDate(String calendarDate) throws ParseException {
    Calendar cal = Calendar.getInstance();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
    cal.setTime(sdf.parse(calendarDate));

    System.out.println(cal.getTimeZone());

    return cal.getTime();
  }
}
