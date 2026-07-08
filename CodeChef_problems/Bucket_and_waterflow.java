// https://www.codechef.com/practice/course/basic-programming-concepts/DIFF500/problems/WATERFLOW
import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner input = new Scanner (System.in);
	    int t= input.nextInt();
	    for (int i=0; i<t; i++) {
	        int w = input.nextInt();
	        int x = input.nextInt();
	        int y = input.nextInt();
	        int z = input.nextInt();
	        if(z*y+w>x) {
	            System.out.println("overflow");
	        }
	        else if(z*y + w == x )	 {
	            System.out.println("filled");
	        }
	        else {
	            System.out.println("Unfilled");
	        }
	    }
	}
}
