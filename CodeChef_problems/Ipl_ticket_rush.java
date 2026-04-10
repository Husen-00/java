// https://www.codechef.com/practice/course/basic-programming-concepts/DIFF500/problems/IPLTRSH

import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner input = new Scanner (System.in);
	    int t = input.nextInt();
	    for(int i=0; i<t; i++) {
	        int n,m;
	        n = input.nextInt();
	        m = input.nextInt();
	        if(n>m) {
	        System.out.println(n-m);
	        }
	        else {
	            System.out.println(0);
	        }
	    }
	}
}
