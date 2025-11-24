package jpamb.cases;

import jpamb.utils.*;
import static jpamb.utils.Tag.TagType.*;

public class ConditionalLogic {

  @Case("(5, 10) -> ok")
  @Case("(15, 10) -> assertion error")
  @Tag({ CONDITIONAL })
  public static void assertFirstLessSecond(int a, int b) {
    assert a < b;
  }

@Case("(true, false) -> ok")
@Case("(false, true) -> ok")
@Case("(true, true) -> assertion error")
@Case("(false, false) -> assertion error")
@Tag({ CONDITIONAL })
public static void assertXorCondition(boolean a, boolean b) {
    assert (a && !b) || (!a && b);
}

  @Case("(0) -> ok")
  @Case("(1) -> ok")
  @Case("(2) -> assertion error")
  @Tag({ CONDITIONAL })
  public static void assertInRange(int n) {
    assert n >= 0 && n <= 1;
  }

  @Case("(true, true) -> ok")
  @Case("(true, false) -> assertion error")
  @Case("(false, true) -> assertion error")
  @Case("(false, false) -> assertion error")
  @Tag({ CONDITIONAL })
  public static void assertBothTrue(boolean a, boolean b) {
    assert a && b;
  }

  @Case("(100) -> ok")
  @Case("(50) -> assertion error")
  @Tag({ CONDITIONAL })
  public static void assertGradeA(int score) {
    if (score >= 90) {
      return;
    }
    assert false;
  }

  @Case("(97) -> ok")
  @Case("(90) -> assertion error")
  @Tag({ CONDITIONAL })
  public static void assertLowerCase(int c) {
    assert c >= 97 && c <= 122; // 'a' to 'z' in ASCII
  }

  @Case("(2024) -> ok")
  @Case("(2023) -> assertion error")
  @Tag({ CONDITIONAL })
  public static void assertLeapYear(int year) {
    boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    assert isLeap;
  }

  @Case("(3, 4, 5) -> ok")
  @Case("(1, 2, 3) -> assertion error")
  @Tag({ CONDITIONAL })
  public static void assertTriangleInequality(int a, int b, int c) {
    assert (a + b > c) && (a + c > b) && (b + c > a);
  }

  @Case("(15) -> ok")
  @Case("(14) -> assertion error")
  @Tag({ CONDITIONAL })
  public static void assertFizzBuzz(int n) {
    assert (n % 3 == 0) && (n % 5 == 0);
  }
}
