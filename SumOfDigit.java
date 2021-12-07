//Program to display Sum of Digits

import java.util.*;
class SumOfDigit
{
	public static void main(String args[])
	{
		int no, rem, sum=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("Please enter any number");
		no=sc.nextInt();
		while(no>0)
		{
			rem=no%10;
			sum=sum+rem;
			no=no/10;
		}
		System.out.println("Sum of digits="+sum);
		
	}
}

