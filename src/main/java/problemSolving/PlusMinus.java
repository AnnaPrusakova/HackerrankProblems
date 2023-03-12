package problemSolving;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

/*
*Task: Given an array of integers, calculate the ratios of its elements that are positive,
* negative, and zero. Print the decimal value of each fraction on a new line with  places after the decimal.
*/

public class PlusMinus {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(bufferedReader.readLine().trim());

    List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
        .map(Integer::parseInt)
        .collect(toList());

    plusMinus(arr);

    bufferedReader.close();
  }

  public static void plusMinus(List<Integer> arr) {
    int size = arr.size();
    int positiveCount = 0;
    int negativeCount = 0;
    int zeroCount = 0;

    for (Integer i : arr) {
      if (i > 0) {
        positiveCount += 1;
      } else if (i < 0) {
        negativeCount += 1;
      } else {
        zeroCount += 1;
      }
    }

    System.out.printf("%.6f %n", positiveCount * 1.0 / size);
    System.out.printf("%.6f %n", negativeCount * 1.0 / size);
    System.out.printf("%.6f %n", zeroCount * 1.0 / size);
  }

}
