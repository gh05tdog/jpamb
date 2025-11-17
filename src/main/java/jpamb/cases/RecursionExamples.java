package jpamb.cases;

import jpamb.utils.*;
import static jpamb.utils.Tag.TagType.*;

public class RecursionExamples {

  @Case("(5) -> ok")
  @Case("(-1) -> assertion error")
  @Tag({ RECURSION })
  public static int factorialRecursive(int n) {
    assert n >= 0;
    if (n <= 1) return 1;
    return n * factorialRecursive(n - 1);
  }

  @Case("(10) -> ok")
  @Case("(-1) -> assertion error")
  @Tag({ RECURSION })
  public static int fibonacciRecursive(int n) {
    assert n >= 0;
    if (n <= 1) return n;
    return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
  }

  @Case("(8) -> ok")
  @Case("(0) -> assertion error")
  @Tag({ RECURSION })
  public static void towerOfHanoi(int n) {
    assert n > 0;
    if (n == 1) return;
    towerOfHanoi(n - 1);
    towerOfHanoi(n - 1);
  }

  private static int powerRecursive(int base, int exp) {
    if (exp == 0) return 1;
    if (exp == 1) return base;
    return base * powerRecursive(base, exp - 1);
  }

  @Case("(121) -> ok")
  @Case("(123) -> assertion error")
  @Tag({ RECURSION })
  public static void assertPalindromeNumber(int n) {
    assert isPalindromeRecursive(n, 0, n);
  }

  private static boolean isPalindromeRecursive(int original, int reversed, int remaining) {
    if (remaining == 0) {
      return original == reversed;
    }
    return isPalindromeRecursive(original, reversed * 10 + remaining % 10, remaining / 10);
  }

  private static int gcdRecursive(int a, int b) {
    if (b == 0) return a;
    return gcdRecursive(b, a % b);
  }

  @Case("(7) -> ok")
  @Case("(8) -> assertion error")
  @Tag({ RECURSION })
  public static void assertSumOfDigits(int n) {
    assert sumOfDigitsRecursive(n) == 7;
  }

  private static int sumOfDigitsRecursive(int n) {
    if (n == 0) return 0;
    return (n % 10) + sumOfDigitsRecursive(n / 10);
  }

  @Case("(5) -> ok")
  @Tag({ RECURSION })
  public static void countdownRecursive(int n) {
    if (n <= 0) return;
    countdownRecursive(n - 1);
  }

  @Case("(1024, 2) -> ok")
  @Case("(1000, 2) -> assertion error")
  @Tag({ RECURSION })
  public static void assertPowerOfBaseRecursive(int n, int base) {
    assert isPowerOfBaseRecursive(n, base);
  }

  private static boolean isPowerOfBaseRecursive(int n, int base) {
    if (n == 1) return true;
    if (n % base != 0) return false;
    return isPowerOfBaseRecursive(n / base, base);
  }
}
