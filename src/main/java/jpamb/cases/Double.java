package jpamb.cases;

import jpamb.utils.Case;
import jpamb.utils.Tag;

import static jpamb.utils.Tag.TagType.ARRAY;

public class Double {
    @Case("() -> ok")
    @Tag({ARRAY})
    public static void doubleArrayInBounds() {
        double array[] = {0.0, 0.0};
        array[1] = 1.0;
    }

    // NaN is not equal to itself - tricky for analysis!
    @Case("() -> ok")
    public static void assertNaNNotEqual() {
        double nan = 0.0 / 0.0;
        if (nan == nan) {
            throw new AssertionError();
        }
    }

    // Testing infinity behavior
    @Case("() -> ok")
    public static void assertInfinityDivision() {
        double positiveInf = 1.0 / 0.0;
        double negativeInf = -1.0 / 0.0;
        if (positiveInf == negativeInf) {
            throw new AssertionError();
        }
    }

    // Floating-point precision: 0.1 + 0.2 != 0.3
    @Case("() -> ok")
    public static void assertPrecisionLoss() {
        double sum = 0.1 + 0.2;
        if (sum == 0.3) {
            throw new AssertionError();
        }
    }

    // Negative zero equals positive zero, but behaves differently
    @Case("() -> ok")
    public static void assertNegativeZero() {
        double positiveZero = 0.0;
        double negativeZero = -0.0;
        // They're equal
        if (positiveZero != negativeZero) {
            throw new AssertionError();
        }
        // But division produces different results
        double posInf = 1.0 / positiveZero;
        double negInf = 1.0 / negativeZero;
        if (posInf == negInf) {
            throw new AssertionError();
        }
    }

    // Infinity arithmetic
    @Case("() -> ok")
    public static void assertInfinityMath() {
        double inf = 1.0 / 0.0;
        double result = inf + inf;
        if (!java.lang.Double.isInfinite(result)) {
            throw new AssertionError();
        }
    }
}
