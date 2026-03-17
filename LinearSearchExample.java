import java.util.Scanner;
public class LinearSearchExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[100];
        System.out.print("Enter number of elements: ");
        int num = input.nextInt();
        System.out.println("Enter array elements:");
        for (int i = 0; i < num; i++) {
            array[i] = input.nextInt();
        }
        System.out.print("Enter the key element: ");
        int key = input.nextInt();
        int found = -1;
        for (int i = 0; i < num; i++) {
            if (key == array[i]) {
                found = i;
                break;
            }
        }
        if (found != -1) {
            System.out.println("Item found at position: " + (found + 1));
        } else {
            System.out.println("Item not found");
        }
        input.close();
    }
}
