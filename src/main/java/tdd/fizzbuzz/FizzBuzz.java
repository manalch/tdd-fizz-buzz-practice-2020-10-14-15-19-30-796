package tdd.fizzbuzz;

public class FizzBuzz {

    private static final int MODULO_3 = 3;
    private static final int MODULO_5 = 5;
    private static final int MODULO_7 = 7;

    public String countOff(int orderNumber) {
        return orderNumber % MODULO_3 == 0
                || orderNumber % MODULO_5 == 0
                || orderNumber % MODULO_7 == 0
                ? null
                : String.valueOf(orderNumber);
    }
}
