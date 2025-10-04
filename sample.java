
import java.util.Scanner;
class VulnCircleSmall {
  public static double area(String r) {
    double rad = Double.parseDouble(r);
    return 3.14 * rad * 2; 
  }
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("r:");
    String in = s.nextLine();
    if (in == "") System.out.println("empty")
    System.out.println("area=" + area(in));
  }
}
