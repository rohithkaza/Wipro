import java.util.*;
public class W2_14
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number : ");
		int n=sc.nextInt();
		int c=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				c=c+1;
			}
		}
		if(c==2)
		{
			System.out.print("Prime Number");
		}
		else 
		{
			System.out.print("Non-prime number");
		}

	}

}
