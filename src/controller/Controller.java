package controller;

public class Controller
{
	private int array[] = {160, 3, 1719, 19, 11, 13, -21};
	
	public void start()
	{
		System.out.println(find(array));
		
	}
	
	
	
	private int find(int[] integers)
	{
		int returnMe = 0;
		int evenCount = 0;
		int oddCount = 0;
		int tempOddHolder = 0;
		int tempEvenHolder = 0;
		
		for(int i = 0; i < integers.length; i++)
		{
			if(integers[i] % 2 == 0)
			{
				oddCount++;
				tempEvenHolder = integers[i];
			}
			else
			{
				evenCount++;
				tempOddHolder = integers[i];
			}
			
		}
		
		if(evenCount > oddCount)
		{
			returnMe = tempEvenHolder;
		}
		else
		{
			returnMe = tempOddHolder;
		}
		
		
		return returnMe;
	}
	
}
