package tdd.fizzbuzz;

public class FizzBuzz {

    private static final int MODULO_3 = 3;
    private static final String FIZZ = "Fizz";

    public String countOff(int orderNumber) {
        if (isMultipleOfThree(orderNumber)) {
            return FIZZ;
        }
        return String.valueOf(orderNumber);
    }

    private boolean isMultipleOfThree(int orderNumber) {
        return orderNumber % MODULO_3 == 0;
    }
}
