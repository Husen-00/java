import java.util.Scanner;
public class Square {
    public static int square(int n) {
        return n*n;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = input.nextInt();
        int result = square(n);
        System.out.println("Square = " + result );
        input.close();
    }
}
