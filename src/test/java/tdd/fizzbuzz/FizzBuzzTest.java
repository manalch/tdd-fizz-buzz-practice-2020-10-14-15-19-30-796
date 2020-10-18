package tdd.fizzbuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @BeforeEach
    void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    void should_return_order_number_when_the_given_is_not_multiple_of_3_5_or_7() {
        int orderNumber = 1;
        String actual = fizzBuzz.countOff(orderNumber);
        assertEquals("1", actual);
    }

    @Test
    void should_return_fizz_when_the_given_is_multiple_of_3() {
        int orderNumber = 3;
        String actual = fizzBuzz.countOff(orderNumber);
        assertEquals("Fizz", actual);
    }

    @Test
    void should_return_buzz_when_the_given_is_multiple_of_5() {
        int orderNumber = 5;
        String actual = fizzBuzz.countOff(orderNumber);
        assertEquals("Buzz", actual);
    }

    @Test
    void should_return_whizz_when_the_given_is_multiple_of_7() {
        int orderNumber = 7;
        String actual = fizzBuzz.countOff(orderNumber);
        assertEquals("Whizz", actual);
    }

    @Test
    void should_return_fizz_buzz_when_the_given_is_multiple_of_3_and_5() {
        int orderNumber = 15;
        String actual = fizzBuzz.countOff(orderNumber);
        assertEquals("FizzBuzz", actual);
    }

    @Test
    void should_return_buzz_whiz_when_the_given_is_multiple_of_5_and_7() {
        int orderNumber = 35;
        String actual = fizzBuzz.countOff(orderNumber);
        assertEquals("BuzzWhizz", actual);
    }

    @Test
    void should_return_fizz_whiz_when_the_given_is_multiple_of_3_and_7() {
        int orderNumber = 21;
        String actual = fizzBuzz.countOff(orderNumber);
        assertEquals("FizzWhizz", actual);
    }

    @Test
    void should_return_fizz_buzz_whiz_when_the_given_is_multiple_of_3_and_5_and_7() {
        int orderNumber = 105;
        String actual = fizzBuzz.countOff(orderNumber);
        assertEquals("FizzBuzzWhizz", actual);
    }
}
