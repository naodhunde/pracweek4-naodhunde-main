/*
  Student ID: 19595290
  Name: Naod Hunde
  Campus: Kingswood
  Tutor Name: Paul Davies
  Class Day:
  Class Time:
*/
import java.util.Scanner;

public class Rodents_19595290 {

  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);

    long population;     // >= 300
    double growthPct;    // >= 0
    int years;           // >= 10

    while (true) {
      System.out.print("Enter initial population (min 300): ");
      population = validateInt(kb.nextLong(), 300);

      System.out.print("Enter average annual growth % (>= 0): ");
      growthPct = validateFloat(kb.nextDouble(), 0.0);

      System.out.print("Enter number of years (min 10): ");
      years = (int) validateInt(kb.nextLong(), 10);

      if (population >= 300 && growthPct >= 0 && years >= 10) break;
      System.out.println("Please try again.\n");
    }

    double r = growthPct / 100.0;

    System.out.println("\nPopulation growth prediction:\n");
    System.out.printf("Year %d: Population = %d%n", 0, population);

    for (int y = 1; y <= years; y++) {
      double next = population * (1.0 + r);
      population = (long) Math.round(next); // whole animals only
      System.out.printf("Year %d: Population = %d%n", y, population);
    }

    kb.close();
  }

  public static long validateInt(long value, long min) {
    return value < min ? min : value;
  }
  public static double validateFloat(double value, double min) {
    return value < min ? min : value;
  }
}
