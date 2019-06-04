public class Solution {

  public static boolean validatePin(String pin) {
    int full = pin.length();
    int last = pin.replaceAll("[0-9]", "").length();
    return ( last == 0 && ((full - last) == 4 || (full - last) == 6) ) ? true : false;
  }
}
