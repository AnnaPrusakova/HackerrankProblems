package problemSolving;

import java.util.List;

/*
 Task: Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers.
 Then print the respective minimum and maximum values as a single line of two space-separated long integers.
 */
public class MiniMaxSum {

  public static void miniMaxSum(List<Integer> arr) {
    long min = Integer.MAX_VALUE;
    long max = Integer.MIN_VALUE;
    long sum = 0;

    for (Integer integer : arr) {
      sum += integer;
      min = Math.min(min, integer);
      max = Math.max(max, integer);
    }

    System.out.println((sum - max) + " " + (sum - min));
  }

}
