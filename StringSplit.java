/* 
 * Complete the solution so that it splits the string 
 * into pairs of two characters. 
 * If the string contains an odd number of characters 
 * then it should replace the missing second character 
 * of the final pair with an underscore ('_').
 */

import java.util.ArrayList;

public class StringSplit {
  public static String[] solution(String s) {
    ArrayList<String> arr = new ArrayList<String>();
    int len = s.length();

    for (int i = 0; i < s.length(); i += 2) {
      if (len % 2 == 0 || len % 2 != 0 && i != len - 1) {
        arr.add(s.substring(i, i + 2));
      } else {
        arr.add(s.charAt(i) + "_");
      }
    }
    
    return arr.toArray(new String[0]);
  }
}
