package finalwork;

import java.util.List;

/**
* Average calculator.
*/
public final class AverageCalculator {
  private AverageCalculator() {
  }

  /**
   * Compare two arrays by average.

   * @param list1 - список целых чисел
   * @param list2 - список целых чисел
   * @return String
   */
  public static String compareAverage(final List<Integer> list1,
                                      final List<Integer> list2) {
    double average1 = calculateAverage(list1);
    double average2 = calculateAverage(list2);

    if (average1 > average2) {
      return "Первый список имеет большее среднее значение";
    } else if (average1 < average2) {
      return "Второй список имеет большее среднее значение";
    } else {
      return "Средние значения равны";
    }
  }

  /**
 * Метод рассчета среднего значения элементов массива.

 * @param list - список целых чисел
 * @return double
 */
  private static double calculateAverage(final List<Integer> list) {
    if (list == null || list.isEmpty()) {
      return 0.0;
    }

    double sum = 0.0;
    for (int num : list) {
      sum += num;
    }

    return sum / list.size();
  }
}
