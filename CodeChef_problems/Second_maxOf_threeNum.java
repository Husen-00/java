// https://www.codechef.com/practice/course/basic-programming-concepts/DIFF500/problems/SNDMAX
import java.util.*;
class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
                if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            
            while (n-- > 0) {
                int[] nums = new int[3];
                for (int i = 0; i < 3; i++) {
                    nums[i] = scanner.nextInt();
                }
                
                Arrays.sort(nums);
                
                System.out.println(nums[1]);
            }
        }
        scanner.close();
    }
}
