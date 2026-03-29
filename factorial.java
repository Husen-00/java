import java.util.Scanner;
public class factorial {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int num;
    System.out.println("Enter the number: ");
    num = input.nextInt();
    int product = 1;
    for(int i=1; i<=num; i++) {
      product = product * i;
    }
    System.out.println("Factorial is = " + product);
  }
}
      
