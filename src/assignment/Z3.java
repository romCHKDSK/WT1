package assignment;

import java.util.Map;
import java.util.LinkedHashMap;

public final class Z3 extends Z {
    private static double targetFunction(double x) {
        return Math.tan(x);
    }
    
    public static Map<Double,Double> getFxTable(double a, double b, double h) {
        Map<Double, Double> results = new LinkedHashMap<>();
        for (double i = a; i <= b; i += h)
            results.put(i, targetFunction(i));
        return results;
    }
}