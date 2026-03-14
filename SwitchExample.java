import java.util.Scanner;
public class SwitchExample {
    public static void main(String[] args) {

        int num1, num2;
        float result = 0;
        char ch;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the operation to perform (+,-,*,%,/): ");
        ch = sc.next().charAt(0);

        System.out.print("Enter the first number: ");
        num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        num2 = sc.nextInt();

        switch(ch) {
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '%':
                result = num1 % num2;
                break;

            case '/':
                result = (float) num1 / num2;
                break;

            default:
                System.out.println("Invalid operation");
        }

        System.out.println("Result: " + num1 + " " + ch + " " + num2 + " = " + result);

        sc.close();
    }
}
