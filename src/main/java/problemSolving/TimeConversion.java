package problemSolving;

/*
  Task: Given a time in 12hour AM/PM format, convert it to military (24-hour) time.
  Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
  - 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.
 */
public class TimeConversion {

  public static String timeConversion(String s) {
    int hours = Integer.parseInt(s.substring(0, 2));
    int minutes = Integer.parseInt(s.substring(3, 5));
    int seconds = Integer.parseInt(s.substring(6, 8));
    String period = s.substring(8, 10);
    if (period.equals("PM") && hours != 12) {
      hours += 12;
    } else if (period.equals("AM") && hours == 12) {
      hours = 0;
    }
    return String.format("%02d:%02d:%02d", hours, minutes, seconds);
  }
}
