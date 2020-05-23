import java.util.Scanner;

/**
 * 
 */

/**
 * @author User
 *
 */
public class FirstJavaClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Scanner in =new Scanner(System.in);
		System.out.println("This is my main method");
		String firstName,LastName;
		System.out.println("Enter you First Name -->");
		firstName=in.next();
		in.nextLine();
		System.out.println("Enter you Last Name -->");
		LastName=in.next();
		in.nextLine();
		callingmethod();
		System.out.println("Your First Name is: "+firstName);
		System.out.println("Your Last Name is: "+LastName);
		System.out.println("The sum is : "+SumMethod(25, 45.22));
		System.out.println("------------------");
		System.out.println("-----End------");
		System.out.println("this is my first program to learn git");
	}
	public static void callingmethod()
	{
	  System.out.println("This a method called by main method");	
	}

   public static double SumMethod(int num1,double num2) 
   {
		
		return (num1+num2);
		
	}
	
}
