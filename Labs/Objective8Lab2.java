public class Objective8Lab2 {
  public static void main(String[] args) {
    int count = 0;
    int total = 0;

    while(count <= 20){

      total = count + total;
      count += 1;
    }
    System.out.println(total);
  }
}
