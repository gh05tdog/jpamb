package jpamb.cases;

import jpamb.utils.Case;

public class Parallel {
  //   public static void assertTrue() {
  //     assert true;
  //   }
  //
  //   public static void assertFalse() {
  //     assert false;
  //   }
  //
  // public static void assertIf(boolean test) {
  //   if (test) {
  //     assertTrue();
  //   } else {
  //     assertFalse();
  //   }
  // }

    @Case("(1) -> ok")
    public static void manyBranches(int n) {
        if (n > -100) {
            while (n < 0) {
                n++;
            }

            // assertIf(n);
        } else if (n > 90) {
            while (n < 900) {
                n++;
            }

            // assertIf(n);
        } else if (n > 80) {
            while (n < 800) {
                n++;
            }

            // assertTrue();
        } else {
            // assertFalse();
        }
    }

    @Case("(1) -> ok")
    public static void tooManyBranches(int n) {
        if (n > 100) {
            if (n > 500) {
                if (n > 1000) {
                    if (n > 2000) {
                        // assertTrue();
                    }
                } else{
                    if (n > 750) {
                        // assertTrue();
                    }
                    else {
                        // assertFalse();
                    }
                }
            } else {
                if (n > 250) {
                        // assertTrue();
                } else {
                    if (n > 125) {
                        // assertTrue();
                    } else {
                        // assertFalse();
                    }
                }
            }
        } else {
            n = 20;
            assert n == 20;
        }
    }

    @Case("(1) -> ok")
    public static void tooManyBranchesV2(int n) {
        int a = 0;
        int b = 1;
        int c = n;
        int d = 10;
        int e = 50;

        a = n + 1;
        a = a + 2;
        a = a + 3;
        b = a * 2;
        c = c - 5;
        d = d * n;

        if (n > 100) {
            c = c + 1;
            c = c * 2;
            c = c - 10;
            c = c / 2;
            c = c + n;
            b = b + c;
            b = b * 3;
            b = b - 100;
            a = a + b + c;
            d = d + 1;
            d = d + 2;
            d = d + 3;
            e = e + d;
            e = e * 2;
            e = e / 3;
            
            if (n > 500) {
                a = n;
                a = a * 2;
                a = a * 2;
                a = a * 2; 
                a = a * 2; 
                a = a * 2; 
                b = a + 100;
                b = b + 100;
                b = b + 100;
                c = b - 50;
                c = c - 50;
                c = c - 50;
                d = a + b + c;
                
                if (n > 1000) {
                    
                    e = n * n; 
                    e = e + 1;
                    e = e - 1;
                    e = e * 2;
                    e = e / 2;
                    a = e + 1000;
                    b = e - 1000;
                    c = a + b;
                    d = a - b;
                    
                    if (n > 2000) {
                        
                        a = 1;
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a * n;
                        b = a / 7;
                        c = b + 100;
                        // assertTrue();
                    }
                } else {
                    if (n > 750) {
                        int temp = n;
                        temp = temp + 1;
                        temp = temp + 1;
                        temp = temp + 1;
                        temp = temp + 1;
                        temp = temp + 1;
                        temp = temp + 1;
                        temp = temp + 1;
                        temp = temp + 1;
                        temp = temp + 1;
                        temp = temp + 1;
                        // assertTrue();
                    } else {
                        
                        int temp = n;
                        temp = temp - 1;
                        temp = temp * 2;
                        temp = temp - 1;
                        temp = temp * 2;
                        temp = temp - 1;
                        temp = temp * 2;
                        temp = temp - 1;
                        temp = temp * 2;
                        temp = temp + 10000;
                        // assertFalse();
                    }
                }
            } else {
                
                
                a = n;
                b = 10;
                c = 20;
                d = 30;
                
                a = a + b; 
                b = b + c; 
                c = c + d; 
                d = d + a; 
                
                a = a + 1;
                b = b + 1;
                c = c + 1;
                d = d + 1;
                
                a = a * 2;
                b = b * 2;
                c = c * 2;
                d = d * 2;

                if (n > 250) {
                    
                    int res = n;
                    res = res + 10;
                    res = res + 20;
                    res = res + 30;
                    res = res + 40;
                    res = res + 50;
                    // assertTrue();
                } else {
                    if (n > 125) {
                        
                        int k = n;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        // assertTrue();
                    } else {
                        int waste = 0;
                        waste = waste + 1;
                        waste = waste + 1;
                        waste = waste + 1;
                        waste = waste + 1;
                        waste = waste + 1;
                        waste = waste + n;
                        // assertFalse();
                    }
                }
            }
        } else {
            n = 20;
            int x = n;
            int y = x + 1;
            int z = y + 1;
            int w = z + 1;
            
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            n = 20; 
            
            assert n == 20;
        }
    }

