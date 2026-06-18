// https://www.codechef.com/practice/course/basic-programming-concepts/DIFF500/problems/SPECIALITY
import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner input = new Scanner (System.in);
	    int t= input.nextInt();
	    for(int i=0; i<t; i++) {
	        int x= input.nextInt();
	        int y = input.nextInt();
	        int z = input.nextInt();
	        if(x> y && x>z) {
	            System.out.println("Setter");
	        }
	        else if(y>x && y>z) {
	            System.out.println("Tester");
	        }
	        else {
	            System.out.println("Editorialist");
	        }
	    }
	}
}
