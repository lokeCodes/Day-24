// https://www.codechef.com/problems/TODOLIST
// Question Link^^^

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-- > 0){
		    int n = s.nextInt();
		    int sum = 0;
		    for(int i =0;i<n;i++){
		        int x = s.nextInt();
		        if(x>=1000){
		            sum = sum+1;
		        }
		    }
		    System.out.println(sum);
		}
	}
}
