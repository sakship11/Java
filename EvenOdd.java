import java.util.*;
public class EvenOdd
{
	public static void main(String args[])
	{
		int x;

		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		if(x%2==0)
		{
			System.out.println("You have  Entered Even Number!");
		}
		else
		{
			System.out.println("You have entered Odd Number!");
		}
		
		
	}
}