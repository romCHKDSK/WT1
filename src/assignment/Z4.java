package assignment;

import java.util.List;
import java.util.LinkedList;

public final class Z4 extends Z {
    private static boolean isPrime(int num) {
        if (num == 0 || num == 1)
            return false;
        if (num == 2)
            return true;

        int i = 2;
        while (i <= num / 2) {
            if (num % i == 0)
                return false;
            i++;
        }
        return true;
    }

    public static List<Integer> getPrimePositions(int[] arr) {
        List<Integer> resultPositions = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i]))
                resultPositions.add(i);
        }
        return resultPositions;
    }
}