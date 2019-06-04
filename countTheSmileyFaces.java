import java.util.*;
import java.util.regex.Pattern;

public class SmileFaces {
  
  public static int countSmileys(List<String> arr) {
      int count = 0;
      for (String smile : arr) {
        count += Pattern.matches("[:;][-~]?[)D]", smile)? 1 : 0;
      }
      return count;
  }
}
