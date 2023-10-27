import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MultiplicationTest {
    /*
    Write a function that takes two parameters
    and returns the multiplication without using the multiplication.
     */

    /* fun multiply(int param1, int param2) return int param1 * param2 */
    private Multiplication multiplication;

    @BeforeEach
    public void init() {
        multiplication = new Multiplication();
    }

    @Test
    void testShouldReturnSixGivenParametersTwoAndThree() {
        int param1 = 2;
        int param2 = 3;
        int expected = 6;
        int actual = multiplication.multiply(param1, param2);
        assertThat(actual)
                .isEqualTo(expected);
    }

    @Test
    void testShouldReturnZeroGivenParametersTwoAndZero() {
        int param1 = 2;
        int param2 = 0;
        int expected = 0;
        int actual = multiplication.multiply(param1, param2);
        assertThat(actual)
                .isEqualTo(expected);
    }

    @Test
    void testShouldReturnZeroGivenParametersZeroAndTwo() {
        int param1 = 0;
        int param2 = 2;
        int expected = 0;
        int actual = multiplication.multiply(param1, param2);
        assertThat(actual)
                .isEqualTo(expected);
    }

    @Test
    void testShouldReturnNegativeSixGivenParametersNegativeTwoAndPositveThree() {
        int param1 = -2;
        int param2 = 3;
        int expected = -6;
        int actual = multiplication.multiply(param1, param2);
        assertThat(actual)
                .isEqualTo(expected);
    }

    @Test
    void testShouldReturnNegativeSixGivenParametersPositiveTwoAndNegativeThree() {
        int param1 = 2;
        int param2 = -3;
        int expected = -6;
        int actual = multiplication.multiply(param1, param2);
        assertThat(actual)
                .isEqualTo(expected);
    }

    @Test
    void testShouldReturnPositiveSixGivenParametersNegativeTwoAndNegativeThree() {
        int param1 = -2;
        int param2 = -3;
        int expected = 6;
        int actual = multiplication.multiply(param1, param2);
        assertThat(actual)
                .isEqualTo(expected);
    }

    @Test
    void testShouldReturnZeroGivenParametersNegativeTwoAndZero() {
        int param1 = -2;
        int param2 = 0;
        int expected = 0;
        int actual = multiplication.multiply(param1, param2);
        assertThat(actual)
                .isEqualTo(expected);
    }
}
