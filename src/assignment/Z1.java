package assignment;
public final class Z1 extends Z {
    public static double calculate(double x, double y) {
        double result = 1 + Math.pow(Math.sin(x+y), 2);
        result /= 2 + Math.abs( x - (2*x / (1 + Math.pow(x,2) * Math.pow(y,2) ) ) );
        return result;
    }
}