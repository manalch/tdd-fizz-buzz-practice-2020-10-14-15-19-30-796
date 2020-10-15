package tdd.fizzbuzz;

public class FizzBuzz {

    private static final int MODULO_3 = 3;
    private static final String FIZZ = "Fizz";
    private static final int MODULO_5 = 5;
    private static final String BUZZ = "Buzz";

    public String countOff(int orderNumber) {
        if (isMultipleOfThree(orderNumber)) {
            return FIZZ;
        }
        if (isMultipleOfFive(orderNumber)) {
            return BUZZ;
        }
        if (orderNumber % 7 == 0) {
            return "Whizz";
        }
        return String.valueOf(orderNumber);
    }

    private boolean isMultipleOfThree(int orderNumber) {
        return orderNumber % MODULO_3 == 0;
    }

    private boolean isMultipleOfFive(int orderNumber) {
        return orderNumber % MODULO_5 == 0;
    }
}
