import java.util.*;
public class W2_8 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter colour code : ");
		char c=sc.next().charAt(0);
		String s;
		if(c=='R')
		{
			s="Red";
		}
		else if(c=='B')
		{
			s="Blue";
		}
		else if(c=='G')
		{
			s="Green";
		}
		else if(c=='O')
		{
			s="Orange";
		}
		else if(c=='Y')
		{
			s="Yellow";
		}
		else if(c=='W')
		{
			s="White";
		}
		else
		{
			s="Invalid colour code";
		}
		System.out.print("Colour : "+s);
	}

}
