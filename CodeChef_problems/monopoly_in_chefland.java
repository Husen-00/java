//https://www.codechef.com/practice/course/basic-programming-concepts/DIFF500/problems/MONOPOLY
import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner input = new Scanner(System.in);
	    int t  = input.nextInt();
	    for(int i=0; i<t; i++) {
	        int r1 = input.nextInt();
	        int r2 = input.nextInt();
	        int r3 = input.nextInt();
	        if(r1 > r2+r3) {
	            System.out.println("YES");
	        }
	        else if(r2 > r1+r3) {
	            System.out.println("YES");
	        }
	        else if(r3 > r1+r2) {
	            System.out.println("YES");
	        }
	        else {
	            System.out.println("NO");
	        }
	    }
	}
}
