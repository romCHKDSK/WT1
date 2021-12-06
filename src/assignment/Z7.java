package assignment;

public final class Z7 extends Z {
    public static double[] shellSort(double[] arr) {
        int len = arr.length;
        int inner;
        int outer;
        double temp;

        int h = 1;
        while (h <= len / 3)
            h = h * 3 + 1;
        while (h > 0) {
            for (outer = h; outer < len; outer++) {
                temp = arr[outer];
                inner = outer;

                while (inner > h - 1 && arr[inner - h] >= temp) {
                    arr[inner] = arr[inner - h];
                    inner -= h;
                }
                arr[inner] = temp;
            }
            h = (h - 1) / 3;
        }

        return arr;
    }
}