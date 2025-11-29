package jpamb.cases;

import jpamb.utils.Case;

public class Parallel {
    public static void assertTrue() {
      assert true;
    }

    public static void assertFalse() {
      assert false;
    }

  public static void assertIf(boolean test) {
    if (test) {
      assertTrue();
    } else {
      assertFalse();
    }
  }

    @Case("(1) -> ok")
    public static void manyBranches(int n) {
        if (n > -100) {
            while (n < 0) {
                n++;
            }

            assertIf(n);
        } else if (n > 90) {
            while (n < 900) {
                n++;
            }

            assertIf(n);
        } else if (n > 80) {
            while (n < 800) {
                n++;
            }

            assertTrue();
        } else {
            assertFalse();
        }
    }

    @Case("(1) -> ok")
    public static void tooManyBranches(int n) {
        if (n > 100) {
            if (n > 500) {
                if (n > 1000) {
                    if (n > 2000) {
                        assertTrue();
                    }
                } else {
                    if (n > 750) {
                        assertTrue();
                    }
                    else {
                        assertFalse();
                    }
                }
            } else {
                if (n > 250) {
                        assertTrue();
                } else {
                    if (n > 125) {
                        assertTrue();
                    } else {
                        assertFalse();
                    }
                }
            }
        } else {
            n = 20;
            assert n == 20;
        }
    }
}
