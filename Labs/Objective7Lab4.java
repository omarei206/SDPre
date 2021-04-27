public class Objective7Lab4 {
  public static void main(String[] args) {
    int count = 0;
    int currentSum = 0;

    while(count <= 20){

      currentSum = count + currentSum;
      count += 1;
    }
    System.out.println(currentSum);
  }
}
