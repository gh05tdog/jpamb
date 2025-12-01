package jpamb.cases;

import jpamb.utils.*;
import static jpamb.utils.Tag.TagType.*;

public class Arrays {

  @Case("() -> out of bounds")
  @Tag({ ARRAY })
  public static void arrayOutOfBounds() {
    int array[] = { 0, 0 };
    array[3] = 0;
  }

  @Case("() -> ok")
  @Tag({ ARRAY })
  public static void arrayInBounds() {
    int array[] = { 0, 0 };
    array[1] = 1;
  }

  @Case("() -> ok")
  @Tag({ ARRAY })
  public static void arrayLength() {
    int array[] = { 0, 0 };
    assert array.length == 2;
  }

  @Case("() -> null pointer")
  @Tag({ ARRAY })
  public static void arrayIsNull() {
    int array[] = null;
    array[1] = 10;
  }

  @Case("() -> null pointer")
  @Tag({ ARRAY })
  public static void arrayIsNullLength() {
    int array[] = null;
    assert array.length == 0;
  }

  @Case("(11) -> null pointer")
  @Case("(0) -> out of bounds")
  @Tag({ ARRAY })
  public static void arraySometimesNull(int i) {
    int array[] = null;
    if (i < 10) {
      array = new int[] { i };
    }
    array[1] = 10;
  }

  @Case("() -> assertion error")
  @Tag({ ARRAY })
  public static void arrayContent() {
    int array[] = { 1, 2, 100, -13, 23 };
    for (int i = 0; i < array.length; i++) {
      assert i > 0;
    }
  }

  @Case("(3) -> ok")
  @Case("(6) -> assertion error")
  @Tag({ ARRAY })
  public static void binarySearch(int x) {
    int arr[] = { 2, 3, 4, 10, 40 };
    int l = 0, r = arr.length - 1;
    while (l <= r) {
      int m = l + (r - l) / 2;
      if (arr[m] == x)
        return;
      if (arr[m] < x)
        l = m + 1;
      else
        r = m - 1;
    }
    assert false;
  }

  @Case("([I: ]) -> assertion error")
  @Case("([I: 1]) -> ok")
  @Tag({ ARRAY })
  public static void arrayNotEmpty(int[] array) {
    assert array.length > 0;
  }

  @Case("([C: 'h','e','l','l','o']) -> ok")
  @Case("([C: 'x']) -> assertion error")
  @Case("([C: ]) -> out of bounds")
  @Tag({ ARRAY })
  public static void arraySpellsHello(char[] array) {
    assert array[0] == 'h'
        && array[1] == 'e'
        && array[2] == 'l'
        && array[3] == 'l'
        && array[4] == 'o';
  }

    @Case("([C: 'h','e','l','l','o','w','o','r','l','d']) -> ok")
  @Case("([C: 'x']) -> assertion error")
  @Case("([C: ]) -> out of bounds")
  @Tag({ ARRAY })
  public static void arraySpellsHelloWorld(char[] array) {
    assert array[0] == 'h'
        && array[1] == 'e'
        && array[2] == 'l'
        && array[3] == 'l'
        && array[4] == 'o'
        && array[5] == 'w'
        && array[6] == 'o'
        && array[7] == 'r'
        && array[8] == 'l'
        && array[9] == 'd';
  }

