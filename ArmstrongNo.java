//Program to display Armstrong Number

import java.util.*;
class ArmstrongNo
{
	public static void main(String args[])
	{
		int no, rem, sum=0,temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Number");
		no=sc.nextInt();
		no=temp;
		while(no>0)
		{
			rem = no%10;
			sum = sum+rem*rem*rem;
			no = no/10;
			
		}
		if(no==temp)
		{
			System.out.println("Armstrong Number!!!");
		}
		else
		{
			System.out.println(" Not Armstrong Number!!!");
		}
	
	}
}