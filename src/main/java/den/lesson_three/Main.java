package den.lesson_three;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Calculator
        System.out.println(Calculator.sum(1, 7));
        System.out.println(Calculator.divide(5, 2));
        System.out.println(Calculator.divide(5, 0));
        System.out.println(Calculator.multiply(3, 4));
        System.out.println(Calculator.subtract(2, 3));

        //Compare Arrays
        Integer[] listOne = {1, 2, 3, 4, 5, 6, 7};
        Integer[] listTwo = {1, 2, 3, 4, 5, 6, 7};
        Integer[] listThree = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(CompareTwoArrays.compareArray(listOne,listTwo));
        System.out.println(CompareTwoArrays.compareArray(listOne,listThree));

        //Pair
        Pair<String, Integer> pair = new Pair<>("Den", 1256951);
        System.out.println(pair);
    }
}