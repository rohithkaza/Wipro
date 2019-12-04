import java.util.*;
public class W2_7 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.printf("Enter a character : ");
		char s=sc.next().charAt(0);
		if(s>='a'&&s<='z')
			System.out.printf("%c->%c",s,s-'a'+'A');
		else if(s>='A'&&s<='Z')
			System.out.printf("%c->%c",s,s+'a'-'A');

	}

}
