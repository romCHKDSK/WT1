package assignment;

public final class Z5 extends Z {
    public static int removableNumAmount(int[] arr) {
        if (arr.length < 2) return 0;
        int result = 0;
        int prevElement = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < prevElement)
                result++;
            else
                prevElement = arr[i];
        }
        return result;
    }
}