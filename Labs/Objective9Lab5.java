import java.util.Scanner;

public class Objective9Lab5 {

  static int result;
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
      //double num1, num2;
      boolean keepGoing = true;
      int choice;

    System.out.println("Please give me a number:");
    double num1 = kb.nextDouble();

    System.out.println("Please give me another number:");
    double num2 = kb.nextDouble();

      while (keepGoing) {
        System.out.println("Which would you like to do? ");
        System.out.println();
        System.out.println("========= MENU =========");
        System.out.println("|                      |");
        System.out.println("|   1. Add Numbers     |");
        System.out.println("|   2. Find Average    |");
        System.out.println("|   3. Calculate Tax   |");
        System.out.println("|   4. Exit            |");
        System.out.println("|                      |");
        System.out.println("========================");
        System.out.println();
        choice = kb.nextInt();

        switch (choice) {
          case 1:
            System.out.println("Your sum is: " + findSum(num1, num2));
            break;
          case 2:
            System.out.println("Your average is: " + findAverage(num1, num2));
            break;
          case 3:
            System.out.println("Your tax is: " + calcTax(num1, num2));
            break;
          case 4:
            System.out.println("Bye Bye!");
            System.exit(0);
            break;
          default:
            System.out.println("Invalid entry. Please try again!");
         }

       }
       kb.close();
      }

      public static double findSum(double first, double second) {
          double result = first + second;
          return result;
      }
      public static double findAverage(double first, double second) {
          double result = (first + second) / 2;
          return result;
      }

      public static double calcTax(double first, double second) {
        double result = (first + second) * .0831;
        return result;
      }
}
