public class Objective3Lab3 {
  public static void main(String[] args) {
    int first = (int)(Math.random() * 7);
    int second = (int)(Math.random() * 7);
    int third = (int)(Math.random() * 7);
    int randomNum = first + second + third;

    System.out.println(first + " + " + second + " + " + third + " = " + randomNum);
  }
}
