package problemSolving;

import java.util.*;

/*
 * Task: Given a square matrix, calculate the absolute difference between the sums of its diagonals.
 */
public class DiagonalDifference {

  public static int diagonalDifference(List<List<Integer>> arr) {
    int leftToRight = 0;
    int rightToLeft = 0;
    int size = arr.size();
    int j = size - 1;
    for (int i = 0; i < size; i++) {
      leftToRight += arr.get(i).get(i);
      rightToLeft += arr.get(i).get(j);
      j--;
    }
    return Math.abs(leftToRight - rightToLeft);
  }
}
