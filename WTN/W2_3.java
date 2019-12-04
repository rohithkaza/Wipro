class W2_3
{
	public static void main(String args[])
	{
		int l=args.length;
		for(int i=0;i<l;i++)
		{
			System.out.print(args[i]+",");
		}
		if(l==0)
			System.out.print("No values");
	}
}