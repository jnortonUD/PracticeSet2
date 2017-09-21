package base;

public class MyInteger {
	
	private int Integer;
	
	public MyInteger(int iValue) 
	{
		
		Integer = iValue;
	}

	public int getNumber() 
	{
		
		return Integer;
	}
	
	public boolean isPrime() 
	{
		int value = 0;
		for (value = 2; 
				value < Integer; 
				value++) 
		{
			if (Integer % value == 0)
				return false;
		}
		return true;
	
	}
	
	public boolean isEven() 
	{
		if (Integer % 2 == 0)
			return true;
		else
			return false;
	}
	
	public boolean isOdd() 
	{
		if (Integer % 2 != 0)
			return true;
		else
			return false;
	}
	
	public static boolean isEven(int Integer) 
	{
		if (Integer % 2 == 0)
			return true;
		else
			return false;
	}
	
	public static boolean isOdd(int Integer) 
	{
		if (Integer % 2 != 0)
			return true;
		else
			return false;
	}
	
	public static boolean isPrime(int Integer) 
	{
		int value = 0;
		for (value = 2; value < Integer; value++) 
		{
			if (Integer % value == 0)
				return false;
		}
		return true;
	}
	
	public static boolean isEven(MyInteger iValue) 
	{
		return MyInteger.isEven(iValue.getNumber());
	}
	
	public static boolean isOdd(MyInteger iValue) 
	{
		return MyInteger.isOdd(iValue.getNumber());
	}
	
	public static boolean isPrime(MyInteger iValue) 
	{
		return MyInteger.isPrime(iValue.getNumber());
	}
	
	public boolean isEquals(int iValue) 
	{
		return getNumber() == iValue;
	}
	
	public boolean isEquals(MyInteger iValue) 
	{
		return equals(iValue.getNumber());
	}
	

}
