class fabionacci
{
	public static void main(String args[])
	{
		int a=0,b=1,c,i,count;

		count=Integer.parseInt(args[0]);
		System.out.println("Fabionacci series is->");

		for(i=2;i<count;i++)
		{
			c=a+b;
			System.out.println(" "+c);
			a=b;
			b=c;
		}
	}
}