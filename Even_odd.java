import java.util.Scanner;

public class Even_odd {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of test cases: ");
        int T = input.nextInt();
        for(int i=0; i<T; i++) {

        System.out.print("Enter the number: ");
        int num = input.nextInt();

        if(num % 2 == 0) {
            System.out.println("The number is: Even ");
        }
        else {
            System.out.println("The  number is: Odd ");
        }
    }
        input.close();
    }
}
