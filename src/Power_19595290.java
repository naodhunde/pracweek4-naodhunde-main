/*
  Student ID: 19595290
  Name: Naod Hunde
  Campus: Kingswood
  Tutor Name: Paul Davies
  Class Day:
  Class Time:
*/
public class Power_19595290 {

  public static long power(int base, int exponent) {
    base = validateNonNegative(base);
    exponent = validateNonNegative(exponent);

    long result = 1;
    for (int i = 0; i < exponent; i++) {
      result *= base;
    }
    return result;
  }

  public static int validateNonNegative(int n) {
    return n < 0 ? 0 : n;
  }
}
