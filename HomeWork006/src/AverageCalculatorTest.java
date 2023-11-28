import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import seminars.third.hw.MainHW;

import static org.assertj.core.api.Assertions.assertThat;

public class AverageCalculatorTest {
    @Test
    void testCompareAverage_FirstListGreater() {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(1, 2);
        String expectedResult = "Первый список имеет большее среднее значение";

        String result = AverageCalculator.compareAverage(list1, list2);

        assertEquals(expectedResult, result);
    }

    @Test
    void testCompareAverage_SecondListGreater() {
        List<Integer> list1 = Arrays.asList(1, 2);
        List<Integer> list2 = Arrays.asList(1, 2, 3);
        String expectedResult = "Второй список имеет большее среднее значение";

        String result = AverageCalculator.compareAverage(list1, list2);
        Assertions.
        assertEquals(expectedResult, result);
    }

    @Test
    void testCompareAverage_EqualAverages() {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6);
        String expectedResult = "Средние значения равны";

        String result = AverageCalculator.compareAverage(list1, list2);

        assertEquals(expectedResult, result);
    }

    @Test
    void testCompareAverage_EmptyLists() {
        List<Integer> list1 = Collections.emptyList();
        List<Integer> list2 = Collections.emptyList();
        String expectedResult = "Средние значения равны";

        String result = AverageCalculator.compareAverage(list1, list2);

        assertEquals(expectedResult, result);
    }
}