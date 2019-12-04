import java.util.*;
class W2_15
{
	public static void main(String[] args)
	{
		int n,sum=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		while(n>0)
		{
			int r=n%10;
			sum+=r;
			n=n/10;
		}
		System.out.println("sum is :"+sum);			
	}
}