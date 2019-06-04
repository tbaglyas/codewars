public class Kata {
  public static int unluckyDays(int year) {
    int[] months = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
    int vissza = 0;
    for ( int month : months ) {
      if ( java.time.LocalDate.of(year, month, 13).getDayOfWeek() == java.time.DayOfWeek.FRIDAY ) vissza++;
    }
    return vissza;
  }
}
