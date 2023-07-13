import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    float a, b;
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number 1 : ");
    a = sc.nextFloat();

    System.out.print("Enter the number 2 : ");
    b = sc.nextFloat();

    try {
      float result = Calculate.divide(a, b);
      System.out.printf("%.0f/%.0f = %.2f\n", a, b, result);
    } catch (ArithmeticException e) {
      System.out.println("\nCannot divide by zero");
    } finally {
      sc.close();
    }
  }
}
