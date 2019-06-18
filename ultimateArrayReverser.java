public class ArrayReverser {
   public static String[] reverse(String[] a) {
    String revTextTmp = "", revText = "";
    for ( String atom : a ) { revTextTmp += atom; }
    for ( int i = revTextTmp.length()-1; i >= 0; i-- ) {
      revText += String.valueOf(revTextTmp.charAt(i));
    }
    int from = 0, to = a[0].length();
    String[] back = new String[a.length];
    for ( int i = 0, n = a.length; i < n; i++) {
      back[i] = revText.substring(from, to);
      from = to;
      to = ( i+1 < n ) ? from + a[(i+1)].length() : revText.length();
    }
    return back;
   }
}
