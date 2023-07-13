public class Main {
  public static void main(String[] args) {
    int[] arr;
    arr = new int[10];

    try {
      arr[0] = 10;
      arr[9] = 22;
      arr[11] = 77;
      arr[3] = 7;
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Cannot access the the index that is not within the array");
    }
  }
}
