package tdd.fizzbuzz;

public class FizzBuzz {

    private static final int MODULO_3 = 3;
    private static final int MODULO_5 = 5;
    private static final int MODULO_7 = 7;
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String WHIZZ = "Whizz";

    public String countOff(int orderNumber) {
        String message = "";
        if (isMultipleOfThree(orderNumber)) {
            message += FIZZ;
        }
        if (isMultipleOfFive(orderNumber)) {
            message += BUZZ;
        }
        if (isMultipleOfSeven(orderNumber)) {
            message += WHIZZ;
        }
        return message.isEmpty() ? String.valueOf(orderNumber) : message;
    }

    private boolean isMultipleOfThree(int orderNumber) {
        return orderNumber % MODULO_3 == 0;
    }

    private boolean isMultipleOfFive(int orderNumber) {
        return orderNumber % MODULO_5 == 0;
    }

    private boolean isMultipleOfSeven(int orderNumber) {
        return orderNumber % MODULO_7 == 0;
    }
}
