public class Kata
{
  public static String reverseWords(final String original)
  {
    String visszafele = "";
    String[] szavak = original.split(" ");
    int index = 0;
    for ( String szo : szavak ) {
      String[] betuk = szo.split("");
      for ( int i = szo.length()-1; i >= 0; i-- ) {
        visszafele += betuk[i];
      }
      index++;
      visszafele += ( index < szavak.length ) ? " " : "";
    }
    return (szavak.length > 0) ? visszafele : original;
  }
}
