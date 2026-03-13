import java.util.Arrays;
public class reverce {
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        reverce(array);
        System.out.println(Arrays.toString(array));
    }
    static void reverce(int[] array) {
        int start = 0;
        int end = array.length-1;
        while(start<end) {
            Swap(array,start,end);
            start++;
            end--;
        }
    }
    static void Swap(int[]  array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    
    }
}
