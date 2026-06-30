// https://www.codechef.com/practice/course/basic-programming-concepts/DIFF500/problems/AIRLINES
import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner input = new Scanner (System.in);
	    int  t = input.nextInt();
	    for(int i=0; i<t; i++) {
	        int x = input.nextInt();
	        int y = input.nextInt();
	        int z = input.nextInt();
	        if(y>x*10) {
	            System.out.println((x*10)*z);
	        }
	        else {
	            System.out.println(y*z);
	        }
	    }
	}
}
