package assignment;

public final class Z6 extends Z {
    public static double[][] getMatrix(double[] arr) {
        int n = arr.length;
        double[][] matrix = new double[n][n];
        for (int i = 0; i < n; i++) {
            int k = i;
            for (int j = 0; j < n; j++) {
                matrix[i][j] = arr[k++];
                if (k > arr.length - 1)
                    k = 0;
            }
        }
        return matrix;
    }
}