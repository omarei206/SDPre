import java.util.Scanner;

public class Objective5Lab4 {
  public static void main(String[] args) {

    int num;
    Scanner kb = new Scanner(System.in);

    System.out.println("Please enter a number:");
    num = kb.nextInt();

    if(num % 2 == 0) {
      System.out.println("This number is even");
    }
    else {
      System.out.println("This number is odd");
    }

    kb.close();

  }
}
