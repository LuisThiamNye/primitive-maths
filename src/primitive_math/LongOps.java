package primitive_math.typed;

public class LongOps {

    public static long bitAnd(long a, long b) {
        return a & b;
    }

    public static long bitOr(long a, long b) {
        return a | b;
    }

    public static long bitXor(long a, long b) {
        return a ^ b;
    }

    ////

    public static boolean lt(long a, long b) {
        return a < b;
    }

    public static boolean lte(long a, long b) {
        return a <= b;
    }

    public static boolean gt(long a, long b) {
        return a > b;
    }

    public static boolean gte(long a, long b) {
        return a >= b;
    }

    public static boolean eq(long a, long b) {
        return a == b;
    }

    public static boolean neq(long a, long b) {
        return a != b;
    }

    ////

    public static long add(long a, long b) {
        return a + b;
    }

    public static long subtract(long a, long b) {
        return a - b;
    }

    public static long multiply(long a, long b) {
        return a * b;
    }

    public static long divide(long a, long b) {
        return a / b;
    }

    public static long max(long a, long b) {
        return a < b ? b : a;
    }

    public static long min(long a, long b) {
        return a > b ? b : a;
    }
}
