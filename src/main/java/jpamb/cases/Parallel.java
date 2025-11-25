package jpamb.cases;

import jpamb.utils.Case;

public class Parallel {
    @Case("(1) -> ok")
    public static void manyBranches(int n) {
        if (n > 100) {
            while (n < 1000) {
                n++;
            }
        } else if (n > 90) {
            while (n < 900) {
                n++;
            }
        } else if (n > 80) {
            while (n < 800) {
                n++;
            }
        } else {
            assert n > 0;
        }
    }
}


