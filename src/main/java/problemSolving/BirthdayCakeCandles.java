package problemSolving;

import java.util.List;

/*
  Task: You are in charge of the cake for a child's birthday. You have decided the cake will have one candle for each year of their total age.
   They will only be able to blow out the tallest of the candles. Count how many candles are tallest.
 */
public class BirthdayCakeCandles {

  public static int birthdayCakeCandles(List<Integer> candles) {
    int maxNum = 0;
    int sumOfMax = 0;
    for (Integer c : candles) {
      if (c == maxNum) {
        sumOfMax++;
      } else if (c > maxNum) {
        maxNum = c;
        sumOfMax = 1;
      }
    }
    return sumOfMax;
  }


}
