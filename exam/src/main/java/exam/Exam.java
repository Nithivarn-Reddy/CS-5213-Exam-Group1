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

	public static int getNameLength(String name)
	{ 
		return name.length();
	}
	
	public static char getLastCharacter(String name)
	{
		return name.charAt(name.length()-1);
	}

	public static void main(String [] args)
	{
		System.out.println(getGreeting("Jeff"));
		System.out.println(getNameLength("Jeff"));
	}
}
