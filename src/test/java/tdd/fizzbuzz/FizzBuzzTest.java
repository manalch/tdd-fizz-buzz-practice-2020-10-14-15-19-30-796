package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {
    @Test
    void should_return_order_number_when_the_given_is_not_multiple_of_3_5_or_7() {
        int orderNumber = 1;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.countOff(orderNumber);
        assertEquals("1", actual);
    }

    @Test
    void should_return_fizz_when_the_given_is_multiple_of_3() {
        int orderNumber = 3;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.countOff(orderNumber);
        assertEquals("Fizz", actual);
    }

    @Test
    void should_return_buzz_when_the_given_is_multiple_of_5() {
        int orderNumber = 5;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.countOff(orderNumber);
        assertEquals("Buzz", actual);
    }

    @Test
    void should_return_whizz_when_the_given_is_multiple_of_7() {
        int orderNumber = 7;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.countOff(orderNumber);
        assertEquals("Whizz", actual);
    }

    @Test
    void should_return_fizz_buzz_when_the_given_is_multiple_of_3_and_5() {
        int orderNumber = 15;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.countOff(orderNumber);
        assertEquals("FizzBuzz", actual);
    }
}
