package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void should_return_order_number_when_the_given_is_not_multiple_of_3_5_or_7() {
        int orderNumber = 1;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.countOff(orderNumber);
        assertEquals("1", actual);
    }
}
