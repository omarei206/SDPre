import java.util.Scanner;

public class Objective9Lab3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int selection;

    while(true) {
      printMenu();

      selection = scanner.nextInt();

      if(selection == 1){
        System.out.println("Hello World");
      }
      else if (selection == 2) {
        System.out.println("Korean BBQ, Pizza, Taco");
      }
      else if(selection == 3){
        System.out.println("Bye Bye!");
        break;
      }
      else{
        System.out.println("Please pick a number from the menu");
      }
    }

    scanner.close();
  }

  public static void printMenu() {
    System.out.println("_____Menu_____");
    System.out.println("1: Say Hello");
    System.out.println("2: List My favorite foods");
    System.out.println("3: Exit");
    System.out.println();
  }
}
