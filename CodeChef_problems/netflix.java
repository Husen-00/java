// https://www.codechef.com/practice/course/basic-programming-concepts/DIFF500/problems/NETFLIX
import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner input = new Scanner(System.in);
	    int  t = input.nextInt();
	    for(int i=0; i<t; i++) {
	        int a = input.nextInt();
	        int b = input.nextInt();
	        int c = input.nextInt();
	        int x = input.nextInt();
	        if(a+b>=x) {
	            System.out.println("YES");
	        }
	        else if(a+c>=x) {
	            System.out.println("YES");
	        }
	        else if(b+c>=x) {
	            System.out.println("YES");
	        }
	        else {
	            System.out.println("NO");
	        }
	    }
	}
}
