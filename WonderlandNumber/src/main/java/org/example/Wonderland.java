package org.example;

/*import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;*/

public class Wonderland {

    private static final int MIN_SIX_DIGIT = 100000;
    private static final int MAX_SIX_DIGIT = 999999;
    private static final int MULTIPLIER_START = 2;
    private static final int MULTIPLIER_END = 6;

/*    public static List<Integer> generateSixDigitNumbers() {
        List<Integer> numbers = new ArrayList<>(MAX_SIX_DIGIT - MIN_SIX_DIGIT + 1);

        for (int i = MIN_SIX_DIGIT; i <= MAX_SIX_DIGIT; i++) {
            numbers.add(i);
        }

        return numbers;
    }*/

    public static boolean isWonderlandNumber(int n) {
        int[] original = getDigitCount(n);

        for (int i = MULTIPLIER_START; i <= MULTIPLIER_END; i++) {
            if (!hasSameDigits(original, n * i)) {
                return false;
            }
        }

        return true;
    }

    public static int findWonderlandNumber() {
        for (int n = MIN_SIX_DIGIT; n <= MAX_SIX_DIGIT; n++) {
            if (isWonderlandNumber(n)) {
                return n;
            }
        }
        return -1;
    }

    private static boolean hasSameDigits(int[] original, int number) {
        int[] current = getDigitCount(number);

        for (int i = 0; i < 10; i++) {
            if (original[i] != current[i]) {
                return false;
            }
        }

        return true;
    }

    private static int[] getDigitCount(int number) {
        int[] count = new int[10];

        while (number > 0) {
            count[number % 10]++;
            number /= 10;
        }

        return count;
    }
}
