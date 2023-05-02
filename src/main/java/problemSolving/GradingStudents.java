package problemSolving;

import java.util.ArrayList;
import java.util.List;

public class GradingStudents {

  /*
    Task: HackerLand University has the following grading policy:
    Every student receives a grade in the inclusive range from 0 to 100.
    Any  grade less than 100 is a failing grade.
    Sam is a professor at the university and likes to round each student's grade according to these rules:
      If the difference between the grade and the next multiple of 5 is less than 3, round grade up to the next multiple of 5.
      If the value of grade is less than 38, no rounding occurs as the result will still be a failing grade.
   */

  public static List<Integer> gradingStudents(List<Integer> grades) {
    List<Integer> finalGrades = new ArrayList<>();
    for (Integer grade : grades) {
      if (grade < 38) {
        finalGrades.add(grade);
      } else {
        int grade2 = (int) (Math.ceil(grade / 5.0) * 5);
        int result = (grade2 - grade) < 3 ? grade2 : grade;
        finalGrades.add(result);
      }
    }
    return finalGrades;
  }

}
