//Program to display reverse numbers

import java.util.*;
class Reverse
{
	public static void main(String args[])
	{
		int no, reverse=0, rem;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number:");
		no=sc.nextInt();
		while(no>0)
		{
			rem=no%10;
			reverse= reverse*10+rem;
			no=no/10;
		}
		System.out.println("Reverse No:"+reverse);
		
		
	}
}
