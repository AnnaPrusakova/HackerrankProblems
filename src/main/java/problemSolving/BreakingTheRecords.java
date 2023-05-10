package problemSolving;

import java.util.Arrays;
import java.util.List;

public class BreakingTheRecords {

  /*
      Task: Maria plays college basketball and wants to go pro.
      Each season she maintains a record of her play.
      She tabulates the number of times she breaks her season record for most points and least points in a game.
      Points scored in the first game establish her record for the season, and she begins counting from there.
   */

  public static List<Integer> breakingRecords(List<Integer> scores) {
    int minCount = 0;
    int maxCount = 0;
    int min = scores.get(0);
    int max = scores.get(0);

    for (int i = 0; i < scores.size(); i++) {
      if (scores.get(i) < min) {
        min = scores.get(i);
        minCount++;
      } else if (scores.get(i) > max) {
        max = scores.get(i);
        maxCount++;
      }
    }
    return Arrays.asList(maxCount, minCount);
  }

}