    public static void tooManyBranchesV3(int n) {
        int a = 0;
        int b = 1;
        int c = n;
        int d = 10;
        int e = 50;

        a = n + 1;
        a = a + 2;
        a = a + 3;
        b = a * 2;
        c = c - 5;
        d = d * n;

        if (n > 100) {
            c = c + 1;
            c = c * 2;
            c = c - 10;
            c = c / 2;
            c = c + n;
            b = b + c;
            b = b * 3;
            b = b - 100;
            a = a + b + c;
            d = d + 1;
            d = d + 2;
            d = d + 3;
            e = e + d;
            e = e * 2;
            e = e / 3;
            c = c + 1;
            c = c * 2;
            c = c - 10;
            c = c / 2;
            c = c + n;
            b = b + c;
            b = b * 3;
            b = b - 100;
            a = a + b + c;
            d = d + 1;
            d = d + 2;
            d = d + 3;
            e = e + d;
            e = e * 2;
            e = e / 3;
            c = c + 1;
            c = c * 2;
            c = c - 10;
            c = c / 2;
            c = c + n;
            b = b + c;
            b = b * 3;
            b = b - 100;
            a = a + b + c;
            d = d + 1;
            d = d + 2;
            d = d + 3;
            e = e + d;
            e = e * 2;
            e = e / 3;
            c = c + 1;
            c = c * 2;
            c = c - 10;
            c = c / 2;
            c = c + n;
            b = b + c;
            b = b * 3;
            b = b - 100;
            a = a + b + c;
            d = d + 1;
            d = d + 2;
            d = d + 3;
            e = e + d;
            e = e * 2;
            e = e / 3;
            c = c + 1;
            c = c * 2;
            c = c - 10;
            c = c / 2;
            c = c + n;
            b = b + c;
            b = b * 3;
            b = b - 100;
            a = a + b + c;
            d = d + 1;
            d = d + 2;
            d = d + 3;
            e = e + d;
            e = e * 2;
            e = e / 3;
            
            if (n > 500) {
                a = n;
                a = a * 2;
                a = a * 2;
                a = a * 2; 
                a = a * 2; 
                a = a * 2; 
                b = a + 100;
                b = b + 100;
                b = b + 100;
                c = b - 50;
                c = c - 50;
                c = c - 50;
                d = a + b + c;
                a = n;
                a = a * 2;
                a = a * 2;
                a = a * 2; 
                a = a * 2; 
                a = a * 2; 
                b = a + 100;
                b = b + 100;
                b = b + 100;
                c = b - 50;
                c = c - 50;
                c = c - 50;
                d = a + b + c;
                a = n;
                a = a * 2;
                a = a * 2;
                a = a * 2; 
                a = a * 2; 
                a = a * 2; 
                b = a + 100;
                b = b + 100;
                b = b + 100;
                c = b - 50;
                c = c - 50;
                c = c - 50;
                d = a + b + c;
                a = n;
                a = n;
                a = a * 2;
                a = a * 2;
                a = a * 2; 
                a = a * 2; 
                a = a * 2; 
                b = a + 100;
                b = b + 100;
                b = b + 100;
                c = b - 50;
                c = c - 50;
                c = c - 50;
                d = a + b + c;
                a = a * 2;
                a = a * 2;
                a = a * 2; 
                a = a * 2; 
                a = a * 2; 
                b = a + 100;
                b = b + 100;
                b = b + 100;
                c = b - 50;
                c = c - 50;
                c = c - 50;
                d = a + b + c;
                a = n;
                a = a * 2;
                a = a * 2;
                a = a * 2; 
                a = a * 2; 
                a = a * 2; 
                b = a + 100;
                b = b + 100;
                b = b + 100;
                c = b - 50;
                c = c - 50;
                c = c - 50;
                d = a + b + c;
                
                if (n > 1000) {
                    
                    e = n * n; 
                    e = e + 1;
                    e = e - 1;
                    e = e * 2;
                    e = e / 2;
                    a = e + 1000;
                    b = e - 1000;
                    c = a + b;
                    d = a - b;
                    e = n * n; 
                    e = e + 1;
                    e = e - 1;
                    e = e * 2;
                    e = e / 2;
                    a = e + 1000;
                    b = e - 1000;
                    c = a + b;
                    d = a - b;
                    e = n * n; 
                    e = e + 1;
                    e = e - 1;
                    e = e * 2;
                    e = e / 2;
                    a = e + 1000;
                    b = e - 1000;
                    c = a + b;
                    d = a - b;
                    e = n * n; 
                    e = e + 1;
                    e = e - 1;
                    e = e * 2;
                    e = e / 2;
                    a = e + 1000;
                    b = e - 1000;
                    c = a + b;
                    d = a - b;
                    e = n * n; 
                    e = e + 1;
                    e = e - 1;
                    e = e * 2;
                    e = e / 2;
                    a = e + 1000;
                    b = e - 1000;
                    c = a + b;
                    d = a - b;
                    e = n * n; 
                    e = e + 1;
                    e = e - 1;
                    e = e * 2;
                    e = e / 2;
                    a = e + 1000;
                    b = e - 1000;
                    c = a + b;
                    d = a - b;
                    e = n * n; 
                    e = e + 1;
                    e = e - 1;
                    e = e * 2;
                    e = e / 2;
                    a = e + 1000;
                    b = e - 1000;
                    c = a + b;
                    d = a - b;
                    e = n * n; 
                    e = e + 1;
                    e = e - 1;
                    e = e * 2;
                    e = e / 2;
                    a = e + 1000;
                    b = e - 1000;
                    c = a + b;
                    d = a - b;
                    e = n * n; 
                    e = e + 1;
                    e = e - 1;
                    e = e * 2;
                    e = e / 2;
                    a = e + 1000;
                    b = e - 1000;
                    c = a + b;
                    d = a - b;
                    
                    if (n > 2000) {
                        
                        a = 1;
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a * n;
                        b = a / 7;
                        c = b + 100;
                        a = 2;
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a * n;
                        b = a / 7;
                        c = b + 100;
                        a = 3;
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a * n;
                        b = a / 7;
                        c = b + 100;
                        a = 4;
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a * n;
                        b = a / 7;
                        c = b + 100;
                        a = 5;
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a * n;
                        b = a / 7;
                        c = b + 100;
                        a = 6;
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a * n;
                        b = a / 7;
                        c = b + 100;
                        a = 7;
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a * n;
                        b = a / 7;
                        c = b + 100;
                        a = 8;
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a * n;
                        b = a / 7;
                        c = b + 100;
                        // assertTrue();
                    }
                } else {
                    if (n > 750) {
                        a = 1;
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a * n;
                        b = a / 7;
                        c = b + 100;
                        a = 2;
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a * n;
                        b = a / 7;
                        c = b + 100;
                        a = 3;
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a * n;
                        b = a / 7;
                        c = b + 100;
                        a = 4;
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a * n;
                        b = a / 7;
                        c = b + 100;
                        a = 5;
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a * n;
                        b = a / 7;
                        c = b + 100;
                        a = 6;
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a * n;
                        b = a / 7;
                        c = b + 100;
                        a = 7;
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a * n;
                        b = a / 7;
                        c = b + 100;
                        a = 8;
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a * n;
                        b = a / 7;
                        c = b + 100;
                        // assertTrue();
                    } else {
                        a = 10;
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a * n;
                        b = a / 7;
                        c = b + 100;
                        a = 20;
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a * n;
                        b = a / 7;
                        c = b + 100;
                        a = 30;
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a * n;
                        b = a / 7;
                        c = b + 100;
                        a = 40;
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a * n;
                        b = a / 7;
                        c = b + 100;
                        a = 50;
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a * n;
                        b = a / 7;
                        c = b + 100;
                        a = 6;
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a * n;
                        b = a / 7;
                        c = b + 100;
                        a = 7;
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a * n;
                        b = a / 7;
                        c = b + 100;
                        a = 8;
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a * n;
                        b = a / 7;
                        c = b + 100;
                        // assertFalse();
                    }
                }
            } else {
                
                
                a = n;
                b = 10;
                c = 20;
                d = 30;
                
                a = a + b; 
                b = b + c; 
                c = c + d; 
                d = d + a; 
                
                a = a + 1;
                b = b + 1;
                c = c + 1;
                d = d + 1;
                
                a = a * 2;
                b = b * 2;
                c = c * 2;
                d = d * 2;
                a = a + b; 
                b = b + c; 
                c = c + d; 
                d = d + a; 
                
                a = a + 1;
                b = b + 1;
                c = c + 1;
                d = d + 1;
                
                a = a * 2;
                b = b * 2;
                c = c * 2;
                d = d * 2;
                a = a + b; 
                b = b + c; 
                c = c + d; 
                d = d + a; 
                
                a = a + 1;
                b = b + 1;
                c = c + 1;
                d = d + 1;
                
                a = a * 2;
                b = b * 2;
                c = c * 2;
                d = d * 2;
                a = a + b; 
                b = b + c; 
                c = c + d; 
                d = d + a; 
                
                a = a + 1;
                b = b + 1;
                c = c + 1;
                d = d + 1;
                
                a = a * 2;
                b = b * 2;
                c = c * 2;
                d = d * 2;
                a = a + b; 
                b = b + c; 
                c = c + d; 
                d = d + a; 
                
                a = a + 1;
                b = b + 1;
                c = c + 1;
                d = d + 1;
                
                a = a * 2;
                b = b * 2;
                c = c * 2;
                d = d * 2;

                if (n > 250) {
                    
                    int res = n;
                    res = res + 10;
                    res = res + 20;
                    res = res + 30;
                    res = res + 40;
                    res = res + 50;
                    res = res + 10;
                    res = res + 20;
                    res = res + 30;
                    res = res + 40;
                    res = res + 50;
                    // assertTrue();
                } else {
                    if (n > 125) {
                        
                        int k = n;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        // assertTrue();
                    } else {
                        int waste = 0;
                        waste = waste + 1;
                        waste = waste + 1;
                        waste = waste + 1;
                        waste = waste + 1;
                        waste = waste + 1;
                        waste = waste + n;
                        // assertFalse();
                    }
                }
            }
        } else {
            n = 20;
            int x = n;
            int y = x + 1;
            int z = y + 1;
            int w = z + 1;
            
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            n = 20; 
            
            assert n == 20;
        }
    }


