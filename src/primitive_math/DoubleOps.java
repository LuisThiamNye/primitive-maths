package primitive_math.typed;

public class DoubleOps {

    public static boolean lt(double a, double b) {
        return a < b;
    }

    public static boolean lte(double a, double b) {
        return a <= b;
    }

    public static boolean gt(double a, double b) {
        return a > b;
    }

    public static boolean gte(double a, double b) {
        return a >= b;
    }

    public static boolean eq(double a, double b) {
        return a == b;
    }

    public static boolean neq(double a, double b) {
        return a != b;
    }

    ////

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }

    public static double max(double a, double b) {
        return a < b ? b : a;
    }

    public static double min(double a, double b) {
        return a > b ? b : a;
    }
}
