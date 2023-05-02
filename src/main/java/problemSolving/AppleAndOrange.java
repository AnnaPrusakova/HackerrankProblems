package problemSolving;

import java.util.List;

public class AppleAndOrange {

  /*
   * Task: Sam's house has an apple tree and an orange tree that yield an abundance of fruit.
   * Using the information given below, determine the number of apples and oranges that land on Sam's house.
   */

  public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples,
      List<Integer> oranges) {
    int fallAppleCount = 0;
    int fallOrangeCount = 0;

    for (Integer apple : apples) {
      int position = a + apple;
      if (position >= s && position <= t) {
        fallAppleCount++;
      }
    }

    for (Integer orange : oranges) {
      int position = b + orange;
      if (position >= s && position <= t) {
        fallOrangeCount++;
      }
    }
    System.out.println(fallAppleCount);
    System.out.println(fallOrangeCount);
  }

}
