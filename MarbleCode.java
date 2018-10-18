import java.lang.Math;
public class MarbleCode {
  public static void main(String[] args) {
    double black = 0.05;
    double green = 0.25;
    double yellow = 0.5;
    double white = 1 - black - green - yellow;
    double whiteMarbles = 16;
    System.out.println(Math.round(whiteMarbles/white));
  }
}
