import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    String path;
    Scanner sc = new Scanner(System.in);
    System.out.printf("Enter the path that needs to be read : ");
    path = sc.nextLine();

    try {
      BufferedReader bf = new BufferedReader(new FileReader(path));
      String line;

      while ((line = bf.readLine()) != null) {
        System.out.println(line);
      }

      bf.close();
    } catch (IOException e) {
      System.out.println("The file you specified is not found !");
    } finally {
      sc.close();
    }
  }
}
