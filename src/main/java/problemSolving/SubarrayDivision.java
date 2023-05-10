package problemSolving;

import java.util.List;

public class SubarrayDivision {

  /*
      Task: Two children, Lily and Ron, want to share a chocolate bar. Each of the squares has an integer on it.
      Lily decides to share a contiguous segment of the bar selected such that:
       - The length of the segment matches Ron's birth month, and,
       - The sum of the integers on the squares is equal to his birthday.
       Determine how many ways she can divide the chocolate.
   */

  public static int birthday(List<Integer> s, int d, int m) {
    int count = 0;
    for (int i = 0; i < s.size(); i++) {
      int sum = 0;
      int length = Math.min(i + m, s.size());
      for (int j = i; j < length; j++) {
        sum += s.get(j);
      }
      if(sum == d) {
        count++;
      }
    }
    return count;
  }

}
