import java.math.*;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
class Main {
  public static List makeVertex(double sA, double sB, double sC) {
    double vA = sA; // y = a(x - k)^2 + c
    double vK = (sB/sA/2);
    double vC = sC - (Math.pow(vK, 2)) * sA;
    List<Double> list = new ArrayList<>(Arrays.asList(-1*vK, vC));
    return list;
  }
  public static void main(String[] args) {
    double a = 2;
    double b = -4;
    double c = 8;
    System.out.println("The max height is " + makeVertex(a,b, c).get(1) + " metres. ");
    System.out.println("The time elapsed is " + makeVertex(a,b, c).get(0) + " second. ");
  }
}
