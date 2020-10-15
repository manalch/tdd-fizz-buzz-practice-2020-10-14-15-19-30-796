package tdd.fizzbuzz;

public class FizzBuzz {

    private static final int MODULO_3 = 3;
    private static final int MODULO_5 = 5;
    private static final int MODULO_7 = 7;
    private static final String FIZZ = "Fizz";

    public String countOff(int orderNumber) {
        if (isMultipleOfThree(orderNumber)) {
            return FIZZ;
        }
        return isMultipleOfThree(orderNumber)
                || orderNumber % MODULO_5 == 0
                || orderNumber % MODULO_7 == 0
                ? null
                : String.valueOf(orderNumber);
    }

    private boolean isMultipleOfThree(int orderNumber) {
        return orderNumber % MODULO_3 == 0;
    }
}
