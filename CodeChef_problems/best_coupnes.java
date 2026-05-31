// https://www.codechef.com/practice/course/basic-programming-concepts/DIFF500/problems/CHEAPFOOD
import java.util.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // Create a scanner object to read input
        Scanner sc = new Scanner(System.in);
        
        // Read the number of test cases
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            
            while (t-- > 0) {
                // Read the bill amount X
                int x = sc.nextInt();
                
                // Calculate the 10% discount
                int discount1 = x / 10;
                
                // The flat discount is always 100
                int discount2 = 100;
                
                // Output the maximum of the two discounts
                System.out.println(Math.max(discount1, discount2));
            }
        }
        sc.close();
    }
}
