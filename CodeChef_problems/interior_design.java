//https://www.codechef.com/practice/course/basic-programming-concepts/DIFF500/problems/INTRDSGN
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner input = new Scanner (System.in);
	    int t = input.nextInt();
	    for (int i=0; i<t; i++) {
	        int x1, y1, x2, y2;
	        x1 = input.nextInt();
	        y1 = input.nextInt();
	        x2 = input.nextInt();
	        y2 = input.nextInt();
	        if(x1+y1 > x2+y2) {
	            System.out.println(x2+y2);
	        }
	        else {
	            System.out.println(x1+y1);
	        }
	    }
	}
}
