class Multiples
{
	public static void main(String[] args)
	{
		int sum = 0;
		
		int iterator = 999;
		
		while (iterator > 0)
		{
			if ((iterator % 3 == 0) || (iterator % 5 == 0))
			{
				sum = sum + iterator;
			}
			
			iterator --;
			
		}
		
		System.out.print(sum);
		
	}
}
