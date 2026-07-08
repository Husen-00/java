// https://www.codechef.com/practice/course/basic-programming-concepts/DIFF500/problems/F1RULE
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner input = new Scanner(System.in);
	    int t = input.nextInt();
	    for (int i=0; i<t; i++) {
	        int x= input.nextInt();
	        int y = input.nextInt();
	        if(100*y <= 107*x) {
	            System.out.println("YES");
	        }
	        else {
	            System.out.println("NO");
	        }
	    }
	    input.close();
	}
}
