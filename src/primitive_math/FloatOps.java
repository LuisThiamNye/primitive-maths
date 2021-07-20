package primitive_math.typed;

public class FloatOps {

    public static boolean lt(float a, float b) {
        return a < b;
    }

    public static boolean lte(float a, float b) {
        return a <= b;
    }

    public static boolean gt(float a, float b) {
        return a > b;
    }

    public static boolean gte(float a, float b) {
        return a >= b;
    }

    public static boolean eq(float a, float b) {
        return a == b;
    }

    public static boolean neq(float a, float b) {
        return a != b;
    }

    ////

    public static float add(float a, float b) {
        return a + b;
    }

    public static float subtract(float a, float b) {
        return a - b;
    }

    public static float multiply(float a, float b) {
        return a * b;
    }

    public static float divide(float a, float b) {
        return a / b;
    }

    public static float max(float a, float b) {
        return a < b ? b : a;
    }

    public static float min(float a, float b) {
        return a > b ? b : a;
    }
}
