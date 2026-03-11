import java.util.Scanner;
public class swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the 1st Number: ");
        int num1 = input .nextInt();
        System.out.print("Enter the 2nd Number: ");
        int  num2 = input.nextInt();
        System.out.println("Before swapping First number = " + num1 + " Second number = " + num2);

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("After swapping First number = " + num1 + " Second number = " + num2);
        input.close();
    }
    
}
