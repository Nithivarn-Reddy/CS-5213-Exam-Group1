package exam;


public class Exam 
{
	public static String getGreeting(String name)
	{
		return ("Hello " + name);
	}
	public static String getGoodBye(String name)
	{
		return ("Goodbye " + name);
	}

	public static void main(String [] args)
	{
		System.out.println(getGreeting("Jeff"));
	}
}
