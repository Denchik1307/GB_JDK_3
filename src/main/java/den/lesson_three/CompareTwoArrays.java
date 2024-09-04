package den.lesson_three;

public class CompareTwoArrays {

    public static <T> boolean compareArray(T[] arrOne, T[] arrTwo){
        if (arrOne.length == arrTwo.length){
            for (int i = 0; i < arrOne.length; i++) {
                if (arrOne[i] != arrTwo[i])return false;
            }
        }
        return true;
    }
}
