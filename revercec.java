import java.util.Scanner;
public class reverce {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.ptint("Enter the number: ");
    int num = input.nextInt();
    intr ans = 0;
    while(num > 0) {
      int reminder = n % 10;
      n = n / 10;
      ans = ans *10 + reminder;
    }
    System.out.println("Reverce of the given number is " + ans );
    input.close();
  }
}
