package calc;

import org.junit.Ignore;
import org.junit.Test;

import static calc.Calculator.add;
import static org.junit.Assert.assertEquals;

/**
 * Created by zan on 16/04/2014.
 */
public class StringCalculatorTest {

    @Test
    public void an_empty_string_returns_0() {
        assertEquals(add(""), 0);
    }

    @Test
    public void string_with_one_number_returns_the_same_number() {
        assertEquals(add("1"), 1);
        assertEquals(add("2"), 2);
    }

    @Test
    public void string_with_two_numbers_returns_the_sum_of_numbers() {
        assertEquals(add("1,2"), 3);
        assertEquals(add("2,2"), 4);
    }

    @Test
    public void string_with_three_numbers_returns_the_sum_of_numbers() {
        assertEquals(add("1,2,3"), 6);
        assertEquals(add("1,2,4"), 7);
    }

    @Test
    public void string_with_unknown_amount_of_numbers_returns_the_sum_of_numbers() {
        assertEquals(add("1,2,3,4"), 10);
    }

    @Test
    public void string_with_new_lines_between_numbers_returns_the_sum_of_numbers() {
        assertEquals(add("1\n2,3,4"), 10);
    }

    @Test(expected = RuntimeException.class)
    public void string_with_two_separators_next_to_each_other_throws_exception() {
        System.out.println(add("1\n,"));
    }

}


