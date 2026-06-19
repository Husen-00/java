// https://www.codechef.com/practice/course/basic-programming-concepts/DIFF500/problems/TVDISC
import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner input = new Scanner(System.in);
	    int t = input.nextInt();
	    for(int i=0; i<t; i++) {
	        int a = input.nextInt();
	        int b = input.nextInt();
	        int c = input.nextInt();
	        int d = input.nextInt();
	        int H = a-c;
	        int I = b-d;
	        if(H < I) {
	            System.out.println("First");
	        }
	        else if (I < H) {
	            System.out.println("Second");
	        }
	        else {
	            System.out.println("Any");
	        }
	        
	    }
	}
}
