/*
  Student ID: 19595290
  Name: Naod Hunde
  Campus: Kingswood
  Tutor Name: Paul Davies
  Class Day:
  Class Time:
*/
import java.util.Scanner;

public class Temperatures_19595290 {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);

    int cFreezing = 0, cCold = 0, cMild = 0, cWarm = 0, cHot = 0, cExtreme = 0;
    double sCold = 0, sMild = 0, sWarm = 0, sHot = 0, sExtreme = 0;

    System.out.println("Enter daily max temps (-999 to finish):");

    while (true) {
      System.out.print("Enter temperature: ");
      double t = kb.nextDouble();

      if (t == -999) {   // sentinel to stop
        break;
      }

      if (t < -10 || t >= 50) {
        System.out.println("Ignored (out of valid range -10 to 49).");
        continue;
      }

      if (t < 0) {
        cFreezing++;
      } else if (t < 10) {
        cCold++; sCold += t;
      } else if (t < 20) {
        cMild++; sMild += t;
      } else if (t < 30) {
        cWarm++; sWarm += t;
      } else if (t < 40) {
        cHot++; sHot += t;
      } else {
        cExtreme++; sExtreme += t;
      }
    }

    System.out.println("\nResults:");
    System.out.println("Freezing: " + cFreezing + " days, average = N/A");
    System.out.println("Cold: " + cCold + " days, average = " + avg(cCold, sCold));
    System.out.println("Mild: " + cMild + " days, average = " + avg(cMild, sMild));
    System.out.println("Warm: " + cWarm + " days, average = " + avg(cWarm, sWarm));
    System.out.println("Hot: " + cHot + " days, average = " + avg(cHot, sHot));
    System.out.println("Extreme: " + cExtreme + " days, average = " + avg(cExtreme, sExtreme));

    kb.close();
  }

  private static String avg(int count, double sum) {
    if (count == 0) return "N/A";
    return String.format("%.1f", sum / count);
  }
}
