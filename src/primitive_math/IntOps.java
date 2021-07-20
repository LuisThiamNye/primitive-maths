package primitive_math.typed;

public class IntOps {

    public static int bitAnd(int a, int b) {
        return a & b;
    }

    public static int bitOr(int a, int b) {
        return a | b;
    }

    public static int bitXor(int a, int b) {
        return a ^ b;
    }

    ////

    public static boolean lt(int a, int b) {
        return a < b;
    }

    public static boolean lte(int a, int b) {
        return a <= b;
    }

    public static boolean gt(int a, int b) {
        return a > b;
    }

    public static boolean gte(int a, int b) {
        return a >= b;
    }

    public static boolean eq(int a, int b) {
        return a == b;
    }

    public static boolean neq(int a, int b) {
        return a != b;
    }

    ////

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static int max(int a, int b) {
        return a < b ? b : a;
    }

    public static int min(int a, int b) {
        return a > b ? b : a;
    }
}

/* Does not work; infix operators only defined for primitives.
public class PrimitiveOperators<T extends Number> {

    public static PrimitiveOperators<double> doubleOps = new PrimitiveOperators<double>();
    public static PrimitiveOperators<long> longOps = new PrimitiveOperators<long>();
    public static PrimitiveOperators<int> intOps = new PrimitiveOperators<int>();
    public static PrimitiveOperators<float> floatOps = new PrimitiveOperators<float>();

    public T bitAnd(T a, T b) {
        return a & b;
    }

    public T bitOr(T a, T b) {
        return a | b;
    }

    public T bitXor(T a, T b) {
        return a ^ b;
    }

    ////

    public boolean lt(T a, T b) {
        return a < b;
    }

    public boolean lte(T a, T b) {
        return a <= b;
    }

    public boolean gt(T a, T b) {
        return a > b;
    }

    public boolean gte(T a, T b) {
        return a >= b;
    }

    public boolean eq(T a, T b) {
        return a == b;
    }

    public boolean neq(T a, T b) {
        return a != b;
    }

    ////

    public T add(T a, T b) {
        return a + b;
    }

    public T subtract(T a, T b) {
        return a - b;
    }

    public T multiply(T a, T b) {
        return a * b;
    }

    public T divide(T a, T b) {
        return a / b;
    }

    public T max(T a, T b) {
        return a < b ? b : a;
    }

    public T min(T a, T b) {
        return a > b ? b : a;
    }
    }
*/
/*
public class PrimitivesTyped {

    public static long bitAndLong(long a, long b) {
        return a & b;
    }

    public static int bitAndInt(int a, int b) {
        return a & b;
    }

    public static long bitOrLong(long a, long b) {
        return a | b;
    }

    public static int bitOrInt(int a, int b) {
        return a | b;
    }

    public static long bitXorLong(long a, long b) {
        return a ^ b;
    }

    public static int bitXorInt(int a, int b) {
        return a ^ b;
    }

    ////

    public static boolean ltInt(int a, int b) {
        return a < b;
    }

    public static boolean ltLong(long a, long b) {
        return a < b;
    }

    public static boolean ltDouble(double a, double b) {
        return a < b;
    }

    public static boolean lteDouble(double a, double b) {
        return a <= b;
    }

    public static boolean lteLong(long a, long b) {
        return a <= b;
    }

    public static boolean lteInt(int a, int b) {
        return a <= b;
    }

    public static boolean gtInt(int a, int b) {
        return a > b;
    }

    public static boolean gtLong(long a, long b) {
        return a > b;
    }

    public static boolean gtDouble(double a, double b) {
        return a > b;
    }

    public static boolean gteInt(int a, int b) {
        return a >= b;
    }

    public static boolean gteLong(long a, long b) {
        return a >= b;
    }

    public static boolean gteDouble(double a, double b) {
        return a >= b;
    }

    public static boolean eqInt(int a, int b) {
        return a == b;
    }

    public static boolean eqLong(long a, long b) {
        return a == b;
    }

    public static boolean eqDouble(double a, double b) {
        return a == b;
    }

    public static boolean neqInt(int a, int b) {
        return a != b;
    }

    public static boolean neqLong(long a, long b) {
        return a != b;
    }

    public static boolean neqDouble(double a, double b) {
        return a != b;
    }

    ////

    public static long rem(long n, long div) {
        return n % div;
    }

    public static int addInt(int a, int b) {
        return a + b;
    }

    public static long add(long a, long b) {
        return a + b;
    }

    public static float add(float a, float b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static int subtractInt(int a, int b) {
        return a - b;
    }

    public static long subtract(long a, long b) {
        return a - b;
    }

    public static float subtract(float a, float b) {
        return a - b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static int multiplyInt(int a, int b) {
        return a * b;
    }

    public static long multiplyLong(long a, long b) {
        return a * b;
    }

    public static double multiplyDouble(double a, double b) {
        return a * b;
    }

    public static int divideInt(int a, int b) {
        return a / b;
    }

    public static long divideLong(long a, long b) {
        return a / b;
    }

    public static double divideDouble(double a, double b) {
        return a / b;
    }

    public static int maxInt(int a, int b) {
        return a < b ? b : a;
    }

    public static int minInt(int a, int b) {
        return a > b ? b : a;
    }

    public static long maxLong(long a, long b) {
        return a < b ? b : a;
    }

    public static long minLong(long a, long b) {
        return a > b ? b : a;
    }

    public static double maxDouble(double a, double b) {
        return a < b ? b : a;
    }

    public static double minDouble(double a, double b) {
        return a > b ? b : a;
    }
}
*/
