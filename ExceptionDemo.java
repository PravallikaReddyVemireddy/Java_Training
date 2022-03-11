package pr1;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			System.out.println("s1");
			System.out.println("s2");
			int a=10/0;
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception is handled");
		}
		finally
		{
			System.out.println("Finally is optional");
		}
	try
	{
		System.out.println("new try");
		int[] arr=new int[5];
		arr[4]=11;
		System.out.println(arr[4]);
	    arr[12]=23;
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Array index is only upto 4");
	}
	
	
	
	
	
	
	
	
	
	
	}

}
