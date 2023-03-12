package problemSolving;

import java.io.*;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.toList;

/*
 * Task: Given a square matrix, calculate the absolute difference between the sums of its diagonals.
 */
public class DiagonalDifference {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(
        new FileWriter(System.getenv("OUTPUT_PATH")));

    int n = Integer.parseInt(bufferedReader.readLine().trim());

    List<List<Integer>> arr = new ArrayList<>();

    IntStream.range(0, n).forEach(i -> {
      try {
        arr.add(
            Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList())
        );
      } catch (IOException ex) {
        throw new RuntimeException(ex);
      }
    });

    int result = diagonalDifference(arr);

    bufferedWriter.write(String.valueOf(result));
    bufferedWriter.newLine();

    bufferedReader.close();
    bufferedWriter.close();
  }

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
