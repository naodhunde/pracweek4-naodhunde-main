import java.util.Scanner;

public class PowerTest {

  static Scanner kb = new Scanner(System.in);

  public static void main(String[] args) {
    int base;
    int exponent;

    System.out.print("Enter a positive base: ");
    base = kb.nextInt();
    
    System.out.print("Enter a positive exponent: ");
    exponent = kb.nextInt();

    long myResult = Power_19595290.power(base, exponent);

    long mathPowerResult = (long) Math.pow(base, exponent);
    
    System.out.println("\nMy power method result: " + base + " raised to the power of " + exponent + " = "
        + Power_19595290.power(base, exponent));
    System.out.println(
        "Math.pow method result: " + base + " raised to the power of " + exponent + " = " + Math.pow(base, exponent));

    if (myResult == Math.pow(base, exponent)) {
      System.out.println("SUCCESS – it looks like you wrote the power method correctly.");
    } else {
      System.out.println(
          "Try again with smaller values of the base and exponent or something appears to be wrong with your power method.");
    }

  }
}
