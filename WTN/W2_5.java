class W2_5
{
	public static void main(String args[])
	{
		char s1='@';
		if(s1>='a'&&s1<='z')
			System.out.print("Alphabet");
		else if(s1>='0'&&s1<='9')
			System.out.print("Number");
		else 
			System.out.print("Special Character");
	}
}