    public static void tooManyBranchesV4(int n) {
        int a = 0;
        int b = 1;
        int c = n;
        int d = 10;
        int e = 50;

        a = n + 1;
        a = a + 2;
        a = a + 3;
        b = a * 2;
        c = c - 5;
        d = d * n;

        if (n > 100) {
            c = c + 1;
            c = c * 2;
            c = c - 10;
            c = c / 2;
            c = c + n;
            b = b + c;
            b = b * 3;
            b = b - 100;
            a = a + b + c;
            d = d + 1;
            d = d + 2;
            d = d + 3;
            e = e + d;
            e = e * 2;
            e = e / 3;
            c = c + 1;
            c = c * 2;
            c = c - 10;
            c = c / 2;
            c = c + n;
            b = b + c;
            b = b * 3;
            b = b - 100;
            a = a + b + c;
            d = d + 1;
            d = d + 2;
            d = d + 3;
            e = e + d;
            e = e * 2;
            e = e / 3;
            c = c + 1;
            c = c * 2;
            c = c - 10;
            c = c / 2;
            c = c + n;
            b = b + c;
            b = b * 3;
            b = b - 100;
            a = a + b + c;
            d = d + 1;
            d = d + 2;
            d = d + 3;
            e = e + d;
            e = e * 2;
            e = e / 3;
            c = c + 1;
            c = c * 2;
            c = c - 10;
            c = c / 2;
            c = c + n;
            b = b + c;
            b = b * 3;
            b = b - 100;
            a = a + b + c;
            d = d + 1;
            d = d + 2;
            d = d + 3;
            e = e + d;
            e = e * 2;
            e = e / 3;
            c = c + 1;
            c = c * 2;
            c = c - 10;
            c = c / 2;
            c = c + n;
            b = b + c;
            b = b * 3;
            b = b - 100;
            a = a + b + c;
            d = d + 1;
            d = d + 2;
            d = d + 3;
            e = e + d;
            e = e * 2;
            e = e / 3;
            c = c + 1;
            c = c * 2;
            c = c - 10;
            c = c / 2;
            c = c + n;
            b = b + c;
            b = b * 3;
            b = b - 100;
            a = a + b + c;
            d = d + 1;
            d = d + 2;
            d = d + 3;
            e = e + d;
            e = e * 2;
            e = e / 3;
            c = c + 1;
            c = c * 2;
            c = c - 10;
            c = c / 2;
            c = c + n;
            b = b + c;
            b = b * 3;
            b = b - 100;
            a = a + b + c;
            d = d + 1;
            d = d + 2;
            d = d + 3;
            e = e + d;
            e = e * 2;
            e = e / 3;
            c = c + 1;
            c = c * 2;
            c = c - 10;
            c = c / 2;
            c = c + n;
            b = b + c;
            b = b * 3;
            b = b - 100;
            a = a + b + c;
            d = d + 1;
            d = d + 2;
            d = d + 3;
            e = e + d;
            e = e * 2;
            e = e / 3;
            c = c + 1;
            c = c * 2;
            c = c - 10;
            c = c / 2;
            c = c + n;
            b = b + c;
            b = b * 3;
            b = b - 100;
            a = a + b + c;
            d = d + 1;
            d = d + 2;
            d = d + 3;
            e = e + d;
            e = e * 2;
            e = e / 3;
            c = c + 1;
            c = c * 2;
            c = c - 10;
            c = c / 2;
            c = c + n;
            b = b + c;
            b = b * 3;
            b = b - 100;
            a = a + b + c;
            d = d + 1;
            d = d + 2;
            d = d + 3;
            e = e + d;
            e = e * 2;
            e = e / 3;
            c = c + 1;
            c = c * 2;
            c = c - 10;
            c = c / 2;
            c = c + n;
            b = b + c;
            b = b * 3;
            b = b - 100;
            a = a + b + c;
            d = d + 1;
            d = d + 2;
            d = d + 3;
            e = e + d;
            e = e * 2;
            e = e / 3;
            c = c + 1;
            c = c * 2;
            c = c - 10;
            c = c / 2;
            c = c + n;
            b = b + c;
            b = b * 3;
            b = b - 100;
            a = a + b + c;
            d = d + 1;
            d = d + 2;
            d = d + 3;
            e = e + d;
            e = e * 2;
            e = e / 3;
            c = c + 1;
            c = c * 2;
            c = c - 10;
            c = c / 2;
            c = c + n;
            b = b + c;
            b = b * 3;
            b = b - 100;
            a = a + b + c;
            d = d + 1;
            d = d + 2;
            d = d + 3;
            e = e + d;
            e = e * 2;
            e = e / 3;
            c = c + 1;
            c = c * 2;
            c = c - 10;
            c = c / 2;
            c = c + n;
            b = b + c;
            b = b * 3;
            b = b - 100;
            a = a + b + c;
            d = d + 1;
            d = d + 2;
            d = d + 3;
            e = e + d;
            e = e * 2;
            e = e / 3;
            c = c + 1;
            c = c * 2;
            c = c - 10;
            c = c / 2;
            c = c + n;
            b = b + c;
            b = b * 3;
            b = b - 100;
            a = a + b + c;
            d = d + 1;
            d = d + 2;
            d = d + 3;
            e = e + d;
            e = e * 2;
            e = e / 3;
            c = c + 1;
            c = c * 2;
            c = c - 10;
            c = c / 2;
            c = c + n;
            b = b + c;
            b = b * 3;
            b = b - 100;
            a = a + b + c;
            d = d + 1;
            d = d + 2;
            d = d + 3;
            e = e + d;
            e = e * 2;
            e = e / 3;
            c = c + 1;
            c = c * 2;
            c = c - 10;
            c = c / 2;
            c = c + n;
            b = b + c;
            b = b * 3;
            b = b - 100;
            a = a + b + c;
            d = d + 1;
            d = d + 2;
            d = d + 3;
            e = e + d;
            e = e * 2;
            e = e / 3;
            c = c + 1;
            c = c * 2;
            c = c - 10;
            c = c / 2;
            c = c + n;
            b = b + c;
            b = b * 3;
            b = b - 100;
            a = a + b + c;
            d = d + 1;
            d = d + 2;
            d = d + 3;
            e = e + d;
            e = e * 2;
            e = e / 3;
            c = c + 1;
            c = c * 2;
            c = c - 10;
            c = c / 2;
            c = c + n;
            b = b + c;
            b = b * 3;
            b = b - 100;
            a = a + b + c;
            d = d + 1;
            d = d + 2;
            d = d + 3;
            e = e + d;
            e = e * 2;
            e = e / 3;
            c = c + 1;
            c = c * 2;
            c = c - 10;
            c = c / 2;
            c = c + n;
            b = b + c;
            b = b * 3;
            b = b - 100;
            a = a + b + c;
            d = d + 1;
            d = d + 2;
            d = d + 3;
            e = e + d;
            e = e * 2;
            e = e / 3;
            c = c + 1;
            c = c * 2;
            c = c - 10;
            c = c / 2;
            c = c + n;
            b = b + c;
            b = b * 3;
            b = b - 100;
            a = a + b + c;
            d = d + 1;
            d = d + 2;
            d = d + 3;
            e = e + d;
            e = e * 2;
            e = e / 3;
            c = c + 1;
            c = c * 2;
            c = c - 10;
            c = c / 2;
            c = c + n;
            b = b + c;
            b = b * 3;
            b = b - 100;
            a = a + b + c;
            d = d + 1;
            d = d + 2;
            d = d + 3;
            e = e + d;
            e = e * 2;
            e = e / 3;
            c = c + 1;
            c = c * 2;
            c = c - 10;
            c = c / 2;
            c = c + n;
            b = b + c;
            b = b * 3;
            b = b - 100;
            a = a + b + c;
            d = d + 1;
            d = d + 2;
            d = d + 3;
            e = e + d;
            e = e * 2;
            e = e / 3;
            c = c + 1;
            c = c * 2;
            c = c - 10;
            c = c / 2;
            c = c + n;
            b = b + c;
            b = b * 3;
            b = b - 100;
            a = a + b + c;
            d = d + 1;
            d = d + 2;
            d = d + 3;
            e = e + d;
            e = e * 2;
            e = e / 3;
            c = c + 1;
            c = c * 2;
            c = c - 10;
            c = c / 2;
            c = c + n;
            b = b + c;
            b = b * 3;
            b = b - 100;
            a = a + b + c;
            d = d + 1;
            d = d + 2;
            d = d + 3;
            e = e + d;
            e = e * 2;
            e = e / 3;
            c = c + 1;
            c = c * 2;
            c = c - 10;
            c = c / 2;
            c = c + n;
            b = b + c;
            b = b * 3;
            b = b - 100;
            a = a + b + c;
            d = d + 1;
            d = d + 2;
            d = d + 3;
            e = e + d;
            e = e * 2;
            e = e / 3;
            c = c + 1;
            c = c * 2;
            c = c - 10;
            c = c / 2;
            c = c + n;
            b = b + c;
            b = b * 3;
            b = b - 100;
            a = a + b + c;
            d = d + 1;
            d = d + 2;
            d = d + 3;
            e = e + d;
            e = e * 2;
            e = e / 3;
            c = c + 1;
            c = c * 2;
            c = c - 10;
            c = c / 2;
            c = c + n;
            b = b + c;
            b = b * 3;
            b = b - 100;
            a = a + b + c;
            d = d + 1;
            d = d + 2;
            d = d + 3;
            e = e + d;
            e = e * 2;
            e = e / 3;
            c = c + 1;
            c = c * 2;
            c = c - 10;
            c = c / 2;
            c = c + n;
            b = b + c;
            b = b * 3;
            b = b - 100;
            a = a + b + c;
            d = d + 1;
            d = d + 2;
            d = d + 3;
            e = e + d;
            e = e * 2;
            e = e / 3;
            c = c + 1;
            c = c * 2;
            c = c - 10;
            c = c / 2;
            c = c + n;
            b = b + c;
            b = b * 3;
            b = b - 100;
            a = a + b + c;
            d = d + 1;
            d = d + 2;
            d = d + 3;
            e = e + d;
            e = e * 2;
            e = e / 3;
            c = c + 1;
            c = c * 2;
            c = c - 10;
            c = c / 2;
            c = c + n;
            b = b + c;
            b = b * 3;
            b = b - 100;
            a = a + b + c;
            d = d + 1;
            d = d + 2;
            d = d + 3;
            e = e + d;
            e = e * 2;
            e = e / 3;
            c = c + 1;
            c = c * 2;
            c = c - 10;
            c = c / 2;
            c = c + n;
            b = b + c;
            b = b * 3;
            b = b - 100;
            a = a + b + c;
            d = d + 1;
            d = d + 2;
            d = d + 3;
            e = e + d;
            e = e * 2;
            e = e / 3;
            c = c + 1;
            c = c * 2;
            c = c - 10;
            c = c / 2;
            c = c + n;
            b = b + c;
            b = b * 3;
            b = b - 100;
            a = a + b + c;
            d = d + 1;
            d = d + 2;
            d = d + 3;
            e = e + d;
            e = e * 2;
            e = e / 3;
            c = c + 1;
            c = c * 2;
            c = c - 10;
            c = c / 2;
            c = c + n;
            b = b + c;
            b = b * 3;
            b = b - 100;
            a = a + b + c;
            d = d + 1;
            d = d + 2;
            d = d + 3;
            e = e + d;
            e = e * 2;
            e = e / 3;
            c = c + 1;
            c = c * 2;
            c = c - 10;
            c = c / 2;
            c = c + n;
            b = b + c;
            b = b * 3;
            b = b - 100;
            a = a + b + c;
            d = d + 1;
            d = d + 2;
            d = d + 3;
            e = e + d;
            e = e * 2;
            e = e / 3;
            c = c + 1;
            c = c * 2;
            c = c - 10;
            c = c / 2;
            c = c + n;
            b = b + c;
            b = b * 3;
            b = b - 100;
            a = a + b + c;
            d = d + 1;
            d = d + 2;
            d = d + 3;
            e = e + d;
            e = e * 2;
            e = e / 3;
            c = c + 1;
            c = c * 2;
            c = c - 10;
            c = c / 2;
            c = c + n;
            b = b + c;
            b = b * 3;
            b = b - 100;
            a = a + b + c;
            d = d + 1;
            d = d + 2;
            d = d + 3;
            e = e + d;
            e = e * 2;
            e = e / 3;
            c = c + 1;
            c = c * 2;
            c = c - 10;
            c = c / 2;
            c = c + n;
            b = b + c;
            b = b * 3;
            b = b - 100;
            a = a + b + c;
            d = d + 1;
            d = d + 2;
            d = d + 3;
            e = e + d;
            e = e * 2;
            e = e / 3;
            c = c + 1;
            c = c * 2;
            c = c - 10;
            c = c / 2;
            c = c + n;
            b = b + c;
            b = b * 3;
            b = b - 100;
            a = a + b + c;
            d = d + 1;
            d = d + 2;
            d = d + 3;
            e = e + d;
            e = e * 2;
            e = e / 3;
            c = c + 1;
            c = c * 2;
            c = c - 10;
            c = c / 2;
            c = c + n;
            b = b + c;
            b = b * 3;
            b = b - 100;
            a = a + b + c;
            d = d + 1;
            d = d + 2;
            d = d + 3;
            e = e + d;
            e = e * 2;
            e = e / 3;
            c = c + 1;
            c = c * 2;
            c = c - 10;
            c = c / 2;
            c = c + n;
            b = b + c;
            b = b * 3;
            b = b - 100;
            a = a + b + c;
            d = d + 1;
            d = d + 2;
            d = d + 3;
            e = e + d;
            e = e * 2;
            e = e / 3;
            c = c + 1;
            c = c * 2;
            c = c - 10;
            c = c / 2;
            c = c + n;
            b = b + c;
            b = b * 3;
            b = b - 100;
            a = a + b + c;
            d = d + 1;
            d = d + 2;
            d = d + 3;
            e = e + d;
            e = e * 2;
            e = e / 3;
            c = c + 1;
            c = c * 2;
            c = c - 10;
            c = c / 2;
            c = c + n;
            b = b + c;
            b = b * 3;
            b = b - 100;
            a = a + b + c;
            d = d + 1;
            d = d + 2;
            d = d + 3;
            e = e + d;
            e = e * 2;
            e = e / 3;
            c = c + 1;
            c = c * 2;
            c = c - 10;
            c = c / 2;
            c = c + n;
            b = b + c;
            b = b * 3;
            b = b - 100;
            a = a + b + c;
            d = d + 1;
            d = d + 2;
            d = d + 3;
            e = e + d;
            e = e * 2;
            e = e / 3;
            c = c + 1;
            c = c * 2;
            c = c - 10;
            c = c / 2;
            c = c + n;
            b = b + c;
            b = b * 3;
            b = b - 100;
            a = a + b + c;
            d = d + 1;
            d = d + 2;
            d = d + 3;
            e = e + d;
            e = e * 2;
            e = e / 3;
            c = c + 1;
            c = c * 2;
            c = c - 10;
            c = c / 2;
            c = c + n;
            b = b + c;
            b = b * 3;
            b = b - 100;
            a = a + b + c;
            d = d + 1;
            d = d + 2;
            d = d + 3;
            e = e + d;
            e = e * 2;
            e = e / 3;
            c = c + 1;
            c = c * 2;
            c = c - 10;
            c = c / 2;
            c = c + n;
            b = b + c;
            b = b * 3;
            b = b - 100;
            a = a + b + c;
            d = d + 1;
            d = d + 2;
            d = d + 3;
            e = e + d;
            e = e * 2;
            e = e / 3;
            c = c + 1;
            c = c * 2;
            c = c - 10;
            c = c / 2;
            c = c + n;
            b = b + c;
            b = b * 3;
            b = b - 100;
            a = a + b + c;
            d = d + 1;
            d = d + 2;
            d = d + 3;
            e = e + d;
            e = e * 2;
            e = e / 3;
            c = c + 1;
            c = c * 2;
            c = c - 10;
            c = c / 2;
            c = c + n;
            b = b + c;
            b = b * 3;
            b = b - 100;
            a = a + b + c;
            d = d + 1;
            d = d + 2;
            d = d + 3;
            e = e + d;
            e = e * 2;
            e = e / 3;
            c = c + 1;
            c = c * 2;
            c = c - 10;
            c = c / 2;
            c = c + n;
            b = b + c;
            b = b * 3;
            b = b - 100;
            a = a + b + c;
            d = d + 1;
            d = d + 2;
            d = d + 3;
            e = e + d;
            e = e * 2;
            e = e / 3;
            c = c + 1;
            c = c * 2;
            c = c - 10;
            c = c / 2;
            c = c + n;
            b = b + c;
            b = b * 3;
            b = b - 100;
            a = a + b + c;
            d = d + 1;
            d = d + 2;
            d = d + 3;
            e = e + d;
            e = e * 2;
            e = e / 3;
            c = c + 1;
            c = c * 2;
            c = c - 10;
            c = c / 2;
            c = c + n;
            b = b + c;
            b = b * 3;
            b = b - 100;
            a = a + b + c;
            d = d + 1;
            d = d + 2;
            d = d + 3;
            e = e + d;
            e = e * 2;
            e = e / 3;
            c = c + 1;
            c = c * 2;
            c = c - 10;
            c = c / 2;
            c = c + n;
            b = b + c;
            b = b * 3;
            b = b - 100;
            a = a + b + c;
            d = d + 1;
            d = d + 2;
            d = d + 3;
            e = e + d;
            e = e * 2;
            e = e / 3;
            c = c + 1;
            c = c * 2;
            c = c - 10;
            c = c / 2;
            c = c + n;
            b = b + c;
            b = b * 3;
            b = b - 100;
            a = a + b + c;
            d = d + 1;
            d = d + 2;
            d = d + 3;
            e = e + d;
            e = e * 2;
            e = e / 3;
            c = c + 1;
            c = c * 2;
            c = c - 10;
            c = c / 2;
            c = c + n;
            b = b + c;
            b = b * 3;
            b = b - 100;
            a = a + b + c;
            d = d + 1;
            d = d + 2;
            d = d + 3;
            e = e + d;
            e = e * 2;
            e = e / 3;
            
            if (n > 500) {
                a = n;
                a = a * 2;
                a = a * 2;
                a = a * 2; 
                a = a * 2; 
                a = a * 2; 
                b = a + 100;
                b = b + 100;
                b = b + 100;
                c = b - 50;
                c = c - 50;
                c = c - 50;
                d = a + b + c;
                a = n;
                a = a * 2;
                a = a * 2;
                a = a * 2; 
                a = a * 2; 
                a = a * 2; 
                b = a + 100;
                b = b + 100;
                b = b + 100;
                c = b - 50;
                c = c - 50;
                c = c - 50;
                d = a + b + c;
                a = n;
                a = a * 2;
                a = a * 2;
                a = a * 2; 
                a = a * 2; 
                a = a * 2; 
                b = a + 100;
                b = b + 100;
                b = b + 100;
                c = b - 50;
                c = c - 50;
                c = c - 50;
                d = a + b + c;
                a = n;
                a = n;
                a = a * 2;
                a = a * 2;
                a = a * 2; 
                a = a * 2; 
                a = a * 2; 
                b = a + 100;
                b = b + 100;
                b = b + 100;
                c = b - 50;
                c = c - 50;
                c = c - 50;
                d = a + b + c;
                a = a * 2;
                a = a * 2;
                a = a * 2; 
                a = a * 2; 
                a = a * 2; 
                b = a + 100;
                b = b + 100;
                b = b + 100;
                c = b - 50;
                c = c - 50;
                c = c - 50;
                d = a + b + c;
                a = n;
                a = a * 2;
                a = a * 2;
                a = a * 2; 
                a = a * 2; 
                a = a * 2; 
                b = a + 100;
                b = b + 100;
                b = b + 100;
                c = b - 50;
                c = c - 50;
                c = c - 50;
                d = a + b + c;
                
                if (n > 1000) {
                    
                    e = n * n; 
                    e = e + 1;
                    e = e - 1;
                    e = e * 2;
                    e = e / 2;
                    a = e + 1000;
                    b = e - 1000;
                    c = a + b;
                    d = a - b;
                    e = n * n; 
                    e = e + 1;
                    e = e - 1;
                    e = e * 2;
                    e = e / 2;
                    a = e + 1000;
                    b = e - 1000;
                    c = a + b;
                    d = a - b;
                    e = n * n; 
                    e = e + 1;
                    e = e - 1;
                    e = e * 2;
                    e = e / 2;
                    a = e + 1000;
                    b = e - 1000;
                    c = a + b;
                    d = a - b;
                    e = n * n; 
                    e = e + 1;
                    e = e - 1;
                    e = e * 2;
                    e = e / 2;
                    a = e + 1000;
                    b = e - 1000;
                    c = a + b;
                    d = a - b;
                    e = n * n; 
                    e = e + 1;
                    e = e - 1;
                    e = e * 2;
                    e = e / 2;
                    a = e + 1000;
                    b = e - 1000;
                    c = a + b;
                    d = a - b;
                    e = n * n; 
                    e = e + 1;
                    e = e - 1;
                    e = e * 2;
                    e = e / 2;
                    a = e + 1000;
                    b = e - 1000;
                    c = a + b;
                    d = a - b;
                    e = n * n; 
                    e = e + 1;
                    e = e - 1;
                    e = e * 2;
                    e = e / 2;
                    a = e + 1000;
                    b = e - 1000;
                    c = a + b;
                    d = a - b;
                    e = n * n; 
                    e = e + 1;
                    e = e - 1;
                    e = e * 2;
                    e = e / 2;
                    a = e + 1000;
                    b = e - 1000;
                    c = a + b;
                    d = a - b;
                    e = n * n; 
                    e = e + 1;
                    e = e - 1;
                    e = e * 2;
                    e = e / 2;
                    a = e + 1000;
                    b = e - 1000;
                    c = a + b;
                    d = a - b;
                    
                    if (n > 2000) {
                        
                        a = 1;
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a * n;
                        b = a / 7;
                        c = b + 100;
                        a = 2;
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a * n;
                        b = a / 7;
                        c = b + 100;
                        a = 3;
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a * n;
                        b = a / 7;
                        c = b + 100;
                        a = 4;
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a * n;
                        b = a / 7;
                        c = b + 100;
                        a = 5;
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a * n;
                        b = a / 7;
                        c = b + 100;
                        a = 6;
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a * n;
                        b = a / 7;
                        c = b + 100;
                        a = 7;
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a * n;
                        b = a / 7;
                        c = b + 100;
                        a = 8;
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a * n;
                        b = a / 7;
                        c = b + 100;
                        // assertTrue();
                    }
                } else {
                    if (n > 750) {
                        a = 1;
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a * n;
                        b = a / 7;
                        c = b + 100;
                        a = 2;
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a * n;
                        b = a / 7;
                        c = b + 100;
                        a = 3;
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a * n;
                        b = a / 7;
                        c = b + 100;
                        a = 4;
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a * n;
                        b = a / 7;
                        c = b + 100;
                        a = 5;
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a * n;
                        b = a / 7;
                        c = b + 100;
                        a = 6;
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a * n;
                        b = a / 7;
                        c = b + 100;
                        a = 7;
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a * n;
                        b = a / 7;
                        c = b + 100;
                        a = 8;
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a * n;
                        b = a / 7;
                        c = b + 100;
                        // assertTrue();
                    } else {
                        a = 10;
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a * n;
                        b = a / 7;
                        c = b + 100;
                        a = 20;
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a * n;
                        b = a / 7;
                        c = b + 100;
                        a = 30;
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a * n;
                        b = a / 7;
                        c = b + 100;
                        a = 40;
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a * n;
                        b = a / 7;
                        c = b + 100;
                        a = 50;
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a * n;
                        b = a / 7;
                        c = b + 100;
                        a = 6;
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a * n;
                        b = a / 7;
                        c = b + 100;
                        a = 7;
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a * n;
                        b = a / 7;
                        c = b + 100;
                        a = 8;
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a + 1; 
                        a = a * n;
                        b = a / 7;
                        c = b + 100;
                        // assertFalse();
                    }
                }
            } else {
                
                
                a = n;
                b = 10;
                c = 20;
                d = 30;
                
                a = a + b; 
                b = b + c; 
                c = c + d; 
                d = d + a; 
                
                a = a + 1;
                b = b + 1;
                c = c + 1;
                d = d + 1;
                
                a = a * 2;
                b = b * 2;
                c = c * 2;
                d = d * 2;
                a = a + b; 
                b = b + c; 
                c = c + d; 
                d = d + a; 
                
                a = a + 1;
                b = b + 1;
                c = c + 1;
                d = d + 1;
                
                a = a * 2;
                b = b * 2;
                c = c * 2;
                d = d * 2;
                a = a + b; 
                b = b + c; 
                c = c + d; 
                d = d + a; 
                
                a = a + 1;
                b = b + 1;
                c = c + 1;
                d = d + 1;
                
                a = a * 2;
                b = b * 2;
                c = c * 2;
                d = d * 2;
                a = a + b; 
                b = b + c; 
                c = c + d; 
                d = d + a; 
                
                a = a + 1;
                b = b + 1;
                c = c + 1;
                d = d + 1;
                
                a = a * 2;
                b = b * 2;
                c = c * 2;
                d = d * 2;
                a = a + b; 
                b = b + c; 
                c = c + d; 
                d = d + a; 
                
                a = a + 1;
                b = b + 1;
                c = c + 1;
                d = d + 1;
                
                a = a * 2;
                b = b * 2;
                c = c * 2;
                d = d * 2;

                if (n > 250) {
                    int res = n;
                    res = res + 10;
                    res = res + 20;
                    res = res + 30;
                    res = res + 40;
                    res = res + 50;
                    res = res + 10;
                    res = res + 20;
                    res = res + 30;
                    res = res + 40;
                    res = res + 50;
                    res = n;
                    res = res + 10;
                    res = res + 20;
                    res = res + 30;
                    res = res + 40;
                    res = res + 50;
                    res = res + 10;
                    res = res + 20;
                    res = res + 30;
                    res = res + 40;
                    res = res + 50;
                    res = n;
                    res = res + 10;
                    res = res + 20;
                    res = res + 30;
                    res = res + 40;
                    res = res + 50;
                    res = res + 10;
                    res = res + 20;
                    res = res + 30;
                    res = res + 40;
                    res = res + 50;
                    res = n;
                    res = res + 10;
                    res = res + 20;
                    res = res + 30;
                    res = res + 40;
                    res = res + 50;
                    res = res + 10;
                    res = res + 20;
                    res = res + 30;
                    res = res + 40;
                    res = res + 50;
                    res = n;
                    res = res + 10;
                    res = res + 20;
                    res = res + 30;
                    res = res + 40;
                    res = res + 50;
                    res = res + 10;
                    res = res + 20;
                    res = res + 30;
                    res = res + 40;
                    res = res + 50;
                    res = n;
                    res = res + 10;
                    res = res + 20;
                    res = res + 30;
                    res = res + 40;
                    res = res + 50;
                    res = res + 10;
                    res = res + 20;
                    res = res + 30;
                    res = res + 40;
                    res = res + 50;
                    res = n;
                    res = res + 10;
                    res = res + 20;
                    res = res + 30;
                    res = res + 40;
                    res = res + 50;
                    res = res + 10;
                    res = res + 20;
                    res = res + 30;
                    res = res + 40;
                    res = res + 50;
                    res = n;
                    res = res + 10;
                    res = res + 20;
                    res = res + 30;
                    res = res + 40;
                    res = res + 50;
                    res = res + 10;
                    res = res + 20;
                    res = res + 30;
                    res = res + 40;
                    res = res + 50;
                    res = n;
                    res = res + 10;
                    res = res + 20;
                    res = res + 30;
                    res = res + 40;
                    res = res + 50;
                    res = res + 10;
                    res = res + 20;
                    res = res + 30;
                    res = res + 40;
                    res = res + 50;
                    res = n;
                    res = res + 10;
                    res = res + 20;
                    res = res + 30;
                    res = res + 40;
                    res = res + 50;
                    res = res + 10;
                    res = res + 20;
                    res = res + 30;
                    res = res + 40;
                    res = res + 50;
                    res = n;
                    res = res + 10;
                    res = res + 20;
                    res = res + 30;
                    res = res + 40;
                    res = res + 50;
                    res = res + 10;
                    res = res + 20;
                    res = res + 30;
                    res = res + 40;
                    res = res + 50;
                    res = n;
                    res = res + 10;
                    res = res + 20;
                    res = res + 30;
                    res = res + 40;
                    res = res + 50;
                    res = res + 10;
                    res = res + 20;
                    res = res + 30;
                    res = res + 40;
                    res = res + 50;
                    res = n;
                    res = res + 10;
                    res = res + 20;
                    res = res + 30;
                    res = res + 40;
                    res = res + 50;
                    res = res + 10;
                    res = res + 20;
                    res = res + 30;
                    res = res + 40;
                    res = res + 50;
                    res = n;
                    res = res + 10;
                    res = res + 20;
                    res = res + 30;
                    res = res + 40;
                    res = res + 50;
                    res = res + 10;
                    res = res + 20;
                    res = res + 30;
                    res = res + 40;
                    res = res + 50;
                    
                    res = n;
                    res = res + 10;
                    res = res + 20;
                    res = res + 30;
                    res = res + 40;
                    res = res + 50;
                    res = res + 10;
                    res = res + 20;
                    res = res + 30;
                    res = res + 40;
                    res = res + 50;
                    res = n;
                    res = res + 10;
                    res = res + 20;
                    res = res + 30;
                    res = res + 40;
                    res = res + 50;
                    res = res + 10;
                    res = res + 20;
                    res = res + 30;
                    res = res + 40;
                    res = res + 50;
                    res = n;
                    res = res + 10;
                    res = res + 20;
                    res = res + 30;
                    res = res + 40;
                    res = res + 50;
                    res = res + 10;
                    res = res + 20;
                    res = res + 30;
                    res = res + 40;
                    res = res + 50;
                    res = n;
                    res = res + 10;
                    res = res + 20;
                    res = res + 30;
                    res = res + 40;
                    res = res + 50;
                    res = res + 10;
                    res = res + 20;
                    res = res + 30;
                    res = res + 40;
                    res = res + 50;
                    res = n;
                    res = res + 10;
                    res = res + 20;
                    res = res + 30;
                    res = res + 40;
                    res = res + 50;
                    res = res + 10;
                    res = res + 20;
                    res = res + 30;
                    res = res + 40;
                    res = res + 50;
                    res = n;
                    res = res + 10;
                    res = res + 20;
                    res = res + 30;
                    res = res + 40;
                    res = res + 50;
                    res = res + 10;
                    res = res + 20;
                    res = res + 30;
                    res = res + 40;
                    res = res + 50;
                    res = n;
                    res = res + 10;
                    res = res + 20;
                    res = res + 30;
                    res = res + 40;
                    res = res + 50;
                    res = res + 10;
                    res = res + 20;
                    res = res + 30;
                    res = res + 40;
                    res = res + 50;
                    res = n;
                    res = res + 10;
                    res = res + 20;
                    res = res + 30;
                    res = res + 40;
                    res = res + 50;
                    res = res + 10;
                    res = res + 20;
                    res = res + 30;
                    res = res + 40;
                    res = res + 50;
                    res = n;
                    res = res + 10;
                    res = res + 20;
                    res = res + 30;
                    res = res + 40;
                    res = res + 50;
                    res = res + 10;
                    res = res + 20;
                    res = res + 30;
                    res = res + 40;
                    res = res + 50;
                    res = n;
                    res = res + 10;
                    res = res + 20;
                    res = res + 30;
                    res = res + 40;
                    res = res + 50;
                    res = res + 10;
                    res = res + 20;
                    res = res + 30;
                    res = res + 40;
                    res = res + 50;
                    res = n;
                    res = res + 10;
                    res = res + 20;
                    res = res + 30;
                    res = res + 40;
                    res = res + 50;
                    res = res + 10;
                    res = res + 20;
                    res = res + 30;
                    res = res + 40;
                    res = res + 50;
                    res = n;
                    res = res + 10;
                    res = res + 20;
                    res = res + 30;
                    res = res + 40;
                    res = res + 50;
                    res = res + 10;
                    res = res + 20;
                    res = res + 30;
                    res = res + 40;
                    res = res + 50;
                    res = n;
                    res = res + 10;
                    res = res + 20;
                    res = res + 30;
                    res = res + 40;
                    res = res + 50;
                    res = res + 10;
                    res = res + 20;
                    res = res + 30;
                    res = res + 40;
                    res = res + 50;
                    res = n;
                    res = res + 10;
                    res = res + 20;
                    res = res + 30;
                    res = res + 40;
                    res = res + 50;
                    res = res + 10;
                    res = res + 20;
                    res = res + 30;
                    res = res + 40;
                    res = res + 50;
                    res = n;
                    res = res + 10;
                    res = res + 20;
                    res = res + 30;
                    res = res + 40;
                    res = res + 50;
                    res = res + 10;
                    res = res + 20;
                    res = res + 30;
                    res = res + 40;
                    res = res + 50;
                    res = n;
                    res = res + 10;
                    res = res + 20;
                    res = res + 30;
                    res = res + 40;
                    res = res + 50;
                    res = res + 10;
                    res = res + 20;
                    res = res + 30;
                    res = res + 40;
                    res = res + 50;
                    res = n;
                    res = res + 10;
                    res = res + 20;
                    res = res + 30;
                    res = res + 40;
                    res = res + 50;
                    res = res + 10;
                    res = res + 20;
                    res = res + 30;
                    res = res + 40;
                    res = res + 50;
                    res = n;
                    res = res + 10;
                    res = res + 20;
                    res = res + 30;
                    res = res + 40;
                    res = res + 50;
                    res = res + 10;
                    res = res + 20;
                    res = res + 30;
                    res = res + 40;
                    res = res + 50;
                    res = n;
                    res = res + 10;
                    res = res + 20;
                    res = res + 30;
                    res = res + 40;
                    res = res + 50;
                    res = res + 10;
                    res = res + 20;
                    res = res + 30;
                    res = res + 40;
                    res = res + 50;
                    // assertTrue();
                } else {
                    if (n > 125) {
                        
                        int k = n;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        if (k) {
                            k = n;
                        }
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        k = k * 3;
                        k = k + 5;
                        // assertTrue();
                    } else {
                        int waste = 0;
                        waste = waste + 1;
                        waste = waste + 1;
                        waste = waste + 1;
                        waste = waste + 1;
                        waste = waste + 1;
                        waste = waste + 1;
                        waste = waste + n;
                        waste = waste + 1;
                        waste = waste + 1;
                        waste = waste + 1;
                        waste = waste + 1;
                        waste = waste + 1;
                        waste = waste + n;
                        waste = waste + 1;
                        waste = waste + 1;
                        waste = waste + 1;
                        waste = waste + 1;
                        waste = waste + 1;
                        waste = waste + n;
                        waste = waste + 1;
                        waste = waste + 1;
                        waste = waste + 1;
                        waste = waste + 1;
                        waste = waste + 1;
                        waste = waste + n;
                        waste = waste + 1;
                        waste = waste + 1;
                        waste = waste + 1;
                        waste = waste + 1;
                        waste = waste + 1;
                        waste = waste + n;
                        waste = waste + 1;
                        waste = waste + 1;
                        waste = waste + 1;
                        waste = waste + 1;
                        waste = waste + 1;
                        waste = waste + n;
                        waste = waste + 1;
                        waste = waste + 1;
                        waste = waste + 1;
                        waste = waste + 1;
                        waste = waste + 1;
                        waste = waste + n;
                        waste = waste + 1;
                        waste = waste + 1;
                        waste = waste + 1;
                        waste = waste + 1;
                        waste = waste + 1;
                        waste = waste + n;
                        waste = waste + 1;
                        waste = waste + 1;
                        if (waste) {
                            waste = n;
                        }
                        waste = waste + 1;
                        waste = waste + 1;
                        waste = waste + 1;
                        waste = waste + n;
                        waste = waste + 1;
                        waste = waste + 1;
                        waste = waste + 1;
                        waste = waste + 1;
                        waste = waste + 1;
                        waste = waste + n;
                        waste = waste + 1;
                        waste = waste + 1;
                        waste = waste + 1;
                        waste = waste + 1;
                        if (waste) {
                            waste = n;
                        }
                        waste = waste + 1;
                        waste = waste + n;
                        waste = waste + 1;
                        waste = waste + 1;
                        waste = waste + 1;
                        waste = waste + 1;
                        waste = waste + 1;
                        waste = waste + n;
                        waste = waste + 1;
                        waste = waste + 1;
                        waste = waste + 1;
                        waste = waste + 1;
                        waste = waste + 1;
                        waste = waste + n;
                        waste = waste + 1;
                        if (waste) {
                            waste = n;
                        }
                        waste = waste + 1;
                        waste = waste + 1;
                        waste = waste + 1;
                        waste = waste + 1;
                        waste = waste + n;
                        waste = waste + 1;
                        waste = waste + 1;
                        waste = waste + 1;
                        waste = waste + 1;
                        waste = waste + 1;
                        waste = waste + n;
                        waste = waste + 1;
                        waste = waste + 1;
                        waste = waste + 1;
                        waste = waste + 1;
                        waste = waste + n;

                        if (waste) {
                            waste = n;
                        }
                        // assertFalse();
                    }
                }
            }
        } else {
            n = 20;
            int x = n;
            int y = x + 1;
            int z = y + 1;
            int w = z + 1;
            
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            if (w) {
                w = n;
            }
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            n = 20; 
            
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            if (w) {
                w = n;
            }
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            n = 20; 
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            if (w) {
                w = n;
            }
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            n = 20; 
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            if (w) {
                w = n;
            }
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            n = 20; 
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            if (w) {
                w = n;
            }
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            n = 20; 
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            if (w) {
                w = n;
            }
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            n = 20; 
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            if (w) {
                w = n;
            }
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            n = 20; 
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            if (w) {
                w = n;
            }
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            n = 20; 
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            if (w) {
                w = n;
            }
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            n = 20; 
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            if (w) {
                w = n;
            }
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            n = 20; 
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            if (w) {
                w = n;
            }
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            n = 20; 
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            if (w) {
                w = n;
            }
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            n = 20; 
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            if (w) {
                w = n;
            }
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            n = 20; 
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            if (w) {
                w = n;
            }
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            n = 20; 
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            if (w) {
                w = n;
            }
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            n = 20; 
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            if (w) {
                w = n;
            }
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            n = 20; 
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            if (w) {
                w = n;
            }
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            x = x * 2;
            y = y * 2;
            z = z * 2;
            w = w * 2;
            
            x = x + y + z + w;
            n = x - (y + z + w);
            n = 20; 
            assert n == 20;
        }
    }
}
