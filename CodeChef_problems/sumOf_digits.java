// https://www.codechef.com/practice/course/basic-programming-concepts/DIFF500/problems/FLOW006
import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner input  = new Scanner (System.in);
	    int t= input.nextInt();
	    for (int i=0; i<t; i++) {
	        int n =input.nextInt();
	        int sum = 0; 
	        while (n>0) {
	            sum += (n%10);
	            n/=10;
	        }
	        System.out.println(sum);
	    }
	}
}
