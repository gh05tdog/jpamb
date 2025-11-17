package jpamb.cases;

import jpamb.utils.*;
import static jpamb.utils.Tag.TagType.*;

public class MathOperations {

  @Case("(5) -> ok")
  @Case("(0) -> assertion error")
  @Tag({ MATH })
  public static void assertPositive(int n) {
    assert n > 0;
  }

  @Case("(2, 3) -> ok")
  @Tag({ MATH })
  public static int power(int base, int exp) {
    if (exp == 0) return 1;
    int result = 1;
    for (int i = 0; i < exp; i++) {
      result *= base;
    }
    return result;
  }

  @Case("(12) -> ok")
  @Case("(13) -> assertion error")
  @Tag({ MATH })
  public static void assertEven(int n) {
    assert n % 2 == 0;
  }

  @Case("(17) -> ok")
  @Case("(18) -> assertion error")
  @Tag({ MATH })
  public static void assertPrime(int n) {
    assert n > 1;
    for (int i = 2; i * i <= n; i++) {
      assert n % i != 0;
    }
  }

  @Case("(5) -> ok")
  @Tag({ MATH })
  public static int factorial(int n) {
    if (n <= 1) return 1;
    int result = 1;
    for (int i = 2; i <= n; i++) {
      result *= i;
    }
    return result;
  }

  @Case("(10, 5) -> ok")
  @Tag({ MATH })
  public static int gcd(int a, int b) {
    while (b != 0) {
      int temp = b;
      b = a % b;
      a = temp;
    }
    return a;
  }

  @Case("(8) -> ok")
  @Case("(7) -> assertion error")
  @Tag({ MATH })
  public static void assertPowerOfTwo(int n) {
    assert n > 0;
    while (n > 1) {
      if (n % 2 != 0) {
        assert false;
        return;
      }
      n = n / 2;
    }
  }

  @Case("(100) -> ok")
  @Case("(99) -> assertion error")
  @Tag({ MATH })
  public static void assertPerfectSquare(int n) {
    // Find square root without using Math.sqrt
    int sqrt = 1;
    while (sqrt * sqrt < n) {
      sqrt++;
    }
    assert sqrt * sqrt == n;
  }

  @Case("(153) -> ok")
  @Case("(154) -> assertion error")
  @Tag({ MATH })
  public static void assertArmstrongNumber(int n) {
    int original = n;
    int sum = 0;
    
    // Count digits without using String
    int temp = n;
    int digits = 0;
    while (temp > 0) {
      digits++;
      temp /= 10;
    }
    
    temp = n;
    while (temp > 0) {
      int digit = temp % 10;
      int power = 1;
      for (int i = 0; i < digits; i++) {
        power *= digit;
      }
      sum += power;
      temp /= 10;
    }
    
    assert sum == original;
  }

  @Case("(28) -> ok")
  @Case("(29) -> assertion error")
  @Tag({ MATH })
  public static void assertPerfectNumber(int n) {
    int sum = 1;
    for (int i = 2; i * i <= n; i++) {
      if (n % i == 0) {
        sum += i;
        if (i * i != n) {
          sum += n / i;
        }
      }
    }
    assert sum == n && n > 1;
  }
}
