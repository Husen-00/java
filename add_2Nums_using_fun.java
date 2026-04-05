// ADD 2 numbers by using function----------->>>>

import java.util.Scanner;
public class sum {
    public static void main(String[]  args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of X: ");
        int x = input.nextInt();
        System.out.print("Enter the value of Y: ");
        int y = input.nextInt();
        int result = sum(x, y);
        System.out.println("Sum = " + result);
        input.close();
    }
    static int sum(int x, int y) {
        return x + y;
    }
}