  @Case("([C: 'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z']) -> ok")
  @Case("([C: 'a','b','c']) -> out of bounds")
  @Case("([C: ]) -> out of bounds")
  @Tag({ ARRAY })
  public static void arraySpellsLong200(char[] array) {
    assert array[0] == 'a' && array[1] == 'b' && array[2] == 'c' && array[3] == 'd' && array[4] == 'e'
        && array[5] == 'f' && array[6] == 'g' && array[7] == 'h' && array[8] == 'i' && array[9] == 'j'
        && array[10] == 'k' && array[11] == 'l' && array[12] == 'm' && array[13] == 'n' && array[14] == 'o'
        && array[15] == 'p' && array[16] == 'q' && array[17] == 'r' && array[18] == 's' && array[19] == 't'
        && array[20] == 'u' && array[21] == 'v' && array[22] == 'w' && array[23] == 'x' && array[24] == 'y'
        && array[25] == 'z' && array[26] == 'a' && array[27] == 'b' && array[28] == 'c' && array[29] == 'd'
        && array[30] == 'e' && array[31] == 'f' && array[32] == 'g' && array[33] == 'h' && array[34] == 'i'
        && array[35] == 'j' && array[36] == 'k' && array[37] == 'l' && array[38] == 'm' && array[39] == 'n'
        && array[40] == 'o' && array[41] == 'p' && array[42] == 'q' && array[43] == 'r' && array[44] == 's'
        && array[45] == 't' && array[46] == 'u' && array[47] == 'v' && array[48] == 'w' && array[49] == 'x'
        && array[50] == 'y' && array[51] == 'z' && array[52] == 'a' && array[53] == 'b' && array[54] == 'c'
        && array[55] == 'd' && array[56] == 'e' && array[57] == 'f' && array[58] == 'g' && array[59] == 'h'
        && array[60] == 'i' && array[61] == 'j' && array[62] == 'k' && array[63] == 'l' && array[64] == 'm'
        && array[65] == 'n' && array[66] == 'o' && array[67] == 'p' && array[68] == 'q' && array[69] == 'r'
        && array[70] == 's' && array[71] == 't' && array[72] == 'u' && array[73] == 'v' && array[74] == 'w'
        && array[75] == 'x' && array[76] == 'y' && array[77] == 'z' && array[78] == 'a' && array[79] == 'b'
        && array[80] == 'c' && array[81] == 'd' && array[82] == 'e' && array[83] == 'f' && array[84] == 'g'
        && array[85] == 'h' && array[86] == 'i' && array[87] == 'j' && array[88] == 'k' && array[89] == 'l'
        && array[90] == 'm' && array[91] == 'n' && array[92] == 'o' && array[93] == 'p' && array[94] == 'q'
        && array[95] == 'r' && array[96] == 's' && array[97] == 't' && array[98] == 'u' && array[99] == 'v'
        && array[100] == 'w' && array[101] == 'x' && array[102] == 'y' && array[103] == 'z' && array[104] == 'a'
        && array[105] == 'b' && array[106] == 'c' && array[107] == 'd' && array[108] == 'e' && array[109] == 'f'
        && array[110] == 'g' && array[111] == 'h' && array[112] == 'i' && array[113] == 'j' && array[114] == 'k'
        && array[115] == 'l' && array[116] == 'm' && array[117] == 'n' && array[118] == 'o' && array[119] == 'p'
        && array[120] == 'q' && array[121] == 'r' && array[122] == 's' && array[123] == 't' && array[124] == 'u'
        && array[125] == 'v' && array[126] == 'w' && array[127] == 'x' && array[128] == 'y' && array[129] == 'z'
        && array[130] == 'a' && array[131] == 'b' && array[132] == 'c' && array[133] == 'd' && array[134] == 'e'
        && array[135] == 'f' && array[136] == 'g' && array[137] == 'h' && array[138] == 'i' && array[139] == 'j'
        && array[140] == 'k' && array[141] == 'l' && array[142] == 'm' && array[143] == 'n' && array[144] == 'o'
        && array[145] == 'p' && array[146] == 'q' && array[147] == 'r' && array[148] == 's' && array[149] == 't'
        && array[150] == 'u' && array[151] == 'v' && array[152] == 'w' && array[153] == 'x' && array[154] == 'y'
        && array[155] == 'z' && array[156] == 'a' && array[157] == 'b' && array[158] == 'c' && array[159] == 'd'
        && array[160] == 'e' && array[161] == 'f' && array[162] == 'g' && array[163] == 'h' && array[164] == 'i'
        && array[165] == 'j' && array[166] == 'k' && array[167] == 'l' && array[168] == 'm' && array[169] == 'n'
        && array[170] == 'o' && array[171] == 'p' && array[172] == 'q' && array[173] == 'r' && array[174] == 's'
        && array[175] == 't' && array[176] == 'u' && array[177] == 'v' && array[178] == 'w' && array[179] == 'x'
        && array[180] == 'y' && array[181] == 'z' && array[182] == 'a' && array[183] == 'b' && array[184] == 'c'
        && array[185] == 'd' && array[186] == 'e' && array[187] == 'f' && array[188] == 'g' && array[189] == 'h'
        && array[190] == 'i' && array[191] == 'j' && array[192] == 'k' && array[193] == 'l' && array[194] == 'm'
        && array[195] == 'n' && array[196] == 'o' && array[197] == 'p' && array[198] == 'q' && array[199] == 'r';
  }

  @Case("([I: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) -> ok")
  @Case("([I: 1, 2, 3]) -> out of bounds")
  @Case("([I: ]) -> out of bounds")
  @Tag({ ARRAY })
  public static void arraySpell10(int[] array) {
    assert array[0] == 1
        && array[1] == 2
        && array[2] == 3
        && array[3] == 4
        && array[4] == 5
        && array[5] == 6
        && array[6] == 7
        && array[7] == 8
        && array[8] == 9
        && array[9] == 10;
  }

  @Case("([I: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]) -> ok")
  @Case("([I: 1, 2, 3, 4, 5]) -> out of bounds")
  @Case("([I: ]) -> out of bounds")
  @Tag({ ARRAY })
  public static void arraySpell20(int[] array) {
    assert array[0] == 1
        && array[1] == 2
        && array[2] == 3
        && array[3] == 4
        && array[4] == 5
        && array[5] == 6
        && array[6] == 7
        && array[7] == 8
        && array[8] == 9
        && array[9] == 10
        && array[10] == 11
        && array[11] == 12
        && array[12] == 13
        && array[13] == 14
        && array[14] == 15
        && array[15] == 16
        && array[16] == 17
        && array[17] == 18
        && array[18] == 19
        && array[19] == 20;
  }

  @Case("([I: 50, 100, 200]) -> ok")
  @Case("([I: ]) -> assertion error")
  @Tag({ ARRAY })
  public static void arraySumIsLarge(int[] array) {
    int sum = 0;
    for (int i = 0; i < array.length; i++) {
      sum += array[i];
    }
    assert sum > 300;
  }
}
