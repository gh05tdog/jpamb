package jpamb.cases;

import jpamb.utils.*;
import static jpamb.utils.Tag.TagType.*;

public class EdgeCases {

  @Case("(2147483647) -> ok")
  @Case("(-2147483648) -> assertion error")
  public static void assertMaxInt(int n) {
    assert n == Integer.MAX_VALUE;
  }

  @Case("(-2147483648) -> ok")
  @Case("(2147483647) -> assertion error")
  public static void assertMinInt(int n) {
    assert n == Integer.MIN_VALUE;
  }

  @Case("(2147483647) -> *")
  @Tag({ INTEGER_OVERFLOW })
  public static int overflowAddition(int n) {
    return n + 1;
  }

  @Case("(-2147483648) -> *")
  @Tag({ INTEGER_OVERFLOW })
  public static int underflowSubtraction(int n) {
    return n - 1;
  }

  @Case("(0) -> ok")
  @Case("(1) -> assertion error")
  public static void assertZero(int n) {
    assert n == 0;
  }

  @Case("(true) -> ok")
  @Case("(false) -> assertion error")
  public static void assertTrue(boolean b) {
    assert b;
  }

  @Case("(false) -> ok")
  @Case("(true) -> assertion error")
  public static void assertFalse(boolean b) {
    assert !b;
  }

  @Case("(0) -> ok")
  @Case("(97) -> assertion error")
  public static void assertNullChar(int c) {
    assert c == 0; // null character
  }

  @Case("(65535) -> ok")
  @Case("(97) -> assertion error")
  public static void assertMaxChar(int c) {
    assert c == 65535; // max char value
  }

  @Case("(1, 1, 1) -> ok")
  @Case("(1, 2, 3) -> assertion error")
  public static void assertAllEqual(int a, int b, int c) {
    assert a == b && b == c;
  }

  @Case("(0, 1) -> divide by zero")
  @Case("(1, 0) -> ok")
  public static int conditionalDivision(int condition, int divisor) {
    if (condition == 0) {
      return 1 / 0;
    }
    return 1 / divisor;
  }

  @Case("(42) -> ok")
  public static int identityFunction(int n) {
    return n;
  }

  @Case("() -> ok")
  public static void emptyMethod() {
    // This method does nothing
  }
}
