package den.lesson_three;

public class Calculator {

    public static <T extends Number> double sum(T numOne, T numTwo) {
        return numOne.doubleValue() + numTwo.doubleValue();
    }
    public static <T extends Number> double multiply(T numOne, T numTwo) {
        return numOne.doubleValue() * numTwo.doubleValue();
    }
    public static <T extends Number> double divide(T numOne, T numTwo) {
       return numTwo.doubleValue()!=0 ? numOne.doubleValue() / numTwo.doubleValue(): 0;

    }
    public static <T extends Number> double subtract(T numOne, T numTwo) {
        return numOne.doubleValue() - numTwo.doubleValue();
    }

}
