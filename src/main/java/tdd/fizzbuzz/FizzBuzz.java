package tdd.fizzbuzz;

public class FizzBuzz {
    public String countOff(int orderNumber) {
        return orderNumber %3 == 0 || orderNumber %5 == 0 || orderNumber %7 == 0 ? null : String.valueOf(orderNumber);
    }
}
