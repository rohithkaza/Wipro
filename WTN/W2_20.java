import java.util.*;
public class W2_20 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int x=0;
		while(x==0)
		{
			System.out.print("\n1.Add\n2.Sub\nChoice : ");
			int ch=sc.nextInt();
			System.out.print("Numbers : ");
			int a=sc.nextInt();
			int b=sc.nextInt();
			if(ch==1)
			{
				System.out.print("Sum : "+(a+b));
			}
			else
			{
				System.out.print("Sub : "+(a-b));
			}
			System.out.print("\nPress y to continue ");
			char c=sc.next().charAt(0);
			if(c!='y') 
			{
				x=1;
			}
		}

	}

}
