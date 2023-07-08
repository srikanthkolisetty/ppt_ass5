import java.util.Scanner;

class MyException extends RuntimeException
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2924925120665924158L;

	public MyException(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
	}
}


public class ExceptionHandling {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("enter a positive number");
		int i=scanner.nextInt();
		try
		{
			if(i<0)
			{
				throw new MyException("number should be positive");
			}
		}
			
		catch(MyException e)
		{
			e.printStackTrace();
		}
	}

}